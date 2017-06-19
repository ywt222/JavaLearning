package main;

public class Hotel {
    private int rating;
    private int[] regularPriceList;
    private int[] rewardsPriceList;

    public Hotel(int rating, int[] regularPriceList, int[] rewardsPriceList) {
        this.rating = rating;
        this.regularPriceList = regularPriceList;
        this.rewardsPriceList = rewardsPriceList;
    }

    public int getRating() {
        return rating;
    }

    public int[] getRegularPriceList() {
        return regularPriceList;
    }

    public int[] getRewardsPriceList() {
        return rewardsPriceList;
    }
}
