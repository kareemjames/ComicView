package com.detroitlabs.comicview.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class Results {

    private String aliases;
    private String apiDetailsUrl;
    private String birth;
    private String CharacterEnemies;
    private String CharacterFriends;
   // private String creators;
    private String deck;
    private String description;
 //   private String firstAppearedInIssue;
    private String gender;
    private String id;
    private String image;
   // private String issueCredits;
  //  private String issueDiedIn;
   // private String movies;
    private String name;
   // private String origin;
   // private String powers;
   // private String publisher;
    private String realName;
   // private String teamEnemies;
   // private String teamFriends;
  //  private String teams;


    public String getAliases() {
        return aliases;
    }

    public void setAliases(String aliases) {
        this.aliases = aliases;
    }

    public String getApiDetailsUrl() {
        return apiDetailsUrl;
    }

    public void setApiDetailsUrl(String apiDetailsUrl) {
        this.apiDetailsUrl = apiDetailsUrl;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getCharacterFriends() {
        return CharacterFriends;
    }

    public void setCharacterFriends(String characterFriends) {
        CharacterFriends = characterFriends;
    }

    public String getDeck() {
        return deck;
    }

    public void setDeck(String deck) {
        this.deck = deck;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "Results{" +
                "aliases='" + aliases + '\'' +
                ", apiDetailsUrl='" + apiDetailsUrl + '\'' +
                ", birth='" + birth + '\'' +
                ", CharacterFriends='" + CharacterFriends + '\'' +
                ", deck='" + deck + '\'' +
                ", description='" + description + '\'' +
                ", gender='" + gender + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }
}
