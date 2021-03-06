package Model;

import java.util.ArrayList;

public class Off {
    private static ArrayList<Off> allOffs = new ArrayList<>();
    private String offID;
    private String startTime;
    private String endTime;
    private int offAmount;
    private OffStatus offStatus;
    private ArrayList<Product> products;

    public Off(String offID, String startTime, String endTime, int offAmount) {
        this.offID = offID;
        this.startTime = startTime;
        this.endTime = endTime;
        this.offAmount = offAmount;
        offStatus = OffStatus.PENDING_FOR_CREATION;
        products = new ArrayList<>();
        allOffs.add(this);
    }

    public Off() {
        this("", "", "", 0);
    }

    public String getOffID() {
        return offID;
    }

    public void setOffID(String offID) {
        this.offID = offID;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getOffAmount() {
        return offAmount;
    }

    public void setOffAmount(int offAmount) {
        this.offAmount = offAmount;
    }

    public OffStatus getOffStatus() {
        return offStatus;
    }

    public void setOffStatus(OffStatus offStatus) {
        this.offStatus = offStatus;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public static ArrayList<Off> getAllOffs() {
        return allOffs;
    }
}
