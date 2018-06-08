package com.m2i.web.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/services/rest")
public class MyRestApplicationConfig extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		final Set<Class<?>> classes = new HashSet<Class<?>>(); 
		  classes.add(RestServiceDevise.class);
		//classes.add(RestServiceXyz.class);
		return classes;
	}

}
