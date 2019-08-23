package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void should_get1_when_fizzBuzzTest_then_1(){
        //given
        int number = 1;
        fizzBuzzNumberGame fizzBuzzNumberGame = new fizzBuzzNumberGame();


        //when
        String word = fizzBuzzNumberGame.fizzBuzz(number);

        //then
        Assertions.assertEquals("1" , word);

    }
}
