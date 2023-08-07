package com.beerproject.projectbeer.domain;

//@Entity
public class Beer {

    private String id;
    private String name;
    private String brand;
    private String style;
    private String alcoholContent;

    public Beer(String id, String name, String brand, String style, String alcoholContent) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.style = style;
        this.alcoholContent = alcoholContent;
    }

    public Beer() {
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getAlcoholContent() {
        return alcoholContent;
    }

    public void setAlcoholContent(String alcoholContent) {
        this.alcoholContent = alcoholContent;
    }
}
