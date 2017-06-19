package test;

import main.ReservationDays;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReservationDaysTest {
    String inputInfo = "Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)";

    @Test
    public void shouldClassifyReservationDate() throws Exception {
        assertEquals(2,ReservationDays.getReservationDate(inputInfo)[0]);
        assertEquals(1,ReservationDays.getReservationDate(inputInfo)[1]);
    }
}
