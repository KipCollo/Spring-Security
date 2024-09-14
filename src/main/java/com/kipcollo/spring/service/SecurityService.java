package com.kipcollo.spring.service;

import com.kipcollo.spring.repository.SecurityRepo;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class SecurityService {


    private SecurityRepo repo;
}
