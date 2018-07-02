package com.fifa.microservices.controller;


import com.fifa.microservices.model.Player;
import com.fifa.microservices.service.PlayerService;
import com.fifa.microservices.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (value = "/soccer")
public class PlayerServiceController {
    @Autowired
    private PlayerService playerService;

    @RequestMapping (value = "/team/{teamId}", method = RequestMethod.GET)
    Iterable<Player> getPlayersByTeam(@PathVariable Integer teamId){
        return playerService.getPlayersByTeam(teamId);
    }

    @RequestMapping (value = "player/{playerId}", method = RequestMethod.GET)
    public Player getPlayer(@PathVariable("playerId") Integer playerId) {
        return playerService.getPlayer(playerId);
    }

    @RequestMapping (value = "/save", method = RequestMethod.POST)
    public void savePlayer(@RequestBody Player player) {
        playerService.savePlayer(player);
    }

    @RequestMapping (value = "delete/{playerId}", method = RequestMethod.DELETE)
    @ResponseStatus (HttpStatus.NO_CONTENT)
    public void deletePlayer(@PathVariable("playerId") Integer playerId) {
        playerService.deletePlayer(new Player(playerId));
    }

}
