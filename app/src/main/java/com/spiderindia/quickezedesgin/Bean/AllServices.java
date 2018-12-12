package com.spiderindia.quickezedesgin.Bean;

/**
 * Created by pyr on 18-Sep-18.
 */

public class AllServices {

    private Integer image;
    private String title;

    public AllServices(Integer image, String title) {
        this.image = image;
        this.title = title;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
