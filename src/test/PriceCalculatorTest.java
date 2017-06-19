package test;

import main.Hotel;
import main.HotelDetail;
import main.PriceCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriceCalculatorTest {
    int[] reservationDays = {2, 1};
    Hotel[] hotelList = HotelDetail.getHotelDetail();

    @Test
    public void shouldReturnPriceListForRegularCustomer() throws Exception {
        String customerType = "Regular";
        int[] priceList = PriceCalculator.getHotelPrice(customerType, reservationDays, hotelList);
        assertEquals(310, priceList[0]);
        assertEquals(380, priceList[1]);
        assertEquals(590, priceList[2]);
    }

    @Test
    public void shouldReturnPriceListForRewardsCustomer() throws Exception {
        String customerType = "Rewards";
        int[] priceList = PriceCalculator.getHotelPrice(customerType, reservationDays, hotelList);
        assertEquals(240, priceList[0]);
        assertEquals(270, priceList[1]);
        assertEquals(240, priceList[2]);
    }
}
