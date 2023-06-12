public class EmployeeTest {
    public static void main(String[] args) {
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("HR", "Assistant", 8000, 10);
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Finance", "Manager", 15000, 25);

        System.out.println("Part-Time Employee Salary: " + partTimeEmployee.salary());
        System.out.println("Full-Time Employee Salary: " + fullTimeEmployee.salary());
    }
}
