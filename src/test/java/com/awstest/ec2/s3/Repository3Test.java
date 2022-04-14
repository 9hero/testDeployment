package com.awstest.ec2.s3;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Repository3Test {

    @Autowired
    Repository3 repository3;
    @Test
    void helo(){
        System.out.println(repository3.findById(1L).get().getColumn1());
    }
}