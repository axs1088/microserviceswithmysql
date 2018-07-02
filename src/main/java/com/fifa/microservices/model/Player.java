package com.fifa.microservices.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "player")
public class Player implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column (name = "player_id", unique=true, nullable = false)
    private Integer playerId;

    @ManyToOne
    @JoinColumn (name = "team_id", nullable = false)
    private Team team;

    @Column (name = "name", nullable = false)
    private String name;

    @Column (name = "shirt_number", nullable = false)
    private String shirtNumber;

    @Column (name = "position", nullable = false)
    private String position;

    public Player(){
        super();
    }

    public Player(final Integer playerId) {
        this.playerId = playerId;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(String shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
