package com.testkit.toolkit.route.base;

import com.testkit.toolkit.constant.EnumRouteEngine;
import com.testkit.toolkit.route.RouteTimer;

import org.apache.camel.builder.RouteBuilder;

public abstract class RouteEngine extends RouteBuilder{


    public static RouteEngine getEngine(EnumRouteEngine routeType){

        RouteEngine engine = null;

        switch(routeType){
            case TIMER : 
                        engine = new RouteTimer(); 
                        break;

                        
            default : break;
        }

        return engine;
    }
     
}
