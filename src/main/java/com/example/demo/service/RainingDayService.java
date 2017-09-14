/**
 * 
 */
package com.example.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author eguoshi
 *
 */
@Service
@Profile("raining")
public class RainingDayService implements WeatherService {

	@Override
	public String forcast() {
		return "Today is raining day!";
	}

}
