package com.cw.springscratchweb.controller;

import com.cw.springscratchweb.service.Service;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
public class Controller {

    private final Service service;
    private Logger logger;

    public Controller(Logger logger, Service service) {
        this.logger = logger;
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

    public String hello() {
        return "Hello from the controller";
    }

    @ExceptionHandler
    private Exception handle(Exception e) {
        System.out.println("Whoops: " + e.getMessage());
        logger.info("Whoops from the logger!");
        return e;
    }

}
