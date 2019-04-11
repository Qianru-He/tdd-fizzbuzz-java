package com.thoughtworks.tdd;

import com.thoughtworks.tdd.Dependency;
import com.thoughtworks.tdd.HelloWorld;
import com.thoughtworks.tdd.fizzbuzz;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class HelloWorldTest {

    @BeforeAll
    static void initTestEnv() {
    }

    @BeforeEach
    void initEveryMethod() {
    }


    @Test
    @DisplayName("try display name")
    public void hello_world_test() {
        //given
        Dependency dependency = new Dependency();
        HelloWorld helloWorld = new HelloWorld(dependency);

        //when
        String actual = helloWorld.beenCalled();

        //then
        assertThat(actual, is("Leave me alone."));
    }
	public void should_be_fizzbuzz() {
        //given
        int number1 = 1;
		fizzbuzz neither = mock(fizzbuzz.class);
		 //when
        String actual1 = neither.fizzbuzz(number1);

        //then
        assertThat(actual1, is("1"));
		
		
		int number2 = 3;
		fizzbuzz fizz = mock(fizzbuzz.class);
		 //when
        String actual2 = fizz.fizzbuzz(number2);

        //then
        assertThat(actual2, is("Fizz"));
		
		int number3 = 5;
		fizzbuzz buzz = mock(fizzbuzz.class);
		 //when
        String actual3 = buzz.fizzbuzz(number3);

        //then
        assertThat(actual3, is("Buzz"));
		
		int number4 = 7;
		fizzbuzz whizz = mock(fizzbuzz.class);
		 //when
        String actual4 = whizz.fizzbuzz(number4);

        //then
        assertThat(actual4, is("Whizz"));
		
		int number5 = 15;
		fizzbuzz fizzbuzz = mock(fizzbuzz.class);
		 //when
        String actual5 = fizzbuzz.fizzbuzz(number5);

        //then
        assertThat(actual5, is("FizzBuzz"));
		
		int number6 = 21;
		fizzbuzz fizzwhizz = mock(fizzbuzz.class);
		 //when
        String actual6 = fizzwhizz.fizzbuzz(number6);

        //then
        assertThat(actual6, is("FizzWhizz"));
		
		int number7 = 35;
		fizzbuzz buzzwhizz = mock(fizzbuzz.class);
		 //when
        String actual7 = buzzwhizz.fizzbuzz(number7);

        //then
        assertThat(actual7, is("BuzzWhizz"));
		
		int number8 = 105;
		fizzbuzz fizzbuzzwhizz = mock(fizzbuzz.class);
        //when
        String actual8 = fizzbuzzwhizz.fizzbuzz(number8);

        //then
        assertThat(actual8, is("FizzBuzzWhizz"));
    }
    @Test
    public void should_be_mocked() {
        //given
        Dependency dependency = mock(Dependency.class);
        when(dependency.say()).thenReturn("Hello World");
        HelloWorld helloWorld = new HelloWorld(dependency);

        //when
        String actual = helloWorld.beenCalled();

        //then
        assertThat(actual, is("Hello World"));
    }
}
