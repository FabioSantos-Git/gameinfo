package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.services.GameListService;

public interface GameRepository extends JpaRepository<Game, Long>{ //(Camada de acesso a dados)-Faz a consulta no banco de dados 

}
