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
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getDirection(),"N");
    }

    /**
     * 前进一步
     */
    @Test
    public void should_return_x_0_y_1_direction_N_when_give_position_given_execute_M(){
        /*数据初始化*/
        /*Given*/
        MarsRoverEntity marsRoverEntity = new MarsRoverEntity(0,0,"N");
        MarsRover marsRoverInit = new MarsRover();
        marsRoverInit.init(marsRoverEntity);

        /*Given*/
        String order = "M";

        /*When*/
        MarsRover marsRover = new MarsRover();
        marsRover.execute(order);

        /*Then*/
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionX(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionY(),1);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getDirection(),"N");
    }

    /**
     * 前进一步
     */
    @Test
    public void should_return_x_0_y__1_direction_S_when_give_position_given_execute_M(){
        /*数据初始化*/
        /*Given*/
        MarsRoverEntity marsRoverEntity = new MarsRoverEntity(0,0,"S");
        MarsRover marsRoverInit = new MarsRover();
        marsRoverInit.init(marsRoverEntity);

        /*Given*/
        String order = "M";

        /*When*/
        MarsRover marsRover = new MarsRover();
        marsRover.execute(order);

        /*Then*/
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionX(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionY(),-1);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getDirection(),"S");
    }

    /**
     * 前进一步
     */
    @Test
    public void should_return_x__1_y_0_direction_W_when_give_position_given_execute_M(){
        /*数据初始化*/
        /*Given*/
        MarsRoverEntity marsRoverEntity = new MarsRoverEntity(0,0,"W");
        MarsRover marsRoverInit = new MarsRover();
        marsRoverInit.init(marsRoverEntity);

        /*Given*/
        String order = "M";

        /*When*/
        MarsRover marsRover = new MarsRover();
        marsRover.execute(order);

        /*Then*/
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionX(),-1);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionY(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getDirection(),"W");
    }

    /**
     * 前进一步
     */
    @Test
    public void should_return_x_1_y_0_direction_E_when_give_position_given_execute_M(){
        /*数据初始化*/
        /*Given*/
        MarsRoverEntity marsRoverEntity = new MarsRoverEntity(0,0,"E");
        MarsRover marsRoverInit = new MarsRover();
        marsRoverInit.init(marsRoverEntity);

        /*Given*/
        String order = "M";

        /*When*/
        MarsRover marsRover = new MarsRover();
        marsRover.execute(order);

        /*Then*/
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionX(),1);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionY(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getDirection(),"E");
    }

    /**
     * 向左转
     */
    @Test
    public void should_return_x_0_y_0_direction_W_when_give_position_given_execute_L(){
        /*数据初始化*/
        /*Given*/
        MarsRoverEntity marsRoverEntity = new MarsRoverEntity(0,0,"N");
        MarsRover marsRoverInit = new MarsRover();
        marsRoverInit.init(marsRoverEntity);

        /*Given*/
        String order = "L";

        /*When*/
        MarsRover marsRover = new MarsRover();
        marsRover.execute(order);

        /*Then*/
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionX(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionY(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getDirection(),"W");
    }

    /**
     * 向左转
     */
    @Test
    public void should_return_x_0_y_0_direction_E_when_give_position_given_execute_L(){
        /*数据初始化*/
        /*Given*/
        MarsRoverEntity marsRoverEntity = new MarsRoverEntity(0,0,"S");
        MarsRover marsRoverInit = new MarsRover();
        marsRoverInit.init(marsRoverEntity);

        /*Given*/
        String order = "L";

        /*When*/
        MarsRover marsRover = new MarsRover();
        marsRover.execute(order);

        /*Then*/
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionX(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionY(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getDirection(),"E");
    }

    /**
     * 向左转
     */
    @Test
    public void should_return_x_0_y_0_direction_S_when_give_position_given_execute_L(){
        /*数据初始化*/
        /*Given*/
        MarsRoverEntity marsRoverEntity = new MarsRoverEntity(0,0,"W");
        MarsRover marsRoverInit = new MarsRover();
        marsRoverInit.init(marsRoverEntity);

        /*Given*/
        String order = "L";

        /*When*/
        MarsRover marsRover = new MarsRover();
        marsRover.execute(order);

        /*Then*/
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionX(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionY(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getDirection(),"S");
    }

    /**
     * 向左转
     */
    @Test
    public void should_return_x_0_y_0_direction_N_when_give_position_given_execute_L(){
        /*数据初始化*/
        /*Given*/
        MarsRoverEntity marsRoverEntity = new MarsRoverEntity(0,0,"E");
        MarsRover marsRoverInit = new MarsRover();
        marsRoverInit.init(marsRoverEntity);

        /*Given*/
        String order = "L";

        /*When*/
        MarsRover marsRover = new MarsRover();
        marsRover.execute(order);

        /*Then*/
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionX(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionY(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getDirection(),"N");
    }

    /**
     * 向右转
     */
    @Test
    public void should_return_x_0_y_0_direction_E_when_give_position_given_execute_R(){
        /*数据初始化*/
        /*Given*/
        MarsRoverEntity marsRoverEntity = new MarsRoverEntity(0,0,"N");
        MarsRover marsRoverInit = new MarsRover();
        marsRoverInit.init(marsRoverEntity);

        /*Given*/
        String order = "R";

        /*When*/
        MarsRover marsRover = new MarsRover();
        marsRover.execute(order);

        /*Then*/
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionX(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionY(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getDirection(),"E");
    }

    /**
     * 向右转
     */
    @Test
    public void should_return_x_0_y_0_direction_W_when_give_position_given_execute_R(){
        /*数据初始化*/
        /*Given*/
        MarsRoverEntity marsRoverEntity = new MarsRoverEntity(0,0,"S");
        MarsRover marsRoverInit = new MarsRover();
        marsRoverInit.init(marsRoverEntity);

        /*Given*/
        String order = "R";

        /*When*/
        MarsRover marsRover = new MarsRover();
        marsRover.execute(order);

        /*Then*/
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionX(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionY(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getDirection(),"W");
    }

    /**
     * 向右转
     */
    @Test
    public void should_return_x_0_y_0_direction_N_when_give_position_given_execute_R(){
        /*数据初始化*/
        /*Given*/
        MarsRoverEntity marsRoverEntity = new MarsRoverEntity(0,0,"W");
        MarsRover marsRoverInit = new MarsRover();
        marsRoverInit.init(marsRoverEntity);

        /*Given*/
        String order = "R";

        /*When*/
        MarsRover marsRover = new MarsRover();
        marsRover.execute(order);

        /*Then*/
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionX(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionY(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getDirection(),"N");
    }

    /**
     * 向右转
     */
    @Test
    public void should_return_x_0_y_0_direction_S_when_give_position_given_execute_R(){
        /*数据初始化*/
        /*Given*/
        MarsRoverEntity marsRoverEntity = new MarsRoverEntity(0,0,"E");
        MarsRover marsRoverInit = new MarsRover();
        marsRoverInit.init(marsRoverEntity);

        /*Given*/
        String order = "R";

        /*When*/
        MarsRover marsRover = new MarsRover();
        marsRover.execute(order);

        /*Then*/
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionX(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getPositionY(),0);
        Assert.assertEquals(MarsRover.testMarsRoverEntity.getDirection(),"S");
    }

}
