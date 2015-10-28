package com.viajala.sebastian.interfaces.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.viajala.sebastian.domain.model.Word;
import com.viajala.sebastian.util.Sowpods;

@Controller
public class ScrabbleController {

	@Autowired
	Sowpods sowpods;
	
	@RequestMapping(value = "/rest/scrabble", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Word> getPage(@RequestParam String list) {

		List<Word> words = new ArrayList<Word>();
		List<String> wordList = sowpods.getValidWords(list);

		// Loop all the words and put them into a Word model so it can be send back as json
		for (String s : wordList) {
			if (s != null) {
				Word w = new Word(s);
				words.add(w);
			}
		}
		return words;
	}

}
