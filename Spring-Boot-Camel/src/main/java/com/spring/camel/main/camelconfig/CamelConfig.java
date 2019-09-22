package com.spring.camel.main.camelconfig;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.annotation.Configuration;

import com.spring.camel.main.bean.MyBean;
import com.spring.camel.main.contants.Constants;
import com.spring.camel.main.processor.MyProcessor;

@Configuration
public class CamelConfig extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from(Constants.USER_SERVICE_ENDPOINT).process(new MyProcessor()).bean(new MyBean(), "transform");
	}

}
