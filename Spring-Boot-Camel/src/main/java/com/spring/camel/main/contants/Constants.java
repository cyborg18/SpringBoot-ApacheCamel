package com.spring.camel.main.contants;

public final class Constants {
	public static final String USER_SERVICE_ENDPOINT = "direct:hello";
	public static final String USER_ROUTE_ID = "HelloRoute";
	public static final String QUEUE_READER_ROUTE_ID = "QueueReaderRoute";
	public static final String REDELIVERY_COUNT_HEADER_NAME = "redeliveryCount";
	
	private Constants() {
		
	}
}
