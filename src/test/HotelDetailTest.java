package test;

import main.model.Hotel;
import main.HotelDetail;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelDetailTest {
    @Test
    public void shouldReturnHotelDetails() throws Exception {
        Hotel[] hotelList = HotelDetail.getHotelDetail();
        Hotel lakewood = hotelList[0];
        Hotel bridgewood = hotelList[1];
        Hotel ridgewood = hotelList[2];

        assertEquals(3, lakewood.getRating());
        assertEquals(4, bridgewood.getRating());
        assertEquals(5, ridgewood.getRating());

        assertEquals(110, lakewood.getRegularPriceList()[0]);
        assertEquals(90, lakewood.getRegularPriceList()[1]);
        assertEquals(80, lakewood.getRewardsPriceList()[0]);
        assertEquals(80, lakewood.getRewardsPriceList()[1]);

        assertEquals(160, bridgewood.getRegularPriceList()[0]);
        assertEquals(60, bridgewood.getRegularPriceList()[1]);
        assertEquals(110, bridgewood.getRewardsPriceList()[0]);
        assertEquals(50, bridgewood.getRewardsPriceList()[1]);

        assertEquals(220, ridgewood.getRegularPriceList()[0]);
        assertEquals(150, ridgewood.getRegularPriceList()[1]);
        assertEquals(100, ridgewood.getRewardsPriceList()[0]);
        assertEquals(40, ridgewood.getRewardsPriceList()[1]);
    }
}
