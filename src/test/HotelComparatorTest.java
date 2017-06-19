package test;

import main.HotelComparator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelComparatorTest {
    @Test
    public void shouldReturnCheapestHotel() throws Exception {
        int[] priceList = {100, 110, 120};
        int[] ratingList = {3, 4, 5};
        assertEquals("Lakewood", HotelComparator.compareHotel(priceList, ratingList));
    }

    @Test
    public void shouldReturnHighestRatingHotelWhenPriceSame() throws Exception {
        int[] priceList = {100, 100, 120};
        int[] ratingList = {3, 4, 5};
        assertEquals("Bridgewood", HotelComparator.compareHotel(priceList, ratingList));
    }
}
