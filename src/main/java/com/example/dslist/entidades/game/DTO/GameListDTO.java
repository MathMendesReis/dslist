package com.example.dslist.entidades.game.DTO;

import com.example.dslist.entidades.game.GameList;

public class GameListDTO {

    private Long id;
	private String name;
    
    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public GameListDTO() {
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
}
