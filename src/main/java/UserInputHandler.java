import java.util.Scanner;

public class UserInputHandler {
    public static Employee getEmployeeFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of employee");
        String nameFromUser = scanner.nextLine();

        System.out.println("Enter surname of employee");
        String surnameFromUser = scanner.nextLine();

        System.out.println("Enter salary of employee");
        int salaryFromUser = scanner.nextInt();
        return new Employee(nameFromUser, surnameFromUser, salaryFromUser);
    }
}
