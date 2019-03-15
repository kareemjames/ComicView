package com.detroitlabs.comicview.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@JsonIgnoreProperties(ignoreUnknown =  true)
@Component
public class IssueWrapper {

    private IssueResults results;


    @Override
    public String toString() {
        return "CharacterWrapper{" +
                "results='" + results + '\'' +
                '}';
    }

    @JsonProperty("results")
    public IssueResults getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(IssueResults results) {
        this.results = results;
    }
}