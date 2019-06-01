/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crabfood;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ManualGUI<E> extends javax.swing.JFrame {

    Random r = new Random();
    printLogFileGUI pf;
    private int click = 1, cusCount = 0, prepareTime = 20;
    ArrayList<Customer> customerList = new ArrayList<>();
    ArrayList<Customer> list = new ArrayList<>();
    ArrayList<Integer> time = new ArrayList<>();
    ArrayList<String> shop = new ArrayList<>();
    ArrayList<Integer> branch = new ArrayList<>();
    ArrayList<String> dish = new ArrayList<>();
    ArrayList<String> all = new ArrayList<>();
    ArrayList<Integer> delivertime = new ArrayList<>();

    /**
     * Creates new form ManualGUI
     */
    public ManualGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ShopName = new javax.swing.JComboBox<>();
        ShopNameB = new javax.swing.JButton();
        Dish = new javax.swing.JComboBox<>();
        finish = new javax.swing.JButton();
        enterMsg = new javax.swing.JLabel();
        Time = new javax.swing.JComboBox<>();
        Branch = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ShopName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Shop","Crusty Crab", "Phum Bucket", "Burger Krusty", "Aori Ramen" }));
        ShopName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ShopNameItemStateChanged(evt);
            }
        });
        ShopName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShopNameActionPerformed(evt);
            }
        });

        ShopNameB.setText("Enter");
        ShopNameB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShopNameBActionPerformed(evt);
            }
        });

        if (ShopName.getSelectedItem().toString().equalsIgnoreCase("Crusty Crab")) {
            Dish.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            Dish.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Dish", "Crabby Patty", "Crabby Meal", "Sailors Surprise", "Kelp Juice"}));
        }
        else if (ShopName.getSelectedItem().toString().equals("Phum Bucket")) {
            Dish.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Dish", "Phum Burger", "Phum Fries", "Phum Pie", "Phum StickyWeeds"}));

        }
        else if (ShopName.getSelectedItem().toString().equalsIgnoreCase("Burger Krusty")) {
            Dish.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Dish", "The Klogger", "Fish Sandwich", "Twisty Lard", "Apple Pineapple"}));

        }
        else  {
            Dish.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Dish", "Cheese Tteokbokki", "Bibimbap", "Soju Ramen", "Sunset Rum"}));

        }
        Dish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DishActionPerformed(evt);
            }
        });

        finish.setText("Finish");
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });

        enterMsg.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N

        Time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Time","0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"}));

        if (ShopName.getSelectedItem().toString().equalsIgnoreCase("Crusty Crab")) {
            Branch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            Branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Branch", "3 3", "2 0", "4 4", "2 3"}));
        }
        else if (ShopName.getSelectedItem().toString().equals("Phum Bucket")) {
            Branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Branch", "1 3", "2 2", "4 1", "0 5"}));

        }
        else if (ShopName.getSelectedItem().toString().equalsIgnoreCase("Burger Krusty")) {
            Branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Branch", "1 4", "0 1", "4 0", "7 7"}));

        }
        else  {
            Branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Branch", "1 5", "2 7", "3 5", "7 4"}));
            Dish.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Dish", "Cheese Tteokbokki", "Bibimbap", "Soju Ramen", "Sunset Rum"}));
        }

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Select based on your choice : ");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Branch, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ShopName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ShopNameB, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(finish))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enterMsg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Dish, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShopName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(enterMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShopNameB)
                    .addComponent(finish))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShopNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShopNameActionPerformed

    }//GEN-LAST:event_ShopNameActionPerformed

    private void ShopNameBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShopNameBActionPerformed
        enterMsg.setText("Entered successfully : " + click);

        try {
            PrintWriter p = new PrintWriter(new FileOutputStream("manuallog.txt", true));
            p.println(Time.getSelectedItem().toString());
            p.println(ShopName.getSelectedItem().toString());
            p.println(Branch.getSelectedItem().toString());
            p.println(Dish.getSelectedItem().toString());
            p.println();

            p.close();
        } catch (Exception e) {
            System.out.println("Error in writing file");
        }

        click++;

    }//GEN-LAST:event_ShopNameBActionPerformed

    private void ShopNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ShopNameItemStateChanged

        if (ShopName.getSelectedItem().toString().equalsIgnoreCase("Crusty Crab")) {
            Branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Branch", "3 3", "2 0", "4 4", "2 3"}));
            Dish.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Dish", "Crabby Patty", "Crabby Meal", "Sailors Surprise", "Kelp Juice"}));

        } else if (ShopName.getSelectedItem().toString().equals("Phum Bucket")) {
            Branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Branch", "1 3", "2 2", "4 1", "0 5"}));
            Dish.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Dish", "Phum Burger", "Phum Fries", "Phum Pie", "Phum StickyWeeds"}));

        } else if (ShopName.getSelectedItem().toString().equalsIgnoreCase("Burger Krusty")) {
            Branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Branch", "1 4", "0 1", "4 0", "7 7"}));
            Dish.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Dish", "The Klogger", "Fish Sandwich", "Twisty Lard", "Apple Pineapple"}));

        } else {
            Branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Branch", "1 5", "2 7", "3 5", "7 4"}));
            Dish.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Dish", "Cheese Tteokbokki", "Bibimbap", "Soju Ramen", "Sunset Rum"}));
        }


    }//GEN-LAST:event_ShopNameItemStateChanged

    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
          int cusCount = 0;
        int delivery = 0;
        try {
            Scanner s = new Scanner(new FileInputStream("manuallog.txt"));
            while (s.hasNextLine()) {
                String data = s.nextLine();
                all.add(data);
                if (data.equals("")) {
                    cusCount++;
                }

            }
        } catch (Exception e) {
            System.out.println("Error reading file");
        }
        //remove empty data
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).isEmpty()) {
                all.remove(i);
            }
        }
        //System.out.println(all.size());
        for (int i = 0; i < all.size(); i++) {
            time.add(Integer.parseInt(all.get(i)));
            i++;
            shop.add(all.get(i));
            i++;
            String string = all.get(i);
            String[] split = string.split(" ");
            String part1 = split[0];
            String part2 = split[1];
            delivery = Integer.parseInt(part1) + Integer.parseInt(part2);
            branch.add(Integer.parseInt(part1));
            branch.add(Integer.parseInt(part2));
            delivertime.add(delivery);
            i++;
            dish.add(all.get(i));
        }
        int delivered = 0,n=0, numberOfArrival = 1,b=0,g=0,b1=0;
       while(delivered!=cusCount){
           if(n==0)
               System.out.println(n+" : A new day has start!");
         
           for(int i=0;i<shop.size();i++){
                   if(n==time.get(i)){
                       System.out.println(n+" : Customer "+(i+1)+" wants to order "+dish.get(i)+" at branch ("+ branch.get(b1)+","+ branch.get(b1+1)+") from "+ shop.get(i)+".");
                       b1++;b1++;
                   }
                   if(n==(time.get(i)+20)){
                      System.out.println(n+" : Branch of "+ shop.get(i)+" at ("+ branch.get(b)+","+ branch.get(b+1)+") finish the order and start to deliver the food to customer "+(i+1)+".");
                      b++;b++;
                   }
                   if(n==(delivertime.get(i)+time.get(i)+20)){
                       System.out.println(n+" : Food have been delivered to customer "+(i+1)+".");
                       delivered++;
                   }                  
           }           
           n++;
       }
       if(delivered == cusCount)
            System.out.println((n-1)+" : All customers had been served and shops are closed.");
        
       for (int i = 0; i < cusCount; i++) {
            Customer c = new Customer(time.get(i), shop.get(i), branch.get(g), branch.get(g + 1), dish.get(i), delivertime.get(i), numberOfArrival, (20 + time.get(i)), (20 + time.get(i) + delivertime.get(i)));
            customerList.add(c);
            g++;
            g++;
            numberOfArrival++;
        } 
       

        pf = new printLogFileGUI(customerList);
        pf.setVisible(true);
    }//GEN-LAST:event_finishActionPerformed

    private void DishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DishActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Branch;
    private javax.swing.JComboBox<String> Dish;
    private javax.swing.JComboBox<String> ShopName;
    private javax.swing.JButton ShopNameB;
    private javax.swing.JComboBox<String> Time;
    private javax.swing.JLabel enterMsg;
    private javax.swing.JButton finish;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
