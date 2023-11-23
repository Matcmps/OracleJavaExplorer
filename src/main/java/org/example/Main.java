package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(Main.class);
    app.run();
  }

  @Override
  public void run(String... args) {
    System.out.println("Hello world!");
  }


}