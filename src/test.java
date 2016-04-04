import java.util.Timer;
import java.util.function.BinaryOperator;

/**
 * Created by lagoon0o0 on 16/4/4.
 */
public class test {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (x,y) -> x + y;
        int c = add.apply(1,2);
        System.out.print(c);

    }
}
