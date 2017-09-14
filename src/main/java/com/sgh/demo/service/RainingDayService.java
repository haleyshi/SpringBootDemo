/**
 * 
 */
package com.sgh.demo.service;

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
	public String forecast() {
		return "Today is raining day!";
	}

}
