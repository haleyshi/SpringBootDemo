package com.sgh.demo.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sgh.demo.service.WeatherService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {
	@Autowired
	WeatherService weatherService;
	
	@Test
	public void testDefaultProfile() throws Exception {
		String output = weatherService.forecast();
		assertThat(output).contains("Today is sunny day!");
	}
}
