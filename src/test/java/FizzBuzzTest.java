import domain.FizzBuzz;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;


    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    @Parameters({"3","6","9","12"})
    public void should_return_fizz_when_the_given_number_is_a_multiple_three(int number) throws Exception {
        Assertions.assertThat(fizzBuzz.generate(number)).isEqualTo("Fizz");
    }


    @Test
    @Parameters({"5","10","20","25"})
    public void should_return_buzz_when_the_given_number_is_a_multiple_five(int number) throws Exception {
        Assertions.assertThat(fizzBuzz.generate(number)).isEqualTo("Buzz");
    }


    @Test
    @Parameters({"15","30","45","60"})
    public void should_return_fizz_and_buzz_when_the_given_number_is_a_multiple_three_and_five(int number) throws Exception {
        Assertions.assertThat(fizzBuzz.generate(number)).isEqualTo("FizzBuzz");
    }

    @Test
    public void should_return_the_number() throws Exception {
        Assertions.assertThat(fizzBuzz.generate(1)).isEqualTo("1");
    }

}
