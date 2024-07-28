import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadJsonExample {
    public static void main(String[] args) {
        String fileName = "person.json";
        Gson gson = new Gson();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            Person person = gson.fromJson(reader, Person.class);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Email: " + person.getEmail());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
