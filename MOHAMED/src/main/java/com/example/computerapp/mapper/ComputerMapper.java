package com.example.computerapp.mapper;

import com.example.computerapp.dto.ComputerDTO;
import com.example.computerapp.dao.entities.Computer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    public ComputerDTO toDTO(Computer computer) {
        return modelMapper.map(computer, ComputerDTO.class);
    }

    public Computer toEntity(ComputerDTO computerDTO) {
        return modelMapper.map(computerDTO, Computer.class);
    }
}
