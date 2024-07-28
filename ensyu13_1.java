import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * ensyu13_1
 */
public final class ensyu13_1 {

    private ensyu13_1() {
    }

    @Test
    public void testIsWeekend_Saturday() {
        LocalDate saturday = LocalDate.of(2024, 5, 18);
        assertTrue(Weekend.isWeekend(saturday));
    }

    @Test
    public void testIsWeekend_Sunday() {
        LocalDate sunday = LocalDate.of(2024, 5, 19);
        assertTrue(Weekend.isWeekend(sunday));
    }

    @Test
    public void testIsWeekend_Monday() {
        LocalDate monday = LocalDate.of(2024, 5, 20);
        assertFalse(Weekend.isWeekend(monday));
    }
}
