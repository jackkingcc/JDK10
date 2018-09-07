import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by e604847 on 9/4/2018.
 */
public class StreamTest {
    public static void main(String[] args) {
        String[] s = {"aaa","bbb","ccc"};
        List<String> list = Arrays.asList(s);
        Stream<String> lStream=list.stream();
        Stream<String> parlStream = list.parallelStream();
        lStream.filter(string -> !string.contains("s")).forEach(System.out::println);
    }
}
