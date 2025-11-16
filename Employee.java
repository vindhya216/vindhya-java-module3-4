
class Employee {
    int salary;
    String name;

    int getSalary() {
        return salary;
    }

    String getName() {
        return name;
    }

    void setName(String newName) {
        name = newName;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.salary = 50000;
        emp.setName("Hitha");
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
