package exceptionsPractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\smura\\IdeaProjects\\MindTekJavaProject\\src\\exceptionsPractice\\data.txt";
        FileReader fileReader = new FileReader(path);

    try {
        BufferedReader reader = new BufferedReader(fileReader);
        System.out.println(reader.readLine());
        fileReader.close();
        System.out.println("In Final");
    }catch (IOException exception){
        System.out.println(exception.getMessage());

        }finally {
        fileReader.close();
        System.out.println("In Final");
        }
    }
}
