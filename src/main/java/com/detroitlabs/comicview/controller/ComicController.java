package com.detroitlabs.comicview.controller;

import com.detroitlabs.comicview.model.Character;
import com.detroitlabs.comicview.model.ComicWrapper;
import com.detroitlabs.comicview.model.Results;
import com.detroitlabs.comicview.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ComicController {

    @Autowired
    ComicService comicService;

    @Autowired
    Results results;


    @ResponseBody
    @RequestMapping("/")
    public String displayAllCharacters() {
        ComicWrapper cw = comicService.fetchAllData();
        List<Character> allCharacters = cw.getResults();
        return allCharacters.toString();
    }

    @RequestMapping("")
    public String searchByCharacter(@RequestParam("q") String searchValue, ModelMap modelMap) {
        comicService.setSearchCharacter(searchValue);
        ComicWrapper comicWrapper = comicService.fetchCharacterData();
        List<Character> searchCharacter = comicWrapper.getResults();
        modelMap.put("searchCharacter", searchCharacter);
        return "index";
    }


}
