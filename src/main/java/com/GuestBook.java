package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication

@ComponentScan({"com.repositories"})
public class GuestBook  {

    public static void main(String[] args) {
        SpringApplication.run(GuestBook.class, args)
                .registerShutdownHook();


    }

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(GuestBook.class);
//    }


}
