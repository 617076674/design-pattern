package structure.proxy.demo1;

public class Client {
    public static void main(String[] args) {
        String result = ((Searcher) XMLUtil.getBean()).doSearch("杨过", "玉女心经");
    }
}