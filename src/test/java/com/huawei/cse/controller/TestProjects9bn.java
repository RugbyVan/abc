package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjects9bn {

        Projects9bnDelegate projects9bnDelegate = new Projects9bnDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projects9bnDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}