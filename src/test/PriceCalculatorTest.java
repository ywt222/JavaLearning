package test;

import main.HotelDetail;
import main.PriceCalculator;
import main.model.CustomerType;
import main.model.Hotel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriceCalculatorTest {
    int[] reservationDays = {2, 1};
    Hotel[] hotelList = HotelDetail.getHotelDetail();

    @Test
    public void shouldReturnPriceListForRegularCustomer() throws Exception {
        CustomerType customerType = CustomerType.Regular;
        PriceCalculator priceCalculator = new PriceCalculator(customerType, reservationDays, hotelList);
        int[] priceList = priceCalculator.getHotelPrice();
        assertEquals(310, priceList[0]);
        assertEquals(380, priceList[1]);
        assertEquals(590, priceList[2]);
    }

    @Test
    public void shouldReturnPriceListForRewardsCustomer() throws Exception {
        CustomerType customerType = CustomerType.Rewards;
        PriceCalculator priceCalculator = new PriceCalculator(customerType, reservationDays, hotelList);
        int[] priceList = priceCalculator.getHotelPrice();
        assertEquals(240, priceList[0]);
        assertEquals(270, priceList[1]);
        assertEquals(240, priceList[2]);
    }
}
