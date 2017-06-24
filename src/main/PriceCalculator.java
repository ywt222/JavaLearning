package main;

import main.model.CustomerType;
import main.model.Hotel;

public class PriceCalculator {
    private CustomerType customerType;
    private int[] reservationDaysCount;
    private Hotel[] hotelList;

    public PriceCalculator(CustomerType customerType, int[] reservationDaysCount, Hotel[] hotelList) {
        this.customerType = customerType;
        this.reservationDaysCount = reservationDaysCount;
        this.hotelList = hotelList;
    }

    public int[] getHotelPrice() {
        Hotel lakewood = hotelList[0];
        Hotel bridgewood = hotelList[1];
        Hotel ridgewood = hotelList[2];

        int[] lakewoodPriceList = {};
        int[] bridgewoodPriceList = {};
        int[] ridgewoodPriceList = {};

        if (customerType.equals(CustomerType.Regular)) {
            lakewoodPriceList = lakewood.getRegularPriceList();
            bridgewoodPriceList = bridgewood.getRegularPriceList();
            ridgewoodPriceList = ridgewood.getRegularPriceList();
        } else if (customerType.equals(CustomerType.Rewards)) {
            lakewoodPriceList = lakewood.getRewardsPriceList();
            bridgewoodPriceList = bridgewood.getRewardsPriceList();
            ridgewoodPriceList = ridgewood.getRewardsPriceList();
        }

        int lakewoodWeekdayPrice = lakewoodPriceList[0];
        int lakewoodWeekendPrice = lakewoodPriceList[1];
        int bridgewoodWeekdayPrice = bridgewoodPriceList[0];
        int bridgewoodWeekendPrice = bridgewoodPriceList[1];
        int ridgewoodWeekdayPrice = ridgewoodPriceList[0];
        int ridgewoodWeekendPrice = ridgewoodPriceList[1];

        int weekdayCount = reservationDaysCount[0];
        int weekendCount = reservationDaysCount[1];

        int lakewoodPrice = calculateHotelPrice(lakewoodWeekdayPrice, lakewoodWeekendPrice, weekdayCount, weekendCount);
        int bridgewoodPrice = calculateHotelPrice(bridgewoodWeekdayPrice, bridgewoodWeekendPrice, weekdayCount, weekendCount);
        int ridgewoodPrice = calculateHotelPrice(ridgewoodWeekdayPrice, ridgewoodWeekendPrice, weekdayCount, weekendCount);

        int[] priceList = {lakewoodPrice, bridgewoodPrice, ridgewoodPrice};
        return priceList;
    }

    private int calculateHotelPrice(int weekdayPrice, int weekendPrice, int weekdayCount, int weekendCount) {
        return weekdayPrice * weekdayCount + weekendPrice * weekendCount;
    }
}
