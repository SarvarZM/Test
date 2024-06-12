package arrayList3;

import java.util.ArrayList;
import java.util.List;

public class JobsUtilityMethods {
    /**
     * This method will return job object provided jobId.
     * Example:
     * .getJobId(jobs,"Ad_PRES");--> return job
     */
    public static Job getJobId(List<Job> jobs,String jobId){
        for(Job j:jobs){
            if (j.getJobID().equalsIgnoreCase(jobId)) {
                return j;
            }
        }
        return null;
    }


    /**
     * This method will get the job_id of hob that has the highest salary
     * .getJobOfHighestSalary(); return "Job_ID"
     */
    public static String getJobOfHighestSalary(List<Job> jobs){
        String jobId =(jobs.get(0).getJobID());
        int highestSalary = jobs.get(0).getSalary();

        for(Job j:jobs){
            if(j.getSalary()>highestSalary){
                jobId=j.getJobID();
                highestSalary =j.getSalary();
            }
        }
        return jobId;
    }
    /**
     * Method will return jon titles that has salary less than the average
     * Example:
     * .getTitlesLessThanAvgSalary(jobs) --> job titles
     */
    public static List<String> jobTitlesLessThenAVG (List<Job> jobs){
        int avg =0;
        List<String> titles= new ArrayList<>();

        for(Job j: jobs){
            avg +=j.getSalary();
        }

        avg = avg/ jobs.size();

        for(Job j:jobs){
            if(j.getSalary()<avg){
                titles.add(j.getTitle());
            }
        }
        return titles;
    }
    /**
     * Method returns Salary or provided job title
     * Example:
     * .getSalaryOf("Accountant"); -> return 9000
     */
public static Object getSalaryOf(String title, List<Job> jobs) {
    for (Job j : jobs) {
        if (j.getTitle().equalsIgnoreCase(title))
            return j.getSalary();

    }
    return "Job Title Could Not Be Found Please Check Spelling ";
    }
    /**
     * Method with update the salary of jobs of provided titles with specific percent
     * Example:
     * .increaseSalary(jobs,title,10);-> return list of all jobs with updated salary
     */
    public static List<Job> increaseSalary (List<String> title,int percent,List<Job> jobs){
        for(String t: title){
            for(int i =0;i<jobs.size();i++){
                if(jobs.get(i).getTitle().equalsIgnoreCase(t)){
                    int salary=jobs.get(i).getSalary();
                    salary = salary+ salary+percent/100;

                    jobs.get(i).setSalary(salary);
                    break;
                }
            }

        }
        return jobs;
    }

}
