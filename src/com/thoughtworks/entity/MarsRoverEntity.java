package com.thoughtworks.entity;

import com.thoughtworks.imp.MarsRover;

public class MarsRoverEntity {

    private int positionX;
    private int positionY;
    private String order;

    public MarsRoverEntity(){}

    public MarsRoverEntity(int positionX, int positionY, String order) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.order = order;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
