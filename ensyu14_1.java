import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class ensyu14_1 {

    private Object Holiday;

    @Test
    public void testGetHolidays_2023() {
        String[] expectedHolidays = {
                "2023-01-01", // 元日
                "2023-01-02", // 元日振替休日
                "2023-01-09", // 成人の日
                "2023-02-11", // 建国記念日
                "2023-02-12", // 建国記念日振替休日
                "2023-02-23", // 天皇誕生日
                "2023-03-20", // 春分の日
                "2023-04-29", // 昭和の日
                "2023-05-03", // 憲法記念日
                "2023-05-04", // みどりの日
                "2023-05-05", // こどもの日
                "2023-07-17", // 海の日
                "2023-08-11", // 山の日
                "2023-09-18", // 敬老の日
                "2023-09-23", // 秋分の日
                "2023-10-09", // 体育の日
                "2023-11-03", // 文化の日
                "2023-11-23", // 勤労感謝の日
        };
        String[] actualHolidays = Holiday.getHolidays(2023);
        assertArrayEquals(expectedHolidays, actualHolidays);
    }
}
