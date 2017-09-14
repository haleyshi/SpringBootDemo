/**
 * 
 */
package com.sgh.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sgh.demo.properties.AuthorProperties;

/**
 * @author eguoshi
 *
 */
@RestController
@RequestMapping(value = "/json")
public class JsonController {
	@Autowired
	private AuthorProperties author;

	// use "/app/json/hi" to access, multiple URL mapping
	@RequestMapping(value = { "/author", "/hi", "/hello" }, method = RequestMethod.GET)
	public String say() {
		return author.toJsonString();
	}
}
