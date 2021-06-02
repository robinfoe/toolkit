package com.testkit.toolkit.factory;

import javax.inject.Singleton;

import org.apache.camel.CamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Singleton
public class ToolkitFactory {

    @Autowired
    private CamelContext camelContext;

    public CamelContext getCamelContext(){
        return this.camelContext;
    }
    
    
}
