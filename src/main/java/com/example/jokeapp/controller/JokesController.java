package com.example.jokeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.jokeapp.service.JokeService;

@Controller
public class JokesController {

	@Autowired
	private JokeService jokeService;
	
	@GetMapping
	public String getJoke(Model model) {
		model.addAttribute("joke", jokeService.getChuckNorrisQuote());
		return "index";
	}
}
