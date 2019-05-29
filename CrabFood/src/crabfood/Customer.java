/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crabfood;

/**
 *
 * @author Asus
 */
public class Customer {

    int clock;  //arrival time
    private String shopName;
    private String dishOrdered;
    private int deliveryTime;
    private int numberOfArrival;    //?
    private int completeTime;
    private int finishCookingTime;
    private int destinationX;
    private int destinationY;

    public Customer(int clock, String shopName, String dishOrdered, int numberOfArrival) {
        this.clock = clock;
        this.shopName = shopName;
        this.dishOrdered = dishOrdered;
        this.numberOfArrival = numberOfArrival;
        this.destinationX = destinationX;
        this.destinationY = destinationY;
    }

    public Customer(int clock, String shopName, int destinationX, int destinationY, String dishOrdered, int deliveryTime, int numberOfArrival, int finishCookingTime, int completeTime) {
        this.clock = clock;
        this.shopName = shopName;
        this.dishOrdered = dishOrdered;
        this.deliveryTime = deliveryTime;
        this.numberOfArrival = numberOfArrival;
        this.completeTime = completeTime;
        this.finishCookingTime = finishCookingTime;
        this.destinationX = destinationX;
        this.destinationY = destinationY;
    }

    public int getArrivalTime() {
        return clock;
    }

    public String getShopName() {
        return shopName;
    }

    public String getDishOrdered() {
        return dishOrdered;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public int getNumberOfArrival() {
        return numberOfArrival;
    }

    public int getCompleteTime() {
        return completeTime;
    }

    public int getFinishCookingTime() {
        return finishCookingTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public void setCompleteTime(int completeTime) {
        this.completeTime = completeTime;
    }

    public void setFinishCookingTime(int finishCookingTime) {
        this.finishCookingTime = finishCookingTime;
    }

    public int getDestinationX() {
        return destinationX;
    }

    public int getDestinationY() {
        return destinationY;
    }

}
