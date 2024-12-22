package com.example.computerapp.web;

import com.example.computerapp.dto.ComputerDTO;
import com.example.computerapp.dao.entities.Computer;
import com.example.computerapp.mapper.ComputerMapper;
import com.example.computerapp.service.ComputerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ComputerGraphQLController {

    private final ComputerService computerService;
    private final ComputerMapper computerMapper;

    public ComputerGraphQLController(ComputerService computerService, ComputerMapper computerMapper) {
        this.computerService = computerService;
        this.computerMapper = computerMapper;
    }

    @QueryMapping
    public List<ComputerDTO> getComputerByProce(@Argument String proce) {
        return computerService.getComputersByProce(proce)
                .stream()
                .map(computerMapper::toDTO)
                .collect(Collectors.toList());
    }

    @MutationMapping
    public ComputerDTO saveComputer(@Argument ComputerDTO computerDTO) {
        Computer computer = computerMapper.toEntity(computerDTO);
        Computer savedComputer = computerService.saveComputer(computer);
        return computerMapper.toDTO(savedComputer);
    }
}
