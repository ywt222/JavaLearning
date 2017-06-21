package main;

import main.model.CustomerType;

public class CustomerTypeGetter {
    public static CustomerType getCustomerType(String inputInfo) {
        int start = inputInfo.indexOf(":");
        try {
            return CustomerType.valueOf(inputInfo.substring(0, start));
        } catch (Exception e) {
            System.out.println("Customer Type is not correct. Error: " + e);
            throw e;
        }
    }
}
