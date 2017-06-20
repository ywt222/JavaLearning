package main;

import main.model.CustomerType;
import main.model.Hotel;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("src/main/input/input.txt");
        Scanner sc = new Scanner(file);
        String inputInfo = sc.nextLine();

        CustomerType customerType = CustomerTypeGetter.getCustomerType(inputInfo);
        int[] reservationDays = ReservationDays.getReservationDate(inputInfo);
        Hotel[] hotelList = HotelDetail.getHotelDetail();
        int[] priceList = PriceCalculator.getHotelPrice(customerType, reservationDays, hotelList);
        int[] ratingList = {hotelList[0].getRating(), hotelList[1].getRating(), hotelList[2].getRating()};
        String outputHotel = HotelComparator.compareHotel(priceList, ratingList);

        System.out.println(outputHotel);
    }
}
