import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int countOfEmployeesToEnter = 2;

    public static void main(String[] args) {
        Company company = new Company();
        getEmployeesFromUser(company);

        while (true) {
            MenuHelper.showOptions();
            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    company.showSumOfSalaries();
                    break;
                case 2:
                    company.showDataOfAllEmployees();
                    break;
                case 3:
                    company.addEmployee(UserInputHandler.getEmployeeFromUser());
                    break;
                case 4:
                    System.out.println("Program is stopped");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect value. Try again please.");
            }
        }
    }

    public static void getEmployeesFromUser(Company company) {
        for (int i = 0; i < countOfEmployeesToEnter; i++) {
            company.addEmployee(UserInputHandler.getEmployeeFromUser());
        }
    }
}
