package main;

import main.model.CustomerType;

public class CustomerTypeGetter {
    private String inputInfo;

    public CustomerTypeGetter(String inputInfo) {
        this.inputInfo = inputInfo;
    }

    public CustomerType getCustomerType() {
        int start = inputInfo.indexOf(":");
        try {
            return CustomerType.valueOf(inputInfo.substring(0, start));
        } catch (Exception e) {
            System.out.println("Customer Type is not correct. Error: " + e);
            throw e;
        }
    }
}
