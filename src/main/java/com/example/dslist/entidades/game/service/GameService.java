package com.example.dslist.entidades.game.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dslist.entidades.game.Game;
import com.example.dslist.entidades.game.DTO.GameMinDTO;
import com.example.dslist.entidades.game.repositores.GameRepository;

@Component
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO>findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}