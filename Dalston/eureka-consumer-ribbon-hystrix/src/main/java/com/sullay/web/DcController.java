package com.sullay.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sullay.service.ConsumerService;

@RestController
public class DcController {
	 @Autowired
	    ConsumerService consumerService;
	    @GetMapping("/consumer")
	    public String dc() {
	        return consumerService.consumer();
	    }
}