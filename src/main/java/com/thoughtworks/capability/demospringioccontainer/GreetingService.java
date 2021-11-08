package com.thoughtworks.capability.demospringioccontainer;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements ApplicationContextAware {

    private Foo foo;
    private Bar bar;

    String sayHi() {
        foo.hi();
        bar.hi();
        return "hello world";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        foo = applicationContext.getBean(Foo.class);
        bar = applicationContext.getBean(Bar.class);
    }
}
