package com.detroitlabs.comicview.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.awt.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Character {

    private String aliases;
    private String api_detail_url;
    private String birth;
    private String count_of_issue_appearances;
    private String date_added;
    private String date_last_updated;
    private String deck;
    private String description;
    private FirstAppearedInModel firstAppearedIn;
    private int gender;
    private int id;
    private ImagesModel images;
    private String name;
    //private Origin origin;
    //private Publisher publisher;
    private String real_name;
    private String site_detail_url;

    @Override
    public String toString() {
        return "Character{" +
                "aliases='" + aliases + '\'' +
                ", api_detail_url='" + api_detail_url + '\'' +
                ", birth='" + birth + '\'' +
                ", count_of_issue_appearances='" + count_of_issue_appearances + '\'' +
                ", date_added='" + date_added + '\'' +
                ", date_last_updated='" + date_last_updated + '\'' +
                ", deck='" + deck + '\'' +
                ", description='" + description + '\'' +
               // ", firstAppearedIn=" + firstAppearedIn +
                ", gender=" + gender +
                ", id=" + id +
               // ", images=" + images +
                ", name='" + name + '\'' +
               // ", origin=" + origin +
               // ", publisher=" + publisher +
                ", real_name='" + real_name + '\'' +
                ", site_detail_url='" + site_detail_url + '\'' +
                '}';
    }

    @JsonProperty("aliases")
    public String getAliases() {
        return aliases;
    }

    @JsonProperty("aliases")
    public void setAliases(String aliases) {
        this.aliases = aliases;
    }

    @JsonProperty("api_detail_url")
    public String getApi_detail_url() {
        return api_detail_url;
    }

    @JsonProperty("api_detail_url")
    public void setApi_detail_url(String api_detail_url) {
        this.api_detail_url = api_detail_url;
    }

    @JsonProperty("birth")
    public String getBirth() {
        return birth;
    }

    @JsonProperty("birth")
    public void setBirth(String birth) {
        this.birth = birth;
    }

    @JsonProperty("count_of_issue_appearances")
    public String getCount_of_issue_appearances() {
        return count_of_issue_appearances;
    }

    @JsonProperty("count_of_issue_appearances")
    public void setCount_of_issue_appearances(String count_of_issue_appearances) {
        this.count_of_issue_appearances = count_of_issue_appearances;
    }

    @JsonProperty("date_added")
    public String getDate_added() {
        return date_added;
    }

    @JsonProperty("date_added")
    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    @JsonProperty("date_last_updated")
    public String getDate_last_updated() {
        return date_last_updated;
    }

    @JsonProperty("date_last_updated")
    public void setDate_last_updated(String date_last_updated) {
        this.date_last_updated = date_last_updated;
    }

    @JsonProperty("deck")
    public String getDeck() {
        return deck;
    }

    @JsonProperty("deck")
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

    @JsonProperty("first_appeared_in_issue")
    public FirstAppearedInModel getFirstAppearedIn() {
        return firstAppearedIn;
    }

    @JsonProperty("first_appeared_in_issue")
    public void setFirstAppearedIn(FirstAppearedInModel firstAppearedIn) {
        this.firstAppearedIn = firstAppearedIn;
    }

    @JsonProperty("gender")
    public int getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(int gender) {
        this.gender = gender;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("image")
    public ImagesModel getImages() {
        return images;
    }

    @JsonProperty("image")
    public void setImages(ImagesModel images) {
        this.images = images;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

//    @JsonProperty("origin")
//    public Origin getOrigin() {
//        return origin;
//    }
//
//    @JsonProperty("origin")
//    public void setOrigin(Origin origin) {
//        this.origin = origin;
//    }
//
//    @JsonProperty("publisher")
//    public Publisher getPublisher() {
//        return publisher;
//    }
//
//    @JsonProperty("publisher")
//    public void setPublisher(Publisher publisher) {
//        this.publisher = publisher;
//    }

    @JsonProperty("real_name")
    public String getReal_name() {
        return real_name;
    }

    @JsonProperty("real_name")
    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    @JsonProperty("site_detail_url")
    public String getSite_detail_url() {
        return site_detail_url;
    }

    @JsonProperty("site_detail_url")
    public void setSite_detail_url(String site_detail_url) {
        this.site_detail_url = site_detail_url;
    }
}
