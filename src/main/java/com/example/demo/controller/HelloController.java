/**
 * 
 */
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.properties.AuthorProperties;

/**
 * @author eguoshi
 *
 */

@RestController
public class HelloController {

	@Value("${nickName}")
	private String nickName;

	@Value("${whoami}")
	private String whoami;

	@Autowired
	private AuthorProperties author;

	@RequestMapping(value = "/hello1", method = RequestMethod.GET)
	public String say1() {
		return nickName;
	}

	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
	public String say2() {
		return whoami;
	}

	@RequestMapping(value = "/hello3", method = RequestMethod.GET)
	public String say3() {
		return author.toString();
	}

	// /app/hello4/20
	@RequestMapping(value = "/hello4/{age}", method = RequestMethod.GET)
	public String say4(@PathVariable("age") Integer age) {
		author.setAge(age);
		return author.toString();
	}

	// /app/candy/hello5
	@RequestMapping(value = "/{name}/hello5", method = RequestMethod.GET)
	public String say5(@PathVariable("name") String name) {
		author.setName(name);
		return author.toString();
	}

	// /app/hello6?age=10
	@RequestMapping(value = "/hello6", method = RequestMethod.GET)
	public String say6(@RequestParam("age") Integer age) {
		author.setAge(age);
		return author.toString();
	}

	@RequestMapping(value = "/hello7", method = RequestMethod.GET)
	public String say7(@RequestParam(value = "age", required = false, defaultValue = "30") Integer age) {
		author.setAge(age);
		return author.toString();
	}
	
	@GetMapping(value = "/hello8")
	public String say8() {
		return whoami;
	}

}
