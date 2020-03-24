package behavior.visitor.demo1;

public class FADepartment extends Department {
    @Override
    public void visit(FulltimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double weekWage = employee.getWeeklyWage();
        if (40 < workTime) {
            weekWage = workTime + (workTime - 40) * 100;
        } else if (40 > workTime) {
            weekWage = workTime - (40 - workTime) * 80;
            if (0 > weekWage) {
                weekWage = 0;
            }
        }
        System.out.println("正式员工" + employee.getName() + "实际工资为：" + weekWage + "元.");
    }

    @Override
    public void visit(ParttimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double hourWage = employee.getHourWage();
        System.out.println("临时工" + employee.getName() + "实际工资为：" + workTime * hourWage + "元.");
    }
}