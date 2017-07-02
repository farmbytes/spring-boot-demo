package com.example.springbootdemo;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.example.springbootdemo.dao.TeamDao;
import com.example.springbootdemo.entity.Player;
import com.example.springbootdemo.entity.Team;

@SpringBootApplication
public class SpringBootDemoApplication extends SpringBootServletInitializer {

	/***
	 * used when run as JAR
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	/***
	 * used when run as WAR
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringBootDemoApplication.class);
	}

	@Autowired
	TeamDao dao;
	
	@PostConstruct
	public void init(){
		Set<Player> players = new HashSet<>();
		players.add(new Player("Sachin", "opener"));
		players.add(new Player("Saurav", "opener"));
		
		Team team1 = new Team ("Mumbai", "MI", players);
		dao.save(team1);
		players.clear();

		players.add(new Player("Dhoni", "opener"));
		players.add(new Player("Virat", "opener"));
		Team team2 = new Team("Pune", "PW", players);
		dao.save(team2);
	}
}
