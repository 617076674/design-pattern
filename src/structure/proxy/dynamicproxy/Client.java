package structure.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        AbstractUserDAO userDAO = new UserDAO();
        InvocationHandler handler = new DAOLogHandler(userDAO);
        AbstractUserDAO proxy = (AbstractUserDAO) Proxy.newProxyInstance(AbstractUserDAO.class.getClassLoader(),
                new Class[] {AbstractUserDAO.class}, handler);
        proxy.findUserById("张无忌");
        System.out.println("-----------------------------------");
        AbstractDocumentDAO docDAO = new DocumentDAO();
        handler = new DAOLogHandler(docDAO);
        AbstractDocumentDAO proxy_new = (AbstractDocumentDAO) Proxy.newProxyInstance(AbstractDocumentDAO.class.getClassLoader(),
                new Class[] {AbstractDocumentDAO.class}, handler);
        proxy_new.deleteDocumentById("D002");
    }
}