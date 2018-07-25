
package com.journaldev.rxjavaretrofit.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Variations implements Serializable
{

    @SerializedName("adapted")
    @Expose
    private Adapted adapted;
    @SerializedName("adapted_landscape")
    @Expose
    private AdaptedLandscape adaptedLandscape;
    @SerializedName("original")
    @Expose
    private Original original;
    @SerializedName("preview_small")
    @Expose
    private PreviewSmall previewSmall;
    private final static long serialVersionUID = -3294202169821449178L;

    public Adapted getAdapted() {
        return adapted;
    }

    public void setAdapted(Adapted adapted) {
        this.adapted = adapted;
    }

    public AdaptedLandscape getAdaptedLandscape() {
        return adaptedLandscape;
    }

    public void setAdaptedLandscape(AdaptedLandscape adaptedLandscape) {
        this.adaptedLandscape = adaptedLandscape;
    }

    public Original getOriginal() {
        return original;
    }

    public void setOriginal(Original original) {
        this.original = original;
    }

    public PreviewSmall getPreviewSmall() {
        return previewSmall;
    }

    public void setPreviewSmall(PreviewSmall previewSmall) {
        this.previewSmall = previewSmall;
    }

}
