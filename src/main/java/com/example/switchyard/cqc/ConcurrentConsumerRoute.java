package com.example.switchyard.cqc;

import org.apache.camel.builder.RouteBuilder;

public class ConcurrentConsumerRoute extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		from("switchyard://ConcurrentConsumerService")
				.delay(6000)
				.log("Received message for 'ConcurrentConsumerService' after a short delay : ${body}")
				.end();
	}

}
