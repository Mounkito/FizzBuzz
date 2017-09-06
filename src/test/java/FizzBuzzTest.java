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


    private Object[] fizzParameters() {
        return new Object[]{new Object[]{3}
        , new Object[]{6}
        , new Object[]{9}
        , new Object[]{12}};
    }

    private Object[] buzzParameters() {
        return new Object[]{new Object[]{5}
        , new Object[]{10}
        , new Object[]{20}
        , new Object[]{25}};
    }

    private Object[] fizzbuzzParameters() {
        return new Object[]{new Object[]{15}
                , new Object[]{30}
                , new Object[]{45}
                , new Object[]{60}};
    }

    @Test
    @Parameters(method = "fizzParameters")
    public void should_return_fizz_when_the_given_number_is_three(int number) throws Exception {
        Assertions.assertThat(fizzBuzz.generate(number)).isEqualTo("Fizz");
    }


    @Test
    @Parameters(method = "buzzParameters")
    public void should_return_buzz_when_the_given_number_is_five(int number) throws Exception {
        Assertions.assertThat(fizzBuzz.generate(number)).isEqualTo("Buzz");
    }


    @Test
    @Parameters(method = "fizzbuzzParameters")
    public void should_return_fizz_and_buzz_when_the_given_number_is_fifteen(int number) throws Exception {
        Assertions.assertThat(fizzBuzz.generate(number)).isEqualTo("FizzBuzz");

    }

}
