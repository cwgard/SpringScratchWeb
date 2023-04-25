package com.cw.springscratchweb.controller;

import com.cw.springscratchweb.service.Service;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping(value = "/hello")
    @ResponseBody
    public String hello(@RequestParam String comingOrGoing) throws Exception {
        if (comingOrGoing != null) {
            if (comingOrGoing.equals("coming")) {
                return hello();
            } else if (comingOrGoing.equals("going")) {
                return service.goodbye();
            }
        }
        if (comingOrGoing == null) {
            throw new Exception("comingOrGoing is null. Must be 'coming' or 'going'.");
        }
        throw new Exception("comingOrGoing must be 'coming' or 'going'.");
    }

    private String hello() {
        return "Hello from the controller";
    }

    @ExceptionHandler
    private Exception handle(Exception e) {
        System.out.println("Whoops: " + e.getMessage());
        return e;
    }

}
