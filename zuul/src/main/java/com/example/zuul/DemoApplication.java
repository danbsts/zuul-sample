package com.example.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
public class DemoApplication {

	@Bean
	public ZuulFilter addResponseHeaderFilter() {
		return new ZuulFilter() {
			@Override
			public boolean shouldFilter() {
				return true;
			}

			@Override
			public Object run() throws ZuulException {
				return null;
			}

			@Override
			public String filterType() {
				return "post";
			}

			@Override
			public int filterOrder() {
				return 999;
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
