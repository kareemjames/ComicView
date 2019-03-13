package com.detroitlabs.comicview.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FirstAppearedIn {

    private String api_detail_url;
    private int id;
    private String name;
    private String issue_number;

    @Override
    public String toString() {
        return "FirstAppearedIn{" +
                "api_detail_url='" + api_detail_url + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", issue_number='" + issue_number + '\'' +
                '}';
    }

    @JsonProperty("api_detail_url")
    public String getApi_detail_url() {
        return api_detail_url;
    }

    @JsonProperty("api_detail_url")
    public void setApi_detail_url(String api_detail_url) {
        this.api_detail_url = api_detail_url;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
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

    @JsonProperty("site_detail_url")
    public String getIssue_number() {
        return issue_number;
    }

    @JsonProperty("site_detail_url")
    public void setIssue_number(String issue_number) {
        this.issue_number = issue_number;
    }
}
