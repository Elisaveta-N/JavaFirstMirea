package task17;

public class EmployeeController {
        private final Employee model;
        public EmployeeController(Employee model)
        {
            this.model = model;
        }
        public void setBonus(int bonus) {
            model.setBonus(bonus);
        }

        public void setFirstName(String firstName) {
            model.setFirstName(firstName);
        }

        public void setLastName(String lastName) {
            model.setLastName(lastName);
        }

        public void setSalary(int salary) {
            model.setSalary(salary);
        }

        public String getFirstName() {
            return model.getFirstName();
        }

        public String getLastName() {
            return model.getLastName();
        }

        public int getTotal() {
            return model.getTotal();
        }

        public int getBonus() {
            return model.getBonus();
        }

        public int getSalary() {
            return model.getSalary();
        }
    }
