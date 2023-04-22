package com.cw.springscratchweb.controller;

import com.cw.springscratchweb.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        return service.hello();
    }

}
