package com.dag.webservice.config;

import com.dag.webservice.rest.Resource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        registerEndpoints();
    }
    private void registerEndpoints() {
        register(Resource.class);
    }
}