package io.github.blueprint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "io.github.blueprint")
public class HelloWorld {

  public static void main(String[] args) {
    SpringApplication.run(HelloWorld.class);
  }
}
