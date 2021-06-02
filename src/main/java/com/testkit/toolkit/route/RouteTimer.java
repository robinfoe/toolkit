package com.testkit.toolkit.route;

import com.testkit.toolkit.route.base.RouteEngine;


public class RouteTimer extends RouteEngine{

   
    @Override
    public void configure() throws Exception {
        from("timer:foo")
            .to("log:test");
    }

    
}