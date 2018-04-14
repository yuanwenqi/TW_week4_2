package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import static org.mockito.Mockito.mock;

public class FizzBuzzGameTest {

    @Test
    public void should_return_Fizz_when_have_3() {
        FizzBuzzGame FB = mock(FizzBuzzGame.class);
        when(FB.GetObject(3)).thenReturn("Fizz");

    }
}
