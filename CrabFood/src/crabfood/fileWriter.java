/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crabfood;

import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.PriorityQueue;

/**
 *
 * @author user
 */
public class fileWriter {

    public fileWriter(ArrayList<Customer> customerList) {
        writeToLog(System.lineSeparator() + "" + timeStamp());
        writeToLog("|Customer| Arrival  |Order Time  |Finished Cooking Time "
                + "|Delivery Time\t |Total Time");
        while (!customerList.isEmpty()) {
            Customer current = customerList.remove(0);
            writeToLog("|" + current.getNumberOfArrival() + "\t |" + current.getArrivalTime() + "\t    |" + current.getArrivalTime() + "\t\t |" + current.getFinishCookingTime() + "\t\t\t|" + (current.getDeliveryTime()) + "\t\t |" + (current.getFinishCookingTime() + current.getDeliveryTime() - current.getArrivalTime()));
        }
    }

    //write output to log
    public static void writeToLog(String inputLine) {
        String fileName = "logfile.txt";
        File myfile = new File(fileName);

        try (FileWriter writer = new FileWriter(myfile, true)) {
            writer.write(inputLine + "" + System.lineSeparator());
        } catch (Exception e) {
            System.out.println("Error in writing to log file");
        }
    }

    public static String timeStamp() {
        // Create an instance of SimpleDateFormat used for formatting 
        // the string representation of date (month/day/year)
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Get the date today using Calendar object.
        Date today = Calendar.getInstance().getTime();
        // Using DateFormat format method we can create a string 
        // representation of a date with the defined format.
        String reportDate = df.format(today);

        // Return what date is today!
        return "Report Date: " + reportDate;
        //get the date according to format
    }

}
