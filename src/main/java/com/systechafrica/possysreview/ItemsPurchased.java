package com.systechafrica.possysreview;

public class ItemsPurchased {
    private String itemCode;
    private int quantity;
    private double pricePerItem;
    private double totalValue;

    public ItemsPurchased(String itemCode, int quantity, double pricePerItem, double totalValue) {
        this.itemCode = itemCode;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
        this.totalValue = totalValue;
    }

    public String getItemCode() {
        return itemCode;

    }

    public int getQuantity() {
        return quantity;

    }

    public double getpricePerItem() {
        return pricePerItem;
    }

    public double getTotalValue() {
        return totalValue;
    }
}