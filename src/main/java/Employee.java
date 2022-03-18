public class Employee {
    private String name;
    private String surname;
    private int salary;

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
    }

    public void getAllData() {
        System.out.println("Salary for " + getName() + " " + getSurname() + " is " + getSalary());
    }
}
