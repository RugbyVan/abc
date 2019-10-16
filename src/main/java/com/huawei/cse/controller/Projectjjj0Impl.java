package com.huawei.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-10-16T07:52:15.565Z")

@RestSchema(schemaId = "projectjjj0")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Projectjjj0Impl {

    @Autowired
    private Projectjjj0Delegate userProjectjjj0Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectjjj0Delegate.helloworld(name);
    }

}
