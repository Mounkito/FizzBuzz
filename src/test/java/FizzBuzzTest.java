import domain.FizzBuzz;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_fizz() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertThat(fizzBuzz.generate(3)).isEqualTo("Fizz");
    }
}
