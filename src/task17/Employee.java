package task17;

public class Employee {
    private String FirstName;
    private String LastName;
    private int Salary;
    private int Bonus;
    private int Total;

    public void setBonus(int bonus) {
        Bonus = bonus;
        Total = Salary + Bonus;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setSalary(int salary) {
        Salary = salary;
        Total = Salary + Bonus;
    }

    public int getBonus() {
        return Bonus;
    }

    public int getSalary() {
        return Salary;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getTotal() {
        return Total;
    }
}
