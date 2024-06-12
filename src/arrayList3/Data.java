package arrayList3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Data {

   private static List<Job> jobs = new ArrayList<>();

   static {

       try {


           FileReader file = new FileReader("C:\\Users\\smura\\IdeaProjects\\MindTekJavaProject\\src\\arrayList3\\data.csv");

           BufferedReader br = new BufferedReader(file);

           String line;

           while ((line = br.readLine()) != null) {

               String[] data = line.split(",");

               Job job = new Job(data[0], data[1], Integer.parseInt(data[2]));

               jobs.add(job);
           }
       } catch (IOException e) {}
   }


    public static List<Job> getJobs() {
        return jobs;
    }
}