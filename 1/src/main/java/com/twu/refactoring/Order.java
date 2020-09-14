package com.twu.refactoring;

import java.util.List;

public class Order {
    String customerName;
    String customerAddress;
    List<LineItem> lineItems;
    String date;
    String customerLoyaltyNumber;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerLoyaltyNumber() {
        return customerLoyaltyNumber;
    }

    public void setCustomerLoyaltyNumber(String customerLoyaltyNumber) {
        this.customerLoyaltyNumber = customerLoyaltyNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public Order(String customerName, String customerAddress, List<LineItem> lineItems) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.lineItems = lineItems;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }
}
