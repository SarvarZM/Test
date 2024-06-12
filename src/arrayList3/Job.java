package arrayList3;

public class Job {

    private String title;
    private String jobID;
    private int salary;

    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", jobID='" + jobID + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Job(String title, String jobID, int salary) {
        this.title = title;
        this.jobID = jobID;
        this.salary = salary;
    }
}
