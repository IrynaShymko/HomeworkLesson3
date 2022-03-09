public class Employee {
    private  Name name;
    private Surname surname;
    private Salary salary;

    public Employee(String nameFromUser, String surnameFromUser, Integer salaryFromUser){
        this.name=new Name();
        name.setName(nameFromUser);

        this.surname=new Surname();
        surname.setSurname(surnameFromUser);

        this.salary=new Salary();
        salary.setSalary(salaryFromUser);
    }

    public String getName() {
        return name.getName();
    }

    public String getSurname() {
        return surname.getSurname();
    }

    public int getSalary() {
        return salary.getSalary();
    }

    public void getAllData(){
        System.out.println("Salary for "+ getName()+ " " + getSurname()+ " is "+ getSalary());
    }
}
