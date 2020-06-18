package com.thoughtworks.test;

import com.thoughtworks.imp.FizzBuzz;
import jdk.jfr.StackTrace;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTests {

    /**
     * @
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

    @Test
    public void shoud_return_Fizz_given_3_when_say(){
        /*given*/

        /*when*/
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(3);

        /*then*/
        assertThat(result,is("Fizz"));
    }

    @Test
    public void shoud_return_Buzz_given_5_when_say(){
        /*given*/

        /*when*/
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(5);

        /*then*/
        assertThat(result,is("Buzz"));
    }

    @Test
    public void shoud_return_Whizz_given_7_when_say(){
        /*given*/

        /*when*/
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(7);

        /*then*/
        assertThat(result,is("Whizz"));
    }

    @Test
    public void shoud_return_FizzBuzzWhizz_given_15_when_say(){
        /*given*/

        /*when*/
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(15);

        /*then*/
        assertThat(result,is("FizzBuzz"));
    }

    @Test
    public void shoud_return_FizzWhizz_given_21_when_say(){
        /*given*/

        /*when*/
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(21);

        /*then*/
        assertThat(result,is("FizzWhizz"));
    }

    @Test
    public void shoud_return_FizzWhizz_given_35_when_say(){
        /*given*/

        /*when*/
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(35);

        /*then*/
        assertThat(result,is("Fizz"));
    }

}
