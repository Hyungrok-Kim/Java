package per.khr.java.StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public void tokenChecking(StringTokenizer st ) {
        while (st.hasMoreTokens()) {
            System.out.println("남은 토큰 수 : " + st.countTokens());
            System.out.println("현재 토큰 : " + st.nextToken());
        }
    }
}
