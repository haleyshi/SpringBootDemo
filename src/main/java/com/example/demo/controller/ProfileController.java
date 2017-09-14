/**
 * 
 */
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.WeatherService;

/**
 * @author eguoshi
 *
 */
@RestController
public class ProfileController {
	@Autowired
    private WeatherService weatherService;
	
	@RequestMapping(value = "/weather", method = RequestMethod.GET)
	public String forcast() {
		return weatherService.forcast();
	}
}
