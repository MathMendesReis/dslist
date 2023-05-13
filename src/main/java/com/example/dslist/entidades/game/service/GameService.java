package com.example.dslist.entidades.game.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dslist.entidades.game.Game;
import com.example.dslist.entidades.game.DTO.GameDTO;
import com.example.dslist.entidades.game.DTO.GameMinDTO;
import com.example.dslist.entidades.game.interfaces.GameMinProjection;
import com.example.dslist.entidades.game.repositores.GameRepository;

import jakarta.transaction.Transactional;


// IMPLEMENTA REGRAS DE NEGOCIOS
@Component
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }
    
    public List<GameMinDTO>findAll(){
        //FIND ALL E UM METODO QUE RETORNA TODO PEGA TODOS OS DADOS DO BD
        List<Game> result = gameRepository.findAll();
        // CONVERTENDO PARA O MODELO GAMEMINDTO
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
    @Transactional
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
   ;
	
}