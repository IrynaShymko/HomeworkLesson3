import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> listOfEmployees = new ArrayList<>();

    public void showSumOfSalaries() {
        int sum = 0;
        for (Employee employee : listOfEmployees) {
            sum += employee.getSalary();
        }
        System.out.println("Sum of salaries is " + sum);
    }

    public void showDataOfAllEmployees() {
        for (Employee employee : listOfEmployees) {
            employee.getAllData();
        }
    }

//    public int getAmountOfEmployees() {
//        return listOfEmployees.size();
//    }

    public void addEmployee(Employee employee) {
        listOfEmployees.add(employee);
    }

}
