
package com.example.demo.model.googlebooksapi;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Generated("jsonschema2pojo")
@Data
public class VolumeInfo {

    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("authors")
    @Expose
    public List<String> authors = List.of();
    @SerializedName("publishedDate")
    @Expose
    public String publishedDate;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("industryIdentifiers")
    @Expose
    public List<IndustryIdentifier> industryIdentifiers = List.of();
    @SerializedName("readingModes")
    @Expose
    public ReadingModes readingModes;
    @SerializedName("pageCount")
    @Expose
    public Integer pageCount;
    @SerializedName("printType")
    @Expose
    public String printType;
    @SerializedName("categories")
    @Expose
    public List<String> categories = List.of();
    @SerializedName("maturityRating")
    @Expose
    public String maturityRating;
    @SerializedName("allowAnonLogging")
    @Expose
    public Boolean allowAnonLogging;
    @SerializedName("contentVersion")
    @Expose
    public String contentVersion;
    @SerializedName("imageLinks")
    @Expose
    public ImageLinks imageLinks;
    @SerializedName("language")
    @Expose
    public String language;
    @SerializedName("previewLink")
    @Expose
    public String previewLink;
    @SerializedName("infoLink")
    @Expose
    public String infoLink;
    @SerializedName("canonicalVolumeLink")
    @Expose
    public String canonicalVolumeLink;

}
