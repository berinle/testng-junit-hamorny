package com.sample;

import org.springframework.context.annotation.Scope;

/**
 * @author berinle
 */
@Scope(value = "prototype")
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
