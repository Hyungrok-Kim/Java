import org.junit.Test;
import per.khr.java.StringTokenizer.StringTokenizerExample;

import java.util.StringTokenizer;

public class StringTokenizerExampleTest {
    @Test
    public void tokenChecking() {
        String phone = "010-1234-5678";
        StringTokenizer st = new StringTokenizer(phone, "-", true);

        StringTokenizerExample ste = new StringTokenizerExample();
        ste.tokenChecking(st);
    }
}