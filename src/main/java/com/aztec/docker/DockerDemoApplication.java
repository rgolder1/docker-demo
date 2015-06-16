package com.aztec.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Application demoing Spring Boot with Docker.
 *
 * @author robertgolder
 */
@SpringBootApplication
@RestController
public class DockerDemoApplication {

    @RequestMapping("/")
    public String home() {
        return "Aztec Docker Demo Application";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerDemoApplication.class, args);
    }
}
