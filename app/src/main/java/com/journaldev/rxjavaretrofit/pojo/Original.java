
package com.journaldev.rxjavaretrofit.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Original implements Serializable
{

    @SerializedName("resolution")
    @Expose
    private Resolution__ resolution;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("url")
    @Expose
    private String url;
    private final static long serialVersionUID = -8613557334141914977L;

    public Resolution__ getResolution() {
        return resolution;
    }

    public void setResolution(Resolution__ resolution) {
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
