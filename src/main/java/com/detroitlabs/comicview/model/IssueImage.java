package com.detroitlabs.comicview.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class IssueImage {
    private String iconUrl;
    private String medium_url;
    private String screenUrl;
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
    public String getMedium_url() {
        return medium_url;
    }

    @JsonProperty("medium_url")
    public void setMedium_url(String medium_url) {
        this.medium_url = medium_url;
    }

    @JsonProperty("screen_url")
    public String getScreenUrl() {
        return screenUrl;
    }

    @JsonProperty("screen_url")
    public void setScreenUrl(String screenUrl) {
        this.screenUrl = screenUrl;
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
        return "IssueImage{" +
                "iconUrl='" + iconUrl + '\'' +
                ", medium_url='" + medium_url + '\'' +
                ", screenUrl='" + screenUrl + '\'' +
                ", smallUrl='" + smallUrl + '\'' +
                ", superUrl='" + superUrl + '\'' +
                ", thumbUrl='" + thumbUrl + '\'' +
                ", tinyUrl='" + tinyUrl + '\'' +
                ", originalUrl='" + originalUrl + '\'' +
                ", imageTags='" + imageTags + '\'' +
                '}';
    }
}
