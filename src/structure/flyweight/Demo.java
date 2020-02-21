package structure.flyweight;

/**
 * @author qianyihui
 * @date 2019-06-30
 */
public class Demo {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abcd";
        System.out.println(s1 == s2);
        s2 += "";
        System.out.println(s1 == s2);
    }
}
