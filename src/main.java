import java.util.function.Consumer;

public class main {
    public static void main(String[] args) {

        Consumer<String> consumer= System.out::println;

        consumer.accept("Hello Sattu");
    }
}
