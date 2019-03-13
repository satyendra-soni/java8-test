import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import static org.assertj.core.api.Assertions.assertThat;

public class ConsumerTest_01 {

    @Test
    public void consumer_1() {
        /**
         * Write a consumer that clears the list it consumes.
         */
        Consumer<List<String>> consumer1 = List::clear;

        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));//Arrays.asList("a","b","c");

        consumer1.accept(list);
        assertThat(list).isEmpty();
    }

    @Test
    public void consumer_2() {

        Consumer<List<String>> c1 = list -> list.add("first");
        Consumer<List<String>> c2 = list -> list.add("second");

        Consumer<List<String>> consumer = c1.andThen(c2);

        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));

        consumer.accept(list);

        assertThat(list).containsExactly("a", "b", "c","first","second");
    }

}
