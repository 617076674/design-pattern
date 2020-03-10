package structure.proxy.demo1;

public class AccessValidator {
    public boolean validate(String userId) {
        System.out.println("在数据库中验证用户'" + userId + "'是否为合法用户？");
        if (userId.equalsIgnoreCase("杨过")) {
            System.out.println("'" + userId + "'登录成功！");
            return true;
        }
        System.out.println("'" + userId + "'登录失败！");
        return false;
    }
}