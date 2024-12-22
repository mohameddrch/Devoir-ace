package com.example.computerapp.dao.repositories;


import com.example.computerapp.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
    List<Computer> findByProce(String proce);
}
