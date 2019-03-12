package com.detroitlabs.comicview.service;

import com.detroitlabs.comicview.model.ComicWrapper;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ComicService {

    public ComicWrapper fetchAllData() {

        RestTemplate restTemplate = new RestTemplate();
        String fetchAllCharactersUrl = "https://www.comicvine.com/api/characters?api_key=b51063865068ff4df9ab54f6c8b0282c8c9705c8&format=json";

        return restTemplate.getForObject(fetchAllCharactersUrl, ComicWrapper.class);
    }

}
