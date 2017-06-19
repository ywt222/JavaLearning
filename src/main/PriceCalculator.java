package main;

public class PriceCalculator {
    public static int[] getHotelPrice(String customerType, int[] reservationDays, Hotel[] hotelList) {
        Hotel lakewood = hotelList[0];
        Hotel bridgewood = hotelList[1];
        Hotel ridgewood = hotelList[2];

        int[] lakewoodPriceList = {};
        int[] bridgewoodPriceList = {};
        int[] ridgewoodPriceList = {};

        if (customerType.equals("Regular")) {
            lakewoodPriceList = lakewood.getRegularPriceList();
            bridgewoodPriceList = bridgewood.getRegularPriceList();
            ridgewoodPriceList = ridgewood.getRegularPriceList();
        } else if (customerType.equals("Rewards")) {
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

        int weekdayCount = reservationDays[0];
        int weekendCount = reservationDays[1];

        int lakewoodPrice = calculateHotelPrice(lakewoodWeekdayPrice, lakewoodWeekendPrice, weekdayCount, weekendCount);
        int bridgewoodPrice = calculateHotelPrice(bridgewoodWeekdayPrice, bridgewoodWeekendPrice, weekdayCount, weekendCount);
        int ridgewoodPrice = calculateHotelPrice(ridgewoodWeekdayPrice, ridgewoodWeekendPrice, weekdayCount, weekendCount);

        int[] priceList = {lakewoodPrice, bridgewoodPrice, ridgewoodPrice};
        return priceList;
    }

    private static int calculateHotelPrice(int weekdayPrice, int weekendPrice, int weekdayCount, int weekendCount) {
        return weekdayPrice * weekdayCount + weekendPrice * weekendCount;
    }
}
