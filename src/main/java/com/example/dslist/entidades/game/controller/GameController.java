package com.example.dslist.entidades.game.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dslist.entidades.game.DTO.GameDTO;
import com.example.dslist.entidades.game.DTO.GameMinDTO;
import com.example.dslist.entidades.game.service.GameService;


// DISPONIBILIZA NOSSO ENDPOINT
@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired 
    private GameService gamerService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gamerService.findAll();
        return result;
    }

    @GetMapping(value="/{id}")
    public GameDTO findById(@PathVariable Long id){
        GameDTO result = gamerService.findById(id);
        return result;
    }
}
