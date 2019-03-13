package com.detroitlabs.comicview.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class firstApperedInIssue {

    private String apiDetailsUrl;
    private String id;
    private String name;
    private String issueNumber;

    @JsonProperty("api_detail_url")
    public String getApiDetailsUrl() {
        return apiDetailsUrl;
    }

    @JsonProperty("api_detail_url")
    public void setApiDetailsUrl(String apiDetailsUrl) {
        this.apiDetailsUrl = apiDetailsUrl;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("issueNumber")
    public String getIssueNumber() {
        return issueNumber;
    }

    @JsonProperty("issueNumber")
    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return "firstApperedInIssue{" +
                "apiDetailsUrl='" + apiDetailsUrl + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", issueNumber='" + issueNumber + '\'' +
                '}';
    }
}
