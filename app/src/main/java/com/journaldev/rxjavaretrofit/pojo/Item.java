
package com.journaldev.rxjavaretrofit.pojo;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item implements Serializable
{

    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("category_id")
    @Expose
    private Integer categoryId;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("downloads")
    @Expose
    private Integer downloads;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("license")
    @Expose
    private String license;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    @SerializedName("source_link")
    @Expose
    private String sourceLink;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("uploaded_at")
    @Expose
    private String uploadedAt;
    @SerializedName("variations")
    @Expose
    private Variations variations;
    private final static long serialVersionUID = 936169055939938962L;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getSourceLink() {
        return sourceLink;
    }

    public void setSourceLink(String sourceLink) {
        this.sourceLink = sourceLink;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getUploadedAt() {
        return uploadedAt;
    }

    public void setUploadedAt(String uploadedAt) {
        this.uploadedAt = uploadedAt;
    }

    public Variations getVariations() {
        return variations;
    }

    public void setVariations(Variations variations) {
        this.variations = variations;
    }

}
