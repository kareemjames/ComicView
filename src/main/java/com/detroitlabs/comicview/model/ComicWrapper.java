package com.detroitlabs.comicview.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ComicWrapper {

    private List<Character> results;

    @Override
    public String toString() {
        return "ComicWrapper{" +
                "results=" + results +
                '}';
    }

    @JsonProperty("results")
    public List<Character> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Character> results) {
        this.results = results;
    }
}
