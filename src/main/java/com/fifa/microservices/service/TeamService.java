package com.fifa.microservices.service;

import com.fifa.microservices.model.Player;
import com.fifa.microservices.model.Team;
import com.fifa.microservices.repository.PlayerRepository;
import com.fifa.microservices.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;

    public Iterable<Team> getAllTeam() {
        return teamRepository.findAll();
    }

    public Team getTeam(Integer teamId) {
        return teamRepository.findOne(teamId);
    }

    public void saveTeam(Team team) {
        teamRepository.save(team);
    }

    public void deleteTeam(Team team) {
        teamRepository.delete(team.getTeamId());
    }
}
