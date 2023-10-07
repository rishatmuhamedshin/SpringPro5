package com.example.BuySell.PART3.injectToGetMethod;

public class StandardLookupDemoBean implements DemoBean{

    private Singer singer;

    public void setSigner(Singer signer) {
        this.singer = signer;
    }

    @Override
    public Singer getMySinger() {
        return this.singer;
    }

    @Override
    public void doSomething() {
        singer.sing();
    }
}
