package com.zhbit.controller;

import com.zhbit.entity.Student;
import com.zhbit.fegin.FeginProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeginHandler {

    @Autowired
    private FeginProviderClient feginProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feginProviderClient.findAll();
    }


}
