package stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamShould {

    @Test
    void be_collected_to_lis_easily() {
        final List<Integer> multiplyByTwo = IntStream.range(0, 5)
                .boxed()
                .map(num -> num * 2)
                .toList();

        assertThat(multiplyByTwo).isEqualTo(List.of(0, 2, 4, 6, 8));
    }

}
