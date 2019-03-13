package com.detroitlabs.comicview.controller;

import com.detroitlabs.comicview.model.Character;
import com.detroitlabs.comicview.model.CharacterWrapper;
import com.detroitlabs.comicview.model.ComicWrapper;
import com.detroitlabs.comicview.model.Results;
import com.detroitlabs.comicview.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ComicController {

    @Autowired
    ComicService comicService;

    @Autowired
    Results results;

    @Autowired
    CharacterWrapper characterWrapper;


    @ResponseBody
    @RequestMapping("/")
    public String displayAllCharacters(ModelMap modelMap) {
        ComicWrapper cw = comicService.fetchAllData();
        List<Character> allCharacters = cw.getResults();
        modelMap.put("allCharacters", allCharacters);
        return "index";
    }

    @RequestMapping("search")
    public String searchByCharacterName(@RequestParam("q") String searchValue, ModelMap modelMap) {
        comicService.setSearchName(searchValue);
        ComicWrapper cw = comicService.fetchbyName();
        List<Character> allCharacters = cw.getResults();
        modelMap.put("allCharacters", allCharacters);
        return"index";
    }

    @RequestMapping("/character")
    @ResponseBody
    public String searchByCharacter() {
        CharacterWrapper characterWrapper = comicService.fetchSingleCharacterById();
        Results searchCharacter = characterWrapper.getResults();
        return searchCharacter.toString();
    }


}
