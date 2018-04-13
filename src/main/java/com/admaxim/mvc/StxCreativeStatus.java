package com.admaxim.mvc;


import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@Async
public class StxCreativeStatus {


    @Scheduled(fixedRate = 1000)
    public void scheduleStatusCreativeCheck() {

        System.out.println(
                "Fixed rate task - " + System.currentTimeMillis() / 1000);
    }

}
