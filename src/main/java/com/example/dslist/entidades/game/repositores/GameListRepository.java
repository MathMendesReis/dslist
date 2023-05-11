package com.example.dslist.entidades.game.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dslist.entidades.game.GameList;


// CAMADA DE ACESSO AO BANCO DE DADO
// JpaRepository JA TEM TODAS AS OPERAÇÕES BASICAS DE CONSULTAS SQL
public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}

