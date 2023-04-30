package com.cw.springscratchweb.controller;

import com.cw.springscratchweb.service.Service;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ControllerTest {

    Logger logger;
    Service service;

    @Test
    void hello() {
        Controller controller = new Controller(logger, service);
        String helloReturnValue = controller.hello();
        assertEquals(helloReturnValue, "Hello from the controller");
    }
}