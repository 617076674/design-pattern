package behavior.visitor;

/**
 * @author qianyihui
 * @date 2019-06-16
 *
 * 声明一组重载的访问方法，用于访问不同类型的具体元素
 */
public abstract class Department {

    public abstract void visit(FulltimeEmployee employee);

    public abstract void visit(ParttimeEmployee employee);

}
