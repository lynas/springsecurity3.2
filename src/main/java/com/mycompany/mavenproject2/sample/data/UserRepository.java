package com.mycompany.mavenproject2.sample.data;

import org.springframework.stereotype.Service;

@Service
public interface UserRepository{

    User findByEmail(String email);
}