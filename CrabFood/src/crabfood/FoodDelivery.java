/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crabfood;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Asus
 */
public class FoodDelivery {

    Shop[] run;  //run refObject from shop class
    int num = 0;
    int count;
    int choice;
    ArrayList<Customer> logging; //creating a logging system   
    fileWriter f;

    public FoodDelivery() {
        this.count = count;
        run = new Shop[count];    //16 objects created
    }

    public FoodDelivery(int count, int i) {
        this.count = count;
        run = new Shop[count];    //16 objects created
        this.logging = new ArrayList<>(i);
    }

    //data fields under Shop class
    public void addLast(String shopName, String[] dishType, int[] prepareTime, int x, int y) {
        run[num] = new Shop(shopName, dishType, prepareTime, x, y);
        num++;
    }

    public void addLastM(String shopName, int x, int y, String dish) {
        run[num] = new Shop(shopName, x, y, dish);
        num++;
    }

    public int getWaitingTime(int z) {
        return run[z].waitingTime;
    }

    //
    public void minusWaitingTime(int z) {
        run[z].waitingTime--;   //???
    }

    public int getx(int n) {
        return run[n].x;
    }

    public int gety(int n) {
        return run[n].y;
    }

    public String getShopName(int n) {
        return run[n].shopName;
    }

    public void receiveOrder(Customer c) {
        int totalDuration = 0;
        int minDuration = 10000000;
        //int choice=0; //which branch with the shortest duration

        //reporting system
        System.out.println(c.getArrivalTime() + ": Customer " + c.getNumberOfArrival() + " wants to order " + c.getDishOrdered() + " from " + c.getShopName() + ".");
        //find out order of shop from queue (ith shop)
        for (int i = 0; i < count; i++) {
            if (c.getShopName().equals(getShopName(i))) {
                //find out which dish (from 4 types of dishes in a shop)
                for (int d = 0; d < run[i].dishType.length; d++) {
                    if (c.getDishOrdered().equals(run[i].dishType[d])) {  //  run[i].dishType[d] - which shop which dish    
                        totalDuration = getx(i) + gety(i) + run[i].prepareTime[d] + run[i].waitingTime;

                    }
                }
                System.out.println("    Estimated time needed for branch at(" + getx(i) + "," + gety(i) + ") to finish and deliver the order= " + totalDuration);
                if (totalDuration < minDuration) {
                    minDuration = totalDuration;
                    choice = i;
                }
            }
        }

        System.out.println(c.getArrivalTime() + ": Branch of " + run[choice].shopName + " at (" + run[choice].x + ", " + run[choice].y + ") take the order.");
        int delay2 = trafficJam(getx(choice), gety(choice));

        //queue of that dish
        for (int i = 0; i < run[choice].dishType.length; i++) {
            if (c.getDishOrdered().equals(run[choice].dishType[i])) {
                c.setFinishCookingTime(c.getArrivalTime() + run[choice].prepareTime[i] + run[choice].waitingTime);
                run[choice].waitingTime += run[choice].prepareTime[i];
            }
        }

        c.setDeliveryTime(getx(choice) + gety(choice) + delay2);
        c.setCompleteTime(c.getFinishCookingTime() + c.getDeliveryTime());
        run[choice].order.enqueue(c);
    }

    public int delivery(int num2) {
        int delivered = 0;
        Customer temp;

        for (int i = 0; i < count; i++) {
            for (int m = 0; m < 4; m++) {
                if (!run[i].order.isEmpty()) {
                    for (int n = 0; n < run[i].order.getQueueLine(); n++) {
                        temp = (Customer) run[i].order.getCustomerDetail(n);
                        if (temp.getDishOrdered().equals(run[i].dishType[m])) {
                            if (temp.getFinishCookingTime() == num2) {
                                //reporting system
                                System.out.println(num2 + ": Branch of " + run[i].shopName + " at (" + run[i].x + ", " + run[i].y + ") finish customer " + temp.getNumberOfArrival() + "'s order.");
                                System.out.println(num2 + ": Start deliver the food to customer " + temp.getNumberOfArrival());
                            }
                        }

                        if (num2 == temp.getCompleteTime()) {
                            System.out.println(num2 + ": The food has been delivered to customer " + temp.getNumberOfArrival());

                            logging.add((Customer) run[i].order.dequeue());

                            delivered++;
                        }
                    }
                }
            }
        }

        return delivered;
    }

    public int trafficJam(int x, int y) {
        Random r = new Random();
        int occurJam;
        int delay = 0;
        occurJam = r.nextInt(10);
        if (occurJam < 3) {
            delay = r.nextInt(10) + 1;
            System.out.println("!=============================================================================!");
            System.out.println(" --------There is traffic jam at (" + x + ", " + y + "),estimated delay =" + delay + " !----------");
            System.out.println("!=============================================================================!");
        }
        return delay;
    }
}
