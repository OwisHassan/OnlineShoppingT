package com.owishassan.onlineshoppingt;

public class ItemInfo {

    int item_Photo;

    String item_Name;
    String item_Description;

    Double item_Price;
    Double item_Rate;

    public ItemInfo(int item_Photo, String item_Name, String item_Description, Double item_Price, Double item_Rate) {
        this.item_Photo = item_Photo;
        this.item_Name = item_Name;
        this.item_Description = item_Description;
        this.item_Price = item_Price;
        this.item_Rate = item_Rate;
    }

    public int getItem_Photo() {
        return item_Photo;
    }

    public String getItem_Name() {
        return item_Name;
    }

    public String getItem_Description() {
        return item_Description;
    }

    public Double getItem_Price() {
        return item_Price;
    }

    public Double getItem_Rate() {
        return item_Rate;
    }

    public void setItem_Photo(int item_Photo) {
        this.item_Photo = item_Photo;
    }

    public void setItem_Name(String item_Name) {
        this.item_Name = item_Name;
    }

    public void setItem_Description(String item_Description) {
        this.item_Description = item_Description;
    }

    public void setItem_Price(Double item_Price) {
        this.item_Price = item_Price;
    }

    public void setItem_Rate(Double item_Rate) {
        this.item_Rate = item_Rate;
    }
}
