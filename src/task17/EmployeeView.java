package task17;

public class EmployeeView {
    public void printSalaryReportTop(){
        String s = "Имя" + '\t' + "Фамилия" + '\t' + "Оклад" +
                '\t' + "Премия" + '\t' + "Сумма";
        System.out.println(s);
    }
    public void printSalaryReport(String FirstName, String LastName, int Salary, int Bonus, int Total){
        String s = FirstName + '\t' + LastName + '\t' +
                Salary + '\t' + Bonus + '\t' + Total;
        System.out.println(s);
    }
}
