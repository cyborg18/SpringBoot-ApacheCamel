package com.spring.camel.main.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		String res=exchange.getIn().getBody().toString().concat(" --> transformed in Processor");
		System.out.println(res);
	}

}
