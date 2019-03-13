package com.detroitlabs.comicview.service;

import com.detroitlabs.comicview.model.ComicWrapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ComicService {

    private String searchName;

    public ComicWrapper fetchAllData() {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("user-agent", "spring");
        HttpEntity entity = new HttpEntity(headers);
        String fetchAllCharactersUrl = "https://www.comicvine.com/api/characters?api_key=b51063865068ff4df9ab54f6c8b0282c8c9705c8&format=json&limit=25";
        ResponseEntity<ComicWrapper> response = restTemplate.exchange(fetchAllCharactersUrl, HttpMethod.GET, entity, ComicWrapper.class);
        return response.getBody();
    }

    public ComicWrapper fetchbyName() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("user-agent", "spring");
        HttpEntity entity = new HttpEntity(headers);
        String fetchCharacterByName = "https://www.comicvine.com/api/characters?api_key=b51063865068ff4df9ab54f6c8b0282c8c9705c8&filter=name:" + searchName + "&format=json&limit=25";
        ResponseEntity<ComicWrapper> response = restTemplate.exchange(fetchCharacterByName, HttpMethod.GET, entity, ComicWrapper.class);
        return response.getBody();
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }
}
