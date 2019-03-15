package com.detroitlabs.comicview.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class IssueResults {
    private String aliases;
    private String apiDetailUrl;
   private String characterCredits;
    private String coverDate;
    private String deck;
    private String description;
   private String issueImages;
    private String name;
    private String siteDetailUrl;

    @JsonProperty("image")
    public String getIssueImages() {
        return issueImages;
    }

    @JsonProperty("image")
    public void setIssueImages(String issueImages) {
        this.issueImages = issueImages;
    }

    @JsonProperty("api_detail_url")
    public String getApiDetailUrl() {
        return apiDetailUrl;
    }

    @JsonProperty("api_detail_url")
    public void setApiDetailUrl(String apiDetailUrl) {
        this.apiDetailUrl = apiDetailUrl;
    }

    @JsonProperty("cover_date")
    public String getCoverDate() {
        return coverDate;
    }

    @JsonProperty("cover_date")
    public void setCoverDate(String coverDate) {
        this.coverDate = coverDate;
    }

    @JsonProperty("deck")
    public String getDeck() {
        return deck;
    }

    public void setDeck(String deck) {
        this.deck = deck;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
    public String getSiteDetailUrl() {
        return siteDetailUrl;
    }

    @JsonProperty("site_detail_url")
    public void setSiteDetailUrl(String siteDetailUrl) {
        this.siteDetailUrl = siteDetailUrl;
    }

    @Override
    public String toString() {
        return "IssueResults{" +
                "aliases='" + aliases + '\'' +
                ", apiDetailUrl='" + apiDetailUrl + '\'' +
                ", characterCredits='" + characterCredits + '\'' +
                ", coverDate='" + coverDate + '\'' +
                ", deck='" + deck + '\'' +
                ", description='" + description + '\'' +
                ", images='" + issueImages + '\'' +
                ", name='" + name + '\'' +
                ", siteDetailUrl='" + siteDetailUrl + '\'' +
                '}';
    }
}
