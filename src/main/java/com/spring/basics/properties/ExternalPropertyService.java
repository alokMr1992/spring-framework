package com.spring.basics.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalPropertyService {
	
	@Value("${external.system.url}")
	private String url;

	public String getUrl() {
		return url;
	}
}