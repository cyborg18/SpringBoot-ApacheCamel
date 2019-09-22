package com.spring.camel.main.bean;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.builder.ExchangeBuilder;

public class MyBean {

	private CamelContext context;

	public void transform(Exchange req) {
		String res = req.getIn().getBody(String.class).concat(" --> transformed in Bean");
		req = ExchangeBuilder.anExchange(context).withBody(res).build();
		System.out.println(res);
	}

}
