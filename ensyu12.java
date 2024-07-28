import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ensyu12 {

    // 祝日を格納するセット
    private static final Set<LocalDate> HOLIDAYS = new HashSet<>(Set.of(
            // 祝日の日付をここに追加する
            LocalDate.of(2024, 1, 1), // 元日
            LocalDate.of(2024, 2, 11), // 建国記念日
            LocalDate.of(2024, 3, 20), // 春分の日
            LocalDate.of(2024, 4, 29), // 昭和の日
            LocalDate.of(2024, 5, 3),  // 憲法記念日
            LocalDate.of(2024, 5, 4),  // みどりの日
            LocalDate.of(2024, 5, 5),   // こどもの日
            LocalDate.of(2024, 5, 6)   // こどもの日の振替休日
            // 他の祝日の日付を追加する
    ));

    // 平日か否かを判定するメソッド
    public static boolean isWeekday(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY;
    }

    // 与えられた日付が休日(土日または祝日)か否かを判定するメソッド
    public static boolean isHoliday(LocalDate date) {
        return HOLIDAYS.contains(date) || !isWeekday(date);
    }

    // ある期間内の平日の数をカウントするメソッド
    public static int countWeekdays(LocalDate startDate, LocalDate endDate) {
        int count = 0;
        LocalDate currentDate = startDate;
        while (!currentDate.isAfter(endDate)) {
            if (isWeekday(currentDate) && !isHoliday(currentDate)) {
                count++;
            }
            currentDate = currentDate.plusDays(1);
        }
        return count;
    }

    // 指定された日付から次の平日を計算するメソッド
    public static LocalDate getNextWeekday(LocalDate date) {
        LocalDate nextDay = date.plusDays(1);
        while (!isWeekday(nextDay)) {
            nextDay = nextDay.plusDays(1);
        }
        return nextDay;
    }

    // intの配列に対して合計時間を計算し返すメソッド
    public static int calculateTotalTime(int[] hours) {
        return Arrays.stream(hours).sum();
    }

    public static void main(String[] args) {
        // テスト用のコード
        LocalDate date = LocalDate.now();
        System.out.println("今日は平日ですか？ " + isWeekday(date));
        System.out.println("今日は休日ですか？ " + isHoliday(date));
        System.out.println("5月1日から5月20日までの平日の数: " + countWeekdays(LocalDate.of(2024, 5, 1), LocalDate.of(2024, 5, 20)));
        System.out.println("5月20日の次の平日: " + getNextWeekday(LocalDate.of(2024, 5, 20)));
        int[] hours = {8, 6, 7, 5, 3, 0, 9};
        System.out.println("合計時間: " + calculateTotalTime(hours));
    }
}
