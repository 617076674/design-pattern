package behavior.visitor;

/**
 * @author qianyihui
 * @date 2019-06-16
 */
public interface Employee {

    void accept(Department handler);

}
