package com.zhbit.fegin;

import com.zhbit.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider")
public interface FeginProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();
}
