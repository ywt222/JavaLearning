package main;

public class HotelComparator {
    private int[] priceList;
    private int[] ratingList;

    public HotelComparator(int[] priceList, int[] ratingList) {
        this.priceList = priceList;
        this.ratingList = ratingList;
    }

    public String compareHotel() {
        int lakewoodPrice = priceList[0];
        int bridgewoodPrice = priceList[1];
        int ridgewoodPrice = priceList[2];

        int lakewoodRating = ratingList[0];
        int bridgewoodRating = ratingList[1];
        int ridgewoodRating = ratingList[2];

        int cheapestPrice = lakewoodPrice;
        String cheapestHotelName = "Lakewood";
        int cheapestRating = lakewoodRating;

        if (cheapestPrice > bridgewoodPrice || (cheapestPrice == bridgewoodPrice && cheapestRating < bridgewoodRating)) {
            cheapestPrice = bridgewoodPrice;
            cheapestHotelName = "Bridgewood";
            cheapestRating = bridgewoodRating;
        }

        if (cheapestPrice > ridgewoodPrice || (cheapestPrice == ridgewoodPrice && cheapestRating < ridgewoodRating)) {
            cheapestHotelName = "Ridgewood";
        }

        return cheapestHotelName;
    }
}
