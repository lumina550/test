package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-10-03T08:10:27.884Z")

@RestSchema(schemaId = "projectp1qd")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projectp1qdImpl {

    @Autowired
    private Projectp1qdDelegate userProjectp1qdDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectp1qdDelegate.helloworld(name);
    }

}
