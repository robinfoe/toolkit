package com.testkit.toolkit.listener;

import com.testkit.toolkit.constant.EnumRouteEngine;
import com.testkit.toolkit.factory.ToolkitFactory;
import com.testkit.toolkit.route.RouteTimer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ToolkitBootListener {

    private static final Logger log = LoggerFactory.getLogger(ToolkitBootListener.class);

    public static int counter;

    @Autowired
    ToolkitFactory toolkit;

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info("Increment counter");

        if(toolkit.getCamelContext() != null){
            log.info("@@@ Camel context exist");

            try{

                //TODO :: and get fromp properties .... 
                toolkit.getCamelContext().addRoutes(RouteTimer.getEngine(EnumRouteEngine.TIMER));

            }catch(Exception e){
                e.printStackTrace();
            }
        }

        counter++;
    }
    
}

