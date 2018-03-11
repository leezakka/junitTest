import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FiboTest {

    @Test
    public void testCalculateFibonacci() {
        // 1 2 3 4 5 6
        // 1 1 2 3 5 8
        assertThat(new Fibo(1).calculate(), is(1L));
        assertThat(new Fibo(2).calculate(), is(1L));
        assertThat(new Fibo(3).calculate(), is(2L));
        assertThat(new Fibo(4).calculate(), is(3L));
        assertThat(new Fibo(5).calculate(), is(5L));
        assertThat(new Fibo(6).calculate(), is(8L));
    }
}
