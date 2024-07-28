import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ensyu14_2 {

    public static String[] getHolidays(int year) {
        ObjectMapper objectMapper = new ObjectMapper();
        String url = "https://holidays-jp.github.io/api/v1/" + year + "/date.json";
        List<String> holidays = new ArrayList<>();

        try {
            JsonNode rootNode = objectMapper.readTree(new URL(url));
            JsonNode holidaysNode = rootNode.get(Integer.toString(year));
            holidaysNode.forEach(dateNode -> {
                String date = dateNode.get("date").asText();
                holidays.add(date);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        return holidays.toArray(new String[0]);
    }
}
