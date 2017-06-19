package main;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputInfo = "Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)";
//        String inputInfo = "Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)";
//        String inputInfo = "Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)";

        String consumerType = CustomerType.getCustomerType(inputInfo);
        int[] reservationDays = ReservationDays.getReservationDate(inputInfo);
        Hotel[] hotelList = HotelDetail.getHotelDetail();
        int[] priceList = PriceCalculator.getHotelPrice(consumerType, reservationDays, hotelList);
        int[] ratingList = {hotelList[0].getRating(), hotelList[1].getRating(), hotelList[2].getRating()};
        String outputHotel = HotelComparator.compareHotel(priceList, ratingList);

        System.out.println(outputHotel);
    }
}
