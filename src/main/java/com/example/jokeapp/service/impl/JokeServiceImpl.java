package com.example.jokeapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jokeapp.service.JokeService;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

	private ChuckNorrisQuotes chuckNorrisQuotes;
	
	public JokeServiceImpl() {
		this.chuckNorrisQuotes=new ChuckNorrisQuotes();
	}
	
	@Override
	public String getChuckNorrisQuote() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
