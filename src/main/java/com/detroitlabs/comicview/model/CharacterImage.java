package com.detroitlabs.comicview.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CharacterImage {

    private String iconUrl;
    private String mediumUrl;
    private String screenUrl;
    private String screenLargeUrl;
    private String smallUrl;
    private String superUrl;
    private String thumbUrl;
    private String tinyUrl;
    private String originalUrl;
    private String imageTags;

    @JsonProperty("icon_url")
    public String getIconUrl() {
        return iconUrl;
    }

    @JsonProperty("icon_url")
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @JsonProperty("medium_url")
    public String getMediumUrl() {
        return mediumUrl;
    }

    @JsonProperty("medium_url")
    public void setMediumUrl(String mediumUrl) {
        this.mediumUrl = mediumUrl;
    }

    @JsonProperty("screen_url")
    public String getScreenUrl() {
        return screenUrl;
    }

    @JsonProperty("screen_url")
    public void setScreenUrl(String screenUrl) {
        this.screenUrl = screenUrl;
    }

    @JsonProperty("screen_large_url")
    public String getScreenLargeUrl() {
        return screenLargeUrl;
    }

    @JsonProperty("screen_large_url")
    public void setScreenLargeUrl(String screenLargeUrl) {
        this.screenLargeUrl = screenLargeUrl;
    }

    @JsonProperty("small_url")
    public String getSmallUrl() {
        return smallUrl;
    }

    @JsonProperty("small_url")
    public void setSmallUrl(String smallUrl) {
        this.smallUrl = smallUrl;
    }

    @JsonProperty("super_url")
    public String getSuperUrl() {
        return superUrl;
    }

    @JsonProperty("super_url")
    public void setSuperUrl(String superUrl) {
        this.superUrl = superUrl;
    }

    @JsonProperty("thumb_url")
    public String getThumbUrl() {
        return thumbUrl;
    }

    @JsonProperty("thumb_url")
    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    @JsonProperty("tiny_url")
    public String getTinyUrl() {
        return tinyUrl;
    }

    @JsonProperty("tiny_url")
    public void setTinyUrl(String tinyUrl) {
        this.tinyUrl = tinyUrl;
    }

    @JsonProperty("original_url")
    public String getOriginalUrl() {
        return originalUrl;
    }

    @JsonProperty("original_url")
    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    @JsonProperty("image_tags")
    public String getImageTags() {
        return imageTags;
    }

    @JsonProperty("image_tags")
    public void setImageTags(String imageTags) {
        this.imageTags = imageTags;
    }

    @Override
    public String toString() {
        return "CharacterImage{" +
                "iconUrl='" + iconUrl + '\'' +
                ", mediumUrl='" + mediumUrl + '\'' +
                ", screenUrl='" + screenUrl + '\'' +
                ", screenLargeUrl='" + screenLargeUrl + '\'' +
                ", smallUrl='" + smallUrl + '\'' +
                ", superUrl='" + superUrl + '\'' +
                ", thumbUrl='" + thumbUrl + '\'' +
                ", tinyUrl='" + tinyUrl + '\'' +
                ", originalUrl='" + originalUrl + '\'' +
                ", imageTags='" + imageTags + '\'' +
                '}';
    }
}
