package com.jamannah.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyNetWorthService {
    @Value("${message:World}")
    private String msg;

    public String message() {
        return this.msg;
    }
}
