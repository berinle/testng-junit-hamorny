package com.sample;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author berinle
 */
@Scope(value = "prototype")
@Component
public class MyBean {

    public MyBean() {
        System.out.println("MyBean.MyBean");
    }

    public void someComplexLogic(){
        System.out.println(" doing some complex work load ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
