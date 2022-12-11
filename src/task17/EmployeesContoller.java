package task17;

import java.util.ArrayList;
import java.util.List;

public class EmployeesContoller {

    private final List<EmployeeController> model2;
    private final EmployeeView view;

    public List<EmployeeController> GetDataForCalculation()
    {
        return model2;
    }

    public EmployeesContoller(List<Employee> models, EmployeeView view){
        model2 = new ArrayList<>();

        for(Employee emp : models)
        {
            EmployeeController ctrl = new EmployeeController(emp);
            model2.add(ctrl);
        }

        this.view = view;
    }

    public void updateView2(){
        view.printSalaryReportTop();
        for(EmployeeController ctrl : model2)
            view.printSalaryReport(ctrl.getFirstName(),ctrl.getLastName(),
                    ctrl.getSalary(), ctrl.getBonus(), ctrl.getTotal());
    }

}
