package com.thoughtworks.test;

import com.thoughtworks.imp.FizzBuzz;
import jdk.jfr.StackTrace;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTests {

    /**
     * @author guozhiqiang
     *
     * 正常情况下，输入 1，期望返回 1
     */
    @Test
    public void should_return_1_given_1_when_say(){
        /*given*/

        /*when*/
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(1);

        /*then*/
        assertThat(result,is("1"));
    }

    /**
     * @author guozhiqiang
     *
     * 测试3的倍数，输入 3，期望返回 Fizz
     */
    @Test
    public void shoud_return_Fizz_given_3_when_say(){
        /*given*/

        /*when*/
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(3);

        /*then*/
        assertThat(result,is("Fizz"));
    }

    /**
     * @author guozhiqiang
     *
     * 测试5的倍数，输入 5，期望返回 Buzz
     */
    @Test
    public void shoud_return_Buzz_given_5_when_say(){
        /*given*/

        /*when*/
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(5);

        /*then*/
        assertThat(result,is("Buzz"));
    }

    /**
     * @author guozhiqiang
     *
     * 测试7的倍数，输入 7，期望返回 Whizz
     */
    @Test
    public void shoud_return_Whizz_given_7_when_say(){
        /*given*/

        /*when*/
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(7);

        /*then*/
        assertThat(result,is("Whizz"));
    }

    /**
     * @author guozhiqiang
     *
     * 测试数字中包含3，输入 13，期望返回 Fizz
     */
    @Test
    public void shoud_return_Fizz_given_13_when_say(){
        /*given*/

        /*when*/
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(13);

        /*then*/
        assertThat(result,is("Fizz"));
    }

    /**
     * @author guozhiqiang
     *
     * 测试数字中包含5，输入 15，期望返回 Buzz
     */
    @Test
    public void shoud_return_Buzz_given_15_when_say(){
        /*given*/

        /*when*/
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(15);

        /*then*/
        assertThat(result,is("Buzz"));
    }

    /**
     * @author guozhiqiang
     *
     * 测试数字中包含7，输入 17，期望返回 Whizz
     */
    @Test
    public void shoud_return_Whizz_given_27_when_say(){
        /*given*/

        /*when*/
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(47);

        /*then*/
        assertThat(result,is("Whizz"));
    }

    /**
     * @author guozhiqiang
     *
     * 测试数字是3和5的倍数，输入 60，期望返回 FizzBuzz
     */
    @Test
    public void shoud_return_FizzWhizz_given_60_when_say(){
        /*given*/

        /*when*/
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(60);

        /*then*/
        assertThat(result,is("FizzBuzz"));
    }

    /**
     * @author guozhiqiang
     *
     * 测试数字是3和7的倍数，输入 21，期望返回 FizzWhizz
     */
    @Test
    public void shoud_return_FizzWhizz_given_21_when_say(){
        /*given*/

        /*when*/
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(21);

        /*then*/
        assertThat(result,is("FizzWhizz"));
    }

    /**
     * @author guozhiqiang
     *
     * 测试数字是5和7的倍数，输入 140，期望返回 BuzzWhizz
     */
    @Test
    public void shoud_return_FizzBuzzWhizz_given_140_when_say(){
        /*given*/

        /*when*/
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(140);

        /*then*/
        assertThat(result,is("BuzzWhizz"));
    }

    /**
     * @author guozhiqiang
     *
     * 测试数字是3、5和7的倍数，输入 210，期望返回 FizzBuzzWhizz
     */
    @Test
    public void shoud_return_FizzBuzzWhizz_given_210_when_say(){
        /*given*/

        /*when*/
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(210);

        /*then*/
        assertThat(result,is("FizzBuzzWhizz"));
    }

}
