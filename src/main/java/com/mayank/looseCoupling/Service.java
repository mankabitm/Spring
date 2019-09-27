package com.mayank.looseCoupling;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Service {

	@Value("${external.url}")
	private String url;
	public String message() {
		return url;
	}
}
