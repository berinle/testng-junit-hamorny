package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author berinle
 */
@Scope("prototype")
@Service
public class MyService {
    @Autowired MyBean bean;

    public MyService(){
        System.out.println("MyService.MyService");
    }

    public void transfer(){
        System.out.println("MyService.transfer");
        bean.someComplexLogic();
    }
}
