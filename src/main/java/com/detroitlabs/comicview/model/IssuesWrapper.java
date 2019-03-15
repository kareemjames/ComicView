package com.detroitlabs.comicview.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IssuesWrapper {
private List<IssueResults> results;

    @Override
    public String toString() {
        return "IssuesWrapper{" +
                "results=" + results +
                '}';
    }

@JsonProperty("results")
    public List<IssueResults> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<IssueResults> results) {
        this.results = results;
    }
}

