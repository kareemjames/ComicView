package com.detroitlabs.comicview.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CharacterOrigin {

    private String apiDetailsUrl;
    private String id;
    private String name;

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

    @Override
    public String toString() {
        return "CharacterOrigin{" +
                "apiDetailsUrl='" + apiDetailsUrl + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
