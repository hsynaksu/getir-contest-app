package com.momo.aksu.getircontest.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Element {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("xPosition")
    @Expose
    private Integer xPosition;
    @SerializedName("yPosition")
    @Expose
    private Integer yPosition;
    @SerializedName("r")
    @Expose
    private Integer r;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getXPosition() {
        return xPosition;
    }

    public void setXPosition(Integer xPosition) {
        this.xPosition = xPosition;
    }

    public Integer getYPosition() {
        return yPosition;
    }

    public void setYPosition(Integer yPosition) {
        this.yPosition = yPosition;
    }

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Element{" +
                "type='" + type + '\'' +
                ", xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                ", r=" + r +
                ", color='" + color + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}