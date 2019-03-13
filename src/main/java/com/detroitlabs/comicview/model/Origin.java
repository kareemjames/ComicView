package com.detroitlabs.comicview.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Origin {

    private String api_detail_url;
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Origin{" +
                "api_detail_url='" + api_detail_url + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
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
}
