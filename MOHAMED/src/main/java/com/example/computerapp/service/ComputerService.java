package com.example.computerapp.service;

import com.example.computerapp.dao.entities.Computer;

import java.util.List;

public interface ComputerService {
    List<Computer> getComputersByProce(String proce);
    Computer saveComputer(Computer computer);
}
