package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class GreetingService {

    String sayHi() {
        return "hello world" + LocalTime.now();
    }
}
