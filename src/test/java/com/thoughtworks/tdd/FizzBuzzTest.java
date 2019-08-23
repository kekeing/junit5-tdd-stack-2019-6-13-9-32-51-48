package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void should_get_1_when_fizzBuzzTest_then_1(){
        //given
        int number = 1;
        fizzBuzzNumberGame fizzBuzzNumberGame = new fizzBuzzNumberGame();


        //when
        String word = fizzBuzzNumberGame.fizzBuzz(number);

        //then
        Assertions.assertEquals("1" , word);

    }
    @Test
    public void should_get_Fizz_when_fizzBuzzTest_then_3(){
        //given
        int number = 3;
        fizzBuzzNumberGame fizzBuzzNumberGame = new fizzBuzzNumberGame();


        //when
        String word = fizzBuzzNumberGame.fizzBuzz(number);

        //then
        Assertions.assertEquals("fizz" , word);

    }
    @Test
    public void should_get_Buzz_when_fizzBuzzTest_then_5(){
        //given
        int number = 5;
        fizzBuzzNumberGame fizzBuzzNumberGame = new fizzBuzzNumberGame();


        //when
        String word = fizzBuzzNumberGame.fizzBuzz(number);

        //then
        Assertions.assertEquals("buzz" , word);

    }
    @Test
    public void should_get_Whizz_when_fizzBuzzTest_then_7(){
        //given
        int number = 7;
        fizzBuzzNumberGame fizzBuzzNumberGame = new fizzBuzzNumberGame();


        //when
        String word = fizzBuzzNumberGame.fizzBuzz(number);

        //then
        Assertions.assertEquals("whizz" , word);

    }
    @Test
    public void should_get_fizzbuzz_when_fizzBuzzTest_then_15(){
        //given
        int number = 15;
        fizzBuzzNumberGame fizzBuzzNumberGame = new fizzBuzzNumberGame();


        //when
        String word = fizzBuzzNumberGame.fizzBuzz(number);

        //then
        Assertions.assertEquals("fizzbuzz" , word);

    }
}
