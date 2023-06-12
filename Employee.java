public class Employee extends Person {
    private double basic;
    private double allowance;

    public Employee(String department, String designation, double basic, double allowance) {
        super(department, designation);
        this.basic = basic;
        this.allowance = allowance;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double salary() {
        return basic + (allowance * basic / 100);
    }

    public String toString() {
        return "Department: " + getDepartment() + ", Designation: " + getDesignation();
    }
}