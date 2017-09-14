package com.example.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"sunny", "default"})
public class SunnyDayService implements WeatherService {

	@Override
	public String forcast() {
		return "Today is sunny day!";
	}

}
