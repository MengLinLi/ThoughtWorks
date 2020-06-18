package com.thoughtworks.imp;

import com.thoughtworks.entity.MarsRoverEntity;

public class MarsRover {

    public static MarsRoverEntity testMarsRoverEntity;

    public void init(MarsRoverEntity marsRoverEntity){
        testMarsRoverEntity = marsRoverEntity;
    }

    public void execute(String order){
        switch (order){
            case "M" :
                new MarsRover().executM();
                break;
            case "L" :
                new MarsRover().executL();
                break;
            case "R" :
                new MarsRover().executR();
                break;
        }
    }

    public void executM() {
        String direction = testMarsRoverEntity.getDirection();
        switch (direction){
            case "N" :
                testMarsRoverEntity.setPositionY(testMarsRoverEntity.getPositionY() + 1);
                break;
            case "S" :
                testMarsRoverEntity.setPositionY(testMarsRoverEntity.getPositionY() - 1);
                break;
            case "W" :
                testMarsRoverEntity.setPositionX(testMarsRoverEntity.getPositionX() - 1);
                break;
            case "E" :
                testMarsRoverEntity.setPositionX(testMarsRoverEntity.getPositionX() + 1);
                break;
        }
    }

    public void executL() {
        String direction = testMarsRoverEntity.getDirection();
        switch (direction){
            case "N" :
                testMarsRoverEntity.setDirection("W");
                break;
            case "S" :
                testMarsRoverEntity.setDirection("E");
                break;
            case "W" :
                testMarsRoverEntity.setDirection("S");
                break;
            case "E" :
                testMarsRoverEntity.setDirection("N");
                break;
        }
    }

    public void executR() {
        String direction = testMarsRoverEntity.getDirection();
        switch (direction){
            case "N" :
                testMarsRoverEntity.setDirection("E");
                break;
            case "S" :
                testMarsRoverEntity.setDirection("W");
                break;
            case "W" :
                testMarsRoverEntity.setDirection("N");
                break;
            case "E" :
                testMarsRoverEntity.setDirection("S");
                break;
        }
    }
}
