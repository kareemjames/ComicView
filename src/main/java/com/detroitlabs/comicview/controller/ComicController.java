package com.detroitlabs.comicview.controller;

import com.detroitlabs.comicview.model.Character;
import com.detroitlabs.comicview.model.ComicWrapper;
import com.detroitlabs.comicview.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ComicController {

    @Autowired
    ComicService comicService;

    @RequestMapping("/")
    public String displayAllCharacters(ModelMap modelMap) {
        ComicWrapper cw = comicService.fetchAllData();
        List<Character> allCharacters = cw.getResults();
        modelMap.put("allCharacters", allCharacters);
        return "index";
    }

//    @RequestMapping("/single/{id}")
//    public String displaySingleCharacter(@PathVariable int id) {
//
//        return "single";
//    }

}
