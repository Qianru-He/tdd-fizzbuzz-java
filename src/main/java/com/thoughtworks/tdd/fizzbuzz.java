package com.thoughtworks.tdd;


public class fizzbuzz {
    public String fizzbuzz(int number){
		String restult = "";
		if(number%3==0)
		{
			restult+="Fizz";
		}
		if(number%5==0)
		{
			restult+="Buzz";
		}
		if(number%7==0)
		{
			restult+="Whizz";
		}
        return restult==""?number+"":restult;
    }
}