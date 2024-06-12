package arrayList3;

public class Employee {
    private String firstName;
    private String lastname;
    private int employeeId;
    private Department department;
    private Job job;

    public Employee(String firstName, String lastname, int employeeId, Department department, Job job) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.employeeId = employeeId;
        this.department = department;
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", employeeId=" + employeeId +
                ", department=" + department +
                ", job=" + job +
                '}';
    }
}
