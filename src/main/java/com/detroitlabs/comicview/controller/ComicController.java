package com.detroitlabs.comicview.controller;

import com.detroitlabs.comicview.model.*;
import com.detroitlabs.comicview.model.Character;
import com.detroitlabs.comicview.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class ComicController {

    @Autowired
    ComicService comicService;

    @Autowired
    Results results;
    @Autowired
    IssueResults issueResults;

    @Autowired
    CharacterWrapper characterWrapper;


    @RequestMapping("/")
    public String displayAllCharacters(ModelMap modelMap) {
        ComicWrapper cw = comicService.fetchAllData();
        List<Character> allCharacters = cw.getResults();
        Collections.shuffle(allCharacters);
        modelMap.put("allCharacters", allCharacters);

        List<Character> carousel = new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            carousel.add(allCharacters.get(i));
        }
        modelMap.put("carousel", carousel);

        return "index";
    }

    @RequestMapping("/allissues")
    public String displayAllIssues(ModelMap modelMap){
        IssuesWrapper issuesWrapper = comicService.DisplayAllIssueData();
        List<IssueResults> allIssues = issuesWrapper.getResults();
        modelMap.put("allIssues", allIssues);
        return "allissues";
    }


    @RequestMapping("search")
    public String searchByCharacterName(@RequestParam("q") String searchValue, ModelMap modelMap) {
        comicService.setSearchName(searchValue);
        ComicWrapper cw = comicService.fetchbyName();
        List<Character> allCharacters = cw.getResults();
        modelMap.put("allCharacters", allCharacters);

        List<Character> carousel = new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            if (allCharacters.size() == 0) {
                Character noResultsCharacter = new Character();
                Images noResultsImage = new Images();
                noResultsCharacter.setName("No Results");
                noResultsCharacter.setDate_added("No Results");
                noResultsImage.setSmall_url("/images/blank.png");
                noResultsCharacter.setImages(noResultsImage);
                carousel.add(noResultsCharacter);
            } else if (allCharacters.size() <= 2) {
                carousel.add(allCharacters.get(0));
            } else {
                carousel.add(allCharacters.get(i));
            }
        }
        modelMap.put("carousel", carousel);

        return "index";
    }

    @RequestMapping("/character/{characterId}")
    public String searchByCharacter(@PathVariable String characterId, ModelMap modelMap) {
        comicService.setSearchCharacter(characterId);
        CharacterWrapper characterWrapper = comicService.fetchSingleCharacterById();
        Character searchCharacter = characterWrapper.getResults();
        modelMap.put("searchCharacter", searchCharacter);

        IssuesWrapper issuesWrapper = comicService.DisplayAllIssueData();
        List<IssueResults> allIssues = issuesWrapper.getResults();
        modelMap.put("allIssues", allIssues);
        return "single";
    }

    @RequestMapping("/issues")
    @ResponseBody
    public String displayIssueById(){
        IssueWrapper issueWrapper = comicService.DisplayByIssue();
        IssueResults results = issueWrapper.getResults();
return results.toString();
    }


}
