package com.ldg.spring.rest.service;

import org.springframework.stereotype.Service;

@Service
public class StatusServiceImpl implements StatusService {

    public Boolean getStatus() {
        return true;
    }

}
