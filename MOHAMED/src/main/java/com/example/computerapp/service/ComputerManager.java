package com.example.computerapp.service;

import com.example.computerapp.dao.repositories.ComputerRepository;
import com.example.computerapp.dao.entities.Computer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerManager implements ComputerService {

    private final ComputerRepository computerRepository;

    public ComputerManager(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    @Override
    public List<Computer> getComputersByProce(String proce) {
        return computerRepository.findByProce(proce);
    }

    @Override
    public Computer saveComputer(Computer computer) {
        return computerRepository.save(computer);
    }
}
