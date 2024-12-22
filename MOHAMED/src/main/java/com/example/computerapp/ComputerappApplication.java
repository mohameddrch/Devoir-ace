package com.example.computerapp;

import com.example.computerapp.dao.entities.Computer;
import com.example.computerapp.service.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ComputerappApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComputerappApplication.class, args);
    }

    @Bean
    public CommandLineRunner initDatabase(ComputerService computerService) {
        return args -> {
            computerService.saveComputer(new Computer(null, "MAC123", "Intel i5", "8GB", "512GB SSD", 700.00));
            computerService.saveComputer(new Computer(null, "MAC124", "Intel i7", "16GB", "1TB SSD", 1200.00));
            computerService.saveComputer(new Computer(null, "MAC125", "AMD Ryzen 5", "8GB", "1TB HDD", 600.00));
            computerService.saveComputer(new Computer(null, "MAC126", "AMD Ryzen 7", "16GB", "2TB SSD", 1300.00));
        };
    }
}
