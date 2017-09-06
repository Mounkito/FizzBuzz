import domain.FizzBuzz;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_fizz_when_the_given_number_is_three() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertThat(fizzBuzz.generate(3)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_fizz_when_the_given_number_is_six() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertThat(fizzBuzz.generate(6)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_buzz_when_the_given_number_is_five() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertThat(fizzBuzz.generate(5)).isEqualTo("Buzz");
    }
}
