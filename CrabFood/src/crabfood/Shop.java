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
public class Shop<Customer> {

    String shopName, dish;
    int waitingTime;
    Queue<Customer> order;   //Overall queue of cutomer
    int x, y;                //Coordinates of branch
    String[] dishType = new String[4]; //4 types of dish sold in a shop
    int[] prepareTime = new int[4];    //preparation time for each dish

    public Shop(String shopName, String[] dishType, int[] prepareTime, int x, int y) {
        this.shopName = shopName;
        this.dishType = dishType;
        this.prepareTime = prepareTime;
        this.x = x;
        this.y = y;
        this.waitingTime = 0;
        this.order = new Queue<>();
    }

    public Shop(String shop, int x, int y, String dish) {
        this.shopName = shopName;
        this.order = order;
        this.x = x;
        this.y = y;
        this.dish = dish;
        this.order = new Queue<>();
    }

    public Shop(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
