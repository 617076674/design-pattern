package structure.proxy;

/**
 * @author qianyihui
 * @date 2019-07-01
 */
public class Client {
    public static void main(String[] args) {
        Searcher searcher;
        searcher = (Searcher) XMLUtil.getBean();
        String result = searcher.doSearch("杨过", "玉女心经");
    }
}
