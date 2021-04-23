package com.hopelesscoder.UserService.service;

import com.hopelesscoder.UserService.VO.Department;
import com.hopelesscoder.UserService.VO.ResponseTemplateVO;
import com.hopelesscoder.UserService.entity.User;
import com.hopelesscoder.UserService.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    private UserRepository userRepository;
    private RestTemplate restTemplate;

    public UserService(UserRepository userRepository,  RestTemplate restTemplate) {
        this.userRepository = userRepository;
        this.restTemplate = restTemplate;
    }
    public User saveUser(User user){
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId){

        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();

        User user =  userRepository.findUserByUserId(userId);

        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(), Department.class);

        responseTemplateVO.setUser(user);
        responseTemplateVO.setDepartment(department);

        return responseTemplateVO;
    }
}
