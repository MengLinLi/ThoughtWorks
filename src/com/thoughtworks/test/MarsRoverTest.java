package com.thoughtworks.test;

import com.thoughtworks.entity.MarsRoverEntity;
import com.thoughtworks.imp.MarsRover;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {

    /**
     * 初始化，获取数据
     */
    @Test
    public void should_return_x_0_y_0_direction_N_when_give_position_given_init_x0_y0_N(){
        /*Given*/
        MarsRoverEntity marsRoverEntity = new MarsRoverEntity(0,0,"N");

        /*When*/
        MarsRover marsRover = new MarsRover();
        marsRover.init(marsRoverEntity);

        /*Then*/
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionX(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionY(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getOrder(),"N");
    }

    /**
     * 前进一步
     */
    @Test
    public void should_return_x_0_y_0_direction_N_when_give_position_given_execute_M(){
        /*数据初始化*/
        /*Given*/
        MarsRoverEntity marsRoverEntity = new MarsRoverEntity(0,0,"N");
        MarsRover marsRoverInit = new MarsRover();
        marsRoverInit.init(marsRoverEntity);

        /*Given*/
        String order = "M";

        /*When*/
        MarsRover marsRover = new MarsRover();
        marsRover.executM();

        /*Then*/
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionX(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionY(),1);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getOrder(),"N");
    }

}
