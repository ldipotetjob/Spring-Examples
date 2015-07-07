package com.ldg.spring.rest.service;

import org.springframework.stereotype.Service;

/**
 * Created by mohan.saravanan on 13/05/2014.
 */
@Service
public class StatusServiceImpl implements StatusService {

    public Boolean getStatus() {
        return true;
    }

}
