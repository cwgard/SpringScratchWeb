package com.cw.springscratchweb.controller;

import com.cw.springscratchweb.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String hello(@RequestParam String comingOrGoing) {
        if (comingOrGoing.equals("coming")) {
            return service.hello();
        }
        return goodbye();
    }

    private String goodbye() {
        return "Goodbye from the controller";
    }

}
