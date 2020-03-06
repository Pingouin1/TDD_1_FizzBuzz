import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private final static FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public final void should_return_empty_string_if_not_dividable_by_three_or_five() {
        int n = 1;

        assertEquals("should return empty string if not dividable by three or five", "", fizzBuzz.fizzBuzz(n));
    }

    @Test
    public final void should_return_fizz_if_dividable_by_three() {
        int n = 3;

        assertEquals("should return empty string if not dividable by three or five", "Fizz", fizzBuzz.fizzBuzz(n));
    }

    @Test
    public final void should_return_buzz_if_dividable_by_five() {
        int n = 5;

        assertEquals("should return empty string if not dividable by three or five", "Buzz", fizzBuzz.fizzBuzz(n));
    }

    @Test
    public final void should_return_buzz_if_dividable_by_three_and_five() {
        int n = 15;

        assertEquals("should return empty string if not dividable by three or five", "FizzBuzz", fizzBuzz.fizzBuzz(n));
    }

    @Test
    public final void should_return_buzz_if_finishes_by_three() {
        int n = 13;

        assertEquals("should return empty string if not dividable by three or five", "Fizz", fizzBuzz.fizzBuzz(n));
    }

    @Test
    public final void should_return_buzz_if_finishes_by_five() {
        int n = 25;

        assertEquals("should return empty string if not dividable by three or five", "Buzz", fizzBuzz.fizzBuzz(n));
    }
}