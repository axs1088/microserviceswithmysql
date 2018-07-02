package com.fifa.microservices.repository;

import com.fifa.microservices.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TeamRepository extends CrudRepository<Team, Integer> {

}
