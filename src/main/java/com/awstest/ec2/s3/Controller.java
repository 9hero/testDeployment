package com.awstest.ec2.s3;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private Service3 service3;

    @GetMapping("/hello")
    public String hello(){
        String hello = service3.hello();
        return hello;
    }
}
