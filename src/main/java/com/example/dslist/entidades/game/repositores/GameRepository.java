package com.example.dslist.entidades.game.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dslist.entidades.game.Game;


// ACESSA O BANCO DE DADO
// JpaRepository JA TEM TODAS AS OPERAÇÕES BASICAS DE CONSULTAS SQL
public interface GameRepository extends JpaRepository<Game, Long> {
    
}
