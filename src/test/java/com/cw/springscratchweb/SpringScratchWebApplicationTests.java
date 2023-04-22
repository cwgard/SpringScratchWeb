package com.cw.springscratchweb;

import com.cw.springscratchweb.controller.Controller;
import com.cw.springscratchweb.service.Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class SpringScratchWebApplicationTests {

	@Autowired
	private Controller controller;

	@MockBean
	private Service service;

	@Test
	void contextLoads() {
		System.out.println(controller.getClass());
		System.out.println(controller.toString());
		System.out.println(service.getClass());
		System.out.println(service.toString());
	}
}
