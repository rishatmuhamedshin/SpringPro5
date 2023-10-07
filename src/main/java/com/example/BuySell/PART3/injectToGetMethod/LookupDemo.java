package com.example.BuySell.PART3.injectToGetMethod;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class LookupDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("PART3/injectToGetMethod/app-context-xml.xml");

        DemoBean abstractBean = ctx.getBean("abstractLookupBean", DemoBean.class);
        DemoBean standardBean = ctx.getBean("standardLookupBean", DemoBean.class);

        displayInfo("abstractLookupBean",abstractBean);
        displayInfo("standardLookupBean",standardBean);

        ctx.close();
    }

    private static void displayInfo(String branName, DemoBean bean) {
        Singer singer1 = bean.getMySinger();
        Singer singer2 = bean.getMySinger();
        System.out.println(" " + branName + ": " +
                "Singer instances the Same?" +
                (singer1 == singer2));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start("lookupDemo");

        for (int i = 0; i < 100_000; i++) {
            Singer singer = bean.getMySinger();
            singer.sing();
            
        }
        stopWatch.stop();
        System.out.println("100 000 gets took  " + stopWatch.getTotalTimeMillis() + " ms");
    }


}
