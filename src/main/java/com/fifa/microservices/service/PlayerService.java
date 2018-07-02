package com.fifa.microservices.service;

import com.fifa.microservices.model.Player;
import com.fifa.microservices.model.Team;
import com.fifa.microservices.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getPlayersByTeam(Integer teamId) {
        return playerRepository.findByTeam(new Team(teamId));
    }
    public Player getPlayer(Integer playerId) {
        return playerRepository.findOne(playerId);
    }
    public void savePlayer(Player player) {
        playerRepository.save(player);
    }

    public void deletePlayer(Player player) {
        playerRepository.delete(player.getPlayerId());
    }


}
