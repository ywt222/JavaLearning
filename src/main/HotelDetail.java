package main;

import main.model.Hotel;

public class HotelDetail {
    public static Hotel[] getHotelDetail() {
        int lakewoodRating = 3;
        int bridgewoodRating = 4;
        int ridgewoodRating = 5;

        int[] lakewoodRegularPriceList = {110, 90};
        int[] lakewoodRewardsPriceList = {80, 80};

        int[] bridgewoodRegularPriceList = {160, 60};
        int[] bridgewoodRewardsPriceList = {110, 50};

        int[] ridgewoodRegularPriceList = {220, 150};
        int[] ridgewoodRewardsPriceList = {100, 40};

        Hotel lakewood = new Hotel(lakewoodRating, lakewoodRegularPriceList, lakewoodRewardsPriceList);
        Hotel bridgewood = new Hotel(bridgewoodRating, bridgewoodRegularPriceList, bridgewoodRewardsPriceList);
        Hotel ridgewood = new Hotel(ridgewoodRating, ridgewoodRegularPriceList, ridgewoodRewardsPriceList);

        Hotel[] hotelList = {lakewood, bridgewood, ridgewood};
        return hotelList;
    }
}
