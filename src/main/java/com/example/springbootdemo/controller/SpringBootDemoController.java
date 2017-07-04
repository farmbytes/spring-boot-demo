package com.example.springbootdemo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.springbootdemo.dao.TeamDao;
import com.example.springbootdemo.entity.Team;

@Controller
public class SpringBootDemoController {

	@Autowired
	private TeamDao dao;

	@RequestMapping(path="/services/teams")
	public @ResponseBody List<Team> findAll() {
		return dao.findAll();
	}

	@RequestMapping(path="/services/teams/{name}")
	public @ResponseBody Team findByName(@PathVariable String name) {
		return dao.findByName(name);
	}

	// Testing thymeleaf templates
	@RequestMapping(path="/services/welcome/{name}")
	public String welcomePlayer(Map model, @PathVariable String name) {
		model.put("name", name);
		return "welcome";
	}
}
