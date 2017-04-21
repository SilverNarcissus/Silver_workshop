import static org.junit.Assert.*;

/**
 * Created by SilverNarcissus on 2017/4/21.
 */
public class TestTest {
    @org.junit.Test
    public void main() throws Exception {
        double sum = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += Math.sqrt(i);
        }
        System.out.println(sum);
    }
}