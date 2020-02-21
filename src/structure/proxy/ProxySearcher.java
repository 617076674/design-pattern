package structure.proxy;

/**
 * @author qianyihui
 * @date 2019-07-01
 */
public class ProxySearcher implements Searcher {
    private RealSearcher searcher = new RealSearcher();

    private AccessValidator validator;

    private Logger logger;

    @Override
    public String doSearch(String userId, String keyword) {
        //如果身份验证成功，则执行查询
        if (this.validate(userId)) {
            String result = searcher.doSearch(userId, keyword);
            this.log(userId);
            return result;
        }
        return null;
    }

    public boolean validate(String userId) {
        validator = new AccessValidator();
        return validator.validate(userId);
    }

    public void log(String userId) {
        logger = new Logger();
        logger.log(userId);
    }
}
