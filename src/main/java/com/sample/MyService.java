package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author berinle
 */
@Service
@Scope("prototype")
public class MyService {
    @Autowired MyBean bean;

    public void transfer(){
        System.out.println("MyService.transfer");
        bean.someComplexLogic();
    }
}
