package com.example.BuySell.PART3.injectToGetMethod;

public abstract class AbstractLookupDemoBean implements DemoBean{

    public abstract Singer getMySinger();

    @Override
    public void doSomething() {
        getMySinger().sing();
    }
}
