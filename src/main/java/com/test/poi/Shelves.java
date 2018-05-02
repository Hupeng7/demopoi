package com.test.poi;

/**
 * @author Black
 * @time 2018/5/2.
 */
public class Shelves {
    private String shelves_no;
    private String shelvesName;
    private String  shelvesAddress;
    private String goodsName;
    private int goodsNumber;

    public Shelves(String shelves_no, String shelvesName, String shelvesAddress, String goodsName, int goodsNumber) {
        this.shelves_no = shelves_no;
        this.shelvesName = shelvesName;
        this.shelvesAddress = shelvesAddress;
        this.goodsName = goodsName;
        this.goodsNumber = goodsNumber;
    }

    public String getShelves_no() {
        return shelves_no;
    }

    public void setShelves_no(String shelves_no) {
        this.shelves_no = shelves_no;
    }

    public String getShelvesName() {
        return shelvesName;
    }

    public void setShelvesName(String shelvesName) {
        this.shelvesName = shelvesName;
    }

    public String getShelvesAddress() {
        return shelvesAddress;
    }

    public void setShelvesAddress(String shelvesAddress) {
        this.shelvesAddress = shelvesAddress;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    @Override
    public String toString() {
        return "Shelves{" +
                "shelves_no='" + shelves_no + '\'' +
                ", shelvesName='" + shelvesName + '\'' +
                ", shelvesAddress='" + shelvesAddress + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsNumber=" + goodsNumber +
                '}';
    }
}
