import java.util.stream.Stream;

public class Fibo {
    private final int to;

    public Fibo(int i) {
        this.to = i;
    }

    public Long calculate() {
        return Stream.iterate(new long[]{1L, 1L}, v -> new long[]{v[1], v[0] + v[1]})
                .limit(to)
                .reduce((s, v) -> v)
                .get()[0];

    }
}
