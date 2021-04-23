package com.hopelesscoder.Api.gateway;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @GetMapping("userServiceFallback")
    public String userServiceFallback(){
        return "User Service is taking longer than expected to respond. Please try later";
    }

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallback(){
        return "Department Service is taking longer than expected to respond. Please try later";
    }

}
