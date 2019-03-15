package com.detroitlabs.comicview.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class CharacterWrapper {

    private Character results;

    @Override
    public String toString() {
        return "CharacterWrapper{" +
                "results='" + results + '\'' +
                '}';
    }

    @JsonProperty("results")
    public Character getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(Character results) {
        this.results = results;
    }


}
