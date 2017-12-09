package com.jamannah.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.jamannah.service.MyNetWorthService;
import org.springframework.stereotype.Component;

@Component
@Path("/hello")
public class MyNetWorthRestController {

    private final MyNetWorthService service;

    public MyNetWorthRestController(MyNetWorthService service) {
        this.service = service;
    }

    @GET
    public String message() {
        return "Hello " + this.service.message();
    }

}