package com.vkku.springClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class CentralController {

    String propertyVal;
    String devProp;

    CentralController(@Value("${central:test}") String propertyVal, @Value("${access:dev}") String devProp){
        this.propertyVal = propertyVal;
        this.devProp = devProp;
    }

    /*@Value("${access:dev}")
    public String devProp;*/

    @GetMapping("/central")
    public String getCentralConfig(){
        return this.propertyVal;
    }

    @GetMapping("/bonus")
    public String getCentralDevConfig(){
        return devProp;
    }


}
