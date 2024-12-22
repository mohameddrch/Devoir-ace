package com.example.computerapp.dao.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String macAddress;
    private String proce;
    private String ram;
    private String hardDrive;
    private double price;

    public Computer(Long id, String macAddress, String proce, String ram, String hardDrive, double price) {
        this.id = id;
        this.macAddress = macAddress;
        this.proce = proce;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.price = price;
    }

    public Computer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getProce() {
        return proce;
    }

    public void setProce(String proce) {
        this.proce = proce;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}