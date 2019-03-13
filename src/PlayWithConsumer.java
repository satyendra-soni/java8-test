import java.util.ArrayList;
import java.util.List;

public class PlayWithConsumer {


    public static void main(String[] args) {

        Consumer<List<String>> c1=list->list.add("one");
        Consumer<List<String>> c2=list->list.add("two");

        Consumer<List<String>> consumer=c1.andThan(c2);
        List<String> list=new ArrayList<>();
        list.add("zero");
        consumer.accept(list);
        System.out.println("list = " + list);
    }
}
