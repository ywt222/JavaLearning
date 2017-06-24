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

        CustomerTypeGetter customerTypeGetter = new CustomerTypeGetter(inputInfo);
        CustomerType customerType = customerTypeGetter.getCustomerType();

        ReservationDays reservationDays = new ReservationDays(inputInfo);
        int[] reservationDaysCount = reservationDays.getReservationDate();

        Hotel[] hotelList = HotelDetail.getHotelDetail();

        PriceCalculator priceCalculator = new PriceCalculator(customerType, reservationDaysCount, hotelList);
        int[] priceList = priceCalculator.getHotelPrice();

        int[] ratingList = {hotelList[0].getRating(), hotelList[1].getRating(), hotelList[2].getRating()};

        HotelComparator hotelComparator = new HotelComparator(priceList, ratingList);
        String outputHotel = hotelComparator.compareHotel();

        System.out.println(outputHotel);
    }
}
