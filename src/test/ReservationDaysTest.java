package test;

import main.ReservationDays;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReservationDaysTest {
    String inputInfo;
    ReservationDays reservationDays;

    @Before
    public void setUp() throws Exception {
        inputInfo = "Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)";
        reservationDays = new ReservationDays(inputInfo);
    }

    @Test
    public void shouldClassifyReservationDate() throws Exception {
        assertEquals(2, reservationDays.getReservationDate()[0]);
        assertEquals(1, reservationDays.getReservationDate()[1]);
    }
}
