package com.example.springbootdemo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.springbootdemo.entity.Team;

@RepositoryRestResource(path="teams")
public interface TeamDao extends CrudRepository<Team, Long> {

}
