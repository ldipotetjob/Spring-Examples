package com.ldg.spring.rest.controller;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatusJson {

    private Boolean status;
    public StatusJson(Boolean status) {
        this.status = status;
    }

    public Boolean getStatus() {
        return status;
    }
}
