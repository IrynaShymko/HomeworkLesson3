import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Service {
    private static Integer[] arrayOfAllowedMenuValues = {1, 2, 3, 4};

    public static void communicateWithUserToEnterEmployees(int countOfEmployeesToEnter) {
        for (int i = 0; i < countOfEmployeesToEnter; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter data for user "+ (Company.listOfEmployees.size() + 1));
            System.out.println("Enter name of employee");
            String nameFromUser = scanner.nextLine();
            System.out.println("Enter surname of employee");
            String surnameFromUser = scanner.nextLine();
            System.out.println("Enter salary of employee");
            Integer salaryFromUser = scanner.nextInt();
            Employee employee = new Employee(nameFromUser, surnameFromUser, salaryFromUser);
            Company.listOfEmployees.add(employee);
        }

    }

    public static void showMenuContent() {
        System.out.println();
        System.out.println("Please choose and enter a value of option from menu below");
        System.out.println("1 - Print sum of all employees salary");
        System.out.println("2 - Display all employees data");
        System.out.println("3 - Add new employee");
        System.out.println("4 - End program");
    }


    public static void suggestChoice() {
        boolean needToChoose = true;
        List<Integer> listOfAllowedMenuValues = Arrays.asList(arrayOfAllowedMenuValues);

        while (needToChoose) {
            try{
            showMenuContent();
            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();

            if (listOfAllowedMenuValues.contains(userChoice)) {
                switch (userChoice) {
                    case 1:
                        Company.showSumOfSalaries();
                        break;
                    case 2:
                        Company.showDataOfAllEmployees();
                        break;
                    case 3:
                        communicateWithUserToEnterEmployees(1);
                        break;
                    case 4:
                        System.out.println("Program is stopped");
                        needToChoose = false;
                        break;
                }
            } else {
                System.out.println("Incorrect value. Try again please.");

            }}
            catch (InputMismatchException e){
                System.out.println("Incorrect value. Try again please.");
            }
        }
    }
}

