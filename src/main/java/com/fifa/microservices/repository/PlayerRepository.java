package com.fifa.microservices.repository;

import com.fifa.microservices.model.Player;
import com.fifa.microservices.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {

    public  List<Player> findByTeam(Team team);
}
