package com.awstest.ec2.s3;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class Service3 {

    @Autowired
    private Repository3 repository;

    @Transactional
    public String hello(){
        Optional<Entity3> entity =repository.findById(2L);
        String a= "text";
        entity.ifPresent(entity3 -> {
            System.out.println(entity3.getColumn1());
        });
        return entity.get().getColumn1()+entity.get().get한글();

    }
}
