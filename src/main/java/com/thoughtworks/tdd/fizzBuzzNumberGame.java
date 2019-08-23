package com.thoughtworks.tdd;

public class fizzBuzzNumberGame {

    public String fizzBuzz(int number) {
        if(number % 3 == 0) {
        	return "fizz";
        }
        if(number % 5 == 0) {
        	return "buzz";
        }
        if(number % 7 == 0) {
        	return "whizz";
        }
        else return Integer.toString(number);
    }
}
