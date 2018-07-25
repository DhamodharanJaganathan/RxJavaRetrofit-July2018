
package com.journaldev.rxjavaretrofit.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AdaptedLandscape implements Serializable
{

    @SerializedName("resolution")
    @Expose
    private Resolution_ resolution;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("url")
    @Expose
    private String url;
    private final static long serialVersionUID = -294945900427857552L;

    public Resolution_ getResolution() {
        return resolution;
    }

    public void setResolution(Resolution_ resolution) {
        this.resolution = resolution;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
