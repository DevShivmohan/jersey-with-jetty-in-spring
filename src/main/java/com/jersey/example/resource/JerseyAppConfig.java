package com.jersey.example.resource;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyAppConfig extends ResourceConfig {
    public JerseyAppConfig(){
//        register(MyResource.class); register by class name
        packages("com.jersey.example.resource"); // register by package name that contains all resources/controllers
    }
}
