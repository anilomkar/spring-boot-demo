package com.omkar.springdockerdemo;

import org.apache.logging.log4j.util.Strings;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
@RequestMapping("/test")
public class TestService {

    @RequestMapping("/hello")
    public String hello() throws Exception {
        String hostname = "NotFound";
        String temp = InetAddress.getLocalHost().getHostName();
        if(Strings.isNotEmpty(temp)) {
            hostname = temp;
        }
        String instanceId = System.getProperty("docker.instance.id");

        if (instanceId != null && !instanceId.isEmpty()) {
            hostname = instanceId;
        }
        return "<h1>SpringBoot with Docker running from - " + hostname + "</h1>";
    }
}