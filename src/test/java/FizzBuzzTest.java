import domain.FizzBuzz;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_fizz_when_the_given_number_is_three() throws Exception {
        Assertions.assertThat(fizzBuzz.generate(3)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_fizz_when_the_given_number_is_six() throws Exception {
        Assertions.assertThat(fizzBuzz.generate(6)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_buzz_when_the_given_number_is_five() throws Exception {
        Assertions.assertThat(fizzBuzz.generate(5)).isEqualTo("Buzz");
    }

    @Test
    public void should_return_buzz_when_the_given_number_is_ten() throws Exception {
        Assertions.assertThat(fizzBuzz.generate(10)).isEqualTo("Buzz");
    }

    @Test
    public void should_return_fizz_and_buzz_when_the_given_number_is_fifteen() throws Exception {
        Assertions.assertThat(fizzBuzz.generate(15)).isEqualTo("FizzBuzz");

    }

    @Test
    public void should_return_fizz_and_buzz_when_the_given_number_is_thirty() throws Exception {
        Assertions.assertThat(fizzBuzz.generate(30)).isEqualTo("FizzBuzz");

    }
}
