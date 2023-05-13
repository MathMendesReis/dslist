package com.example.dslist.entidades.game.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dslist.entidades.game.GameList;
import com.example.dslist.entidades.game.DTO.GameListDTO;
import com.example.dslist.entidades.game.repositores.GameListRepository;

import jakarta.transaction.Transactional;

@Component
public class GameListService {
    @Autowired
    private GameListRepository GameListRepository;
    
    @Transactional
    public List<GameListDTO>findAll(){
        //FIND ALL E UM METODO QUE RETORNA TODO PEGA TODOS OS DADOS DO BD
        List<GameList> result = GameListRepository.findAll();
        // CONVERTENDO PARA O MODELO GameListDTO
        return result.stream().map(x -> new GameListDTO(x)).toList();
        
    }
}
