import java.util.ArrayList;

public class Company {
    public static ArrayList<Employee> listOfEmployees = new ArrayList<>();

    public static void showSumOfSalaries(){
        int sum =0;
        for (Employee employee:listOfEmployees) {
            sum+=employee.getSalary();
        }
        System.out.println("Sum of salaries is "+ sum);
    }

    public static void showDataOfAllEmployees(){
        for (Employee employee:listOfEmployees) {
           employee.getAllData();
        }
    }

}
