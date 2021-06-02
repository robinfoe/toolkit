package com.testkit.toolkit.constant;

public enum EnumRouteEngine {

    TIMER("TMR");


    private final String code;
    public String getCode(){return this.code;}

    private EnumRouteEngine(String  code){
        this.code = code;
    }

    public static EnumRouteEngine getByCode(String code){
        for(EnumRouteEngine item : EnumRouteEngine.values()){
            if(item.getCode().equalsIgnoreCase(code)){
                return item;
            }
        }

        return null;
    }
    
}
