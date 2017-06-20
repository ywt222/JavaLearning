package main;

import main.model.CustomerType;

public class CustomerTypeGetter {
    public static CustomerType getCustomerType(String inputInfo) {
        int start = inputInfo.indexOf(":");
        return CustomerType.valueOf(inputInfo.substring(0, start));
    }
}
