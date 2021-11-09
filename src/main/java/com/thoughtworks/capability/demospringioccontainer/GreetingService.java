package com.thoughtworks.capability.demospringioccontainer;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GreetingService {

    private final Foo foo;
    private final Bar bar;

    String sayHi() {
        foo.hi();
        bar.hi();
        return "hello world";
    }
}
