package main;

public class CustomerType {
    public static String getCustomerType(String inputInfo) {
        int start = inputInfo.indexOf(":");
        return inputInfo.substring(0, start);
    }
}
