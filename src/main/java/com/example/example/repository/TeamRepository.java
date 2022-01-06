package com.example.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.example.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
    
}
