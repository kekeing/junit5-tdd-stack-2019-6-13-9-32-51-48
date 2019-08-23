package com.thoughtworks.tdd;

public class fizzBuzzNumberGame {

    public String fizzBuzz(int number) {
          String result = "";
    	
        if(number % 3 == 0) {
        	 result += "fizz";
        }
        if(number % 5 == 0) {
        	 result += "buzz";
        }
        if(number % 7 == 0) {
        	result +=  "whizz";
        }
        if (number % 3 != 0  &&  number % 5 != 0 && number % 7 != 0) {
        	 result = Integer.toString(number);
			
		} 
        
        
        return result;
    }
}
