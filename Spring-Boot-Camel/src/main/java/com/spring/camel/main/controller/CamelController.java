package com.spring.camel.main.controller;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.ExchangeBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.camel.main.contants.Constants;

@RestController
public class CamelController {

	@Autowired
	private ProducerTemplate producerTemplate;

	@Autowired
	private CamelContext camelContext;

	@PostMapping("/mycamel")
	public String camel(@RequestBody String req) {

		Exchange exchange = ExchangeBuilder.anExchange(camelContext).withBody(req).build();
		Exchange ex = producerTemplate.send(Constants.USER_SERVICE_ENDPOINT, exchange);
		System.out.println(ex.getIn().getBody().toString());
		return "Success";
	}

}
