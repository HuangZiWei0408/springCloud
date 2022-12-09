package com.zhbit.fegin.Impl;

import com.zhbit.entity.Student;
import com.zhbit.fegin.FeginProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeginError implements FeginProviderClient {
    public Collection<Student> findAll() {
        return null;
    }
}
