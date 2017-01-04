package com.zf.demo.service.impl;

import com.zf.demo.service.TestService;

public abstract class AbstractTestService implements TestService {

    protected void before() {
        System.out.println("before");
    }

    protected void after() {
        System.out.println("after");
    }

    public String result() {
        return "hello word";
    }

    public String result(String one) {
        return "hello word:" + one;
    }

    public void result(String one, String two) {
        System.out.println("hello word:" + one + ":" + two);
    }

}
