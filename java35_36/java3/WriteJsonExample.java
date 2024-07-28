import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJsonExample {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30, "john.doe@example.com");
        String fileName = "person.json";

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(fileName)) {
            gson.toJson(person, writer);
            System.out.println("JSON file written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
