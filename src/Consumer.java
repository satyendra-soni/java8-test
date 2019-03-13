@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);

    default Consumer<T> andThan(Consumer<T> other) {

        return (T t) -> {
            this.accept(t);
            other.accept(t);
        };
    }

}
