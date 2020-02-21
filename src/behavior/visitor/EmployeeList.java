package behavior.visitor;

import java.util.ArrayList;

/**
 * @author qianyihui
 * @date 2019-06-16
 */
public class EmployeeList {

    private ArrayList<Employee> list = new ArrayList<>();

    public void addEmployee(Employee employee) {
        list.add(employee);
    }

    public void accept(Department handler) {
        for (Object obj : list) {
            ((Employee) obj).accept(handler);
        }
    }

}
