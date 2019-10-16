package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectjjj0 {

        Projectjjj0Delegate projectjjj0Delegate = new Projectjjj0Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectjjj0Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}