package task17;

//https://java-blog.ru/osnovy/arhitektura-mvc-java

import java.util.ArrayList;
import java.util.List;

public class TestMVC {
    public static void main(String[] args) {
        List<Employee> model2  = getDataForCalculation2();
        EmployeeView view2 = new EmployeeView();
        EmployeesContoller controller2 = new EmployeesContoller(model2, view2);
        System.out.println("Initial calculation");
        controller2.updateView2();


        for(EmployeeController ctrl : controller2.GetDataForCalculation()) {
            ctrl.setSalary((int) (ctrl.getSalary() * 1.2));
            ctrl.setBonus(30);
        }
        System.out.println(' ');
        System.out.println("Calculation after update");
        controller2.updateView2();
    }


    private static List<Employee> getDataForCalculation2(){
        List<Employee> lst = new ArrayList<>();

        Employee emp = new Employee();
        emp.setFirstName("Семен");
        emp.setLastName("Петров");
        emp.setSalary(100);
        emp.setBonus(10);
        lst.add(emp);

        Employee emp2= new Employee();
        emp2.setFirstName("Людмила");
        emp2.setLastName("Скрябина");
        emp2.setSalary(120);
        emp2.setBonus(5);
        lst.add(emp2);

        return lst;
    }
}
