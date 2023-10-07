package com.example.BuySell.PART3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("renderer")
public class StandardOutMessageRender implements MessageRender{
    private MessageProvider messageProvider;

    @Override
    public void render() {
        if(messageProvider == null){
            throw  new RuntimeException("You must set the" +
                    "property messageProvider of class" +
                    StandardOutMessageRender.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    @Autowired
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
