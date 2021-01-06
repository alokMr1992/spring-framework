package com.spring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDao {
	
	@Autowired
	private ComponentJdbcConnection componentJdbcConnection;

	public ComponentJdbcConnection getComponentJdbcConnection() {
		return componentJdbcConnection;
	}

	public void setComponentJdbcConnection(ComponentJdbcConnection componentJdbcConnection) {
		this.componentJdbcConnection = componentJdbcConnection;
	}
}