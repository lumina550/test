package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectp1qd {

        Projectp1qdDelegate projectp1qdDelegate = new Projectp1qdDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectp1qdDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}