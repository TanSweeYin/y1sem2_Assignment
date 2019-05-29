/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crabfood;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class MainGUI extends javax.swing.JFrame {

    private static String input;
    private static ArrayList<Customer> customerList;
    private printLogFileGUI result;
    static private MainGUI cb;

    /**
     * Creates new form MainGUI
     */
    public static int getNumberOfCustomer() {
        int order = 1;
        try {
            Scanner s = new Scanner(new FileInputStream("Customer.txt"));
            while (s.hasNextLine()) {
                String read = s.nextLine();
                //another customer
                if (read.equals("")) {
                    order++;
                }
            }
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return order;
    }

    //!!!
    public static String getvalue(int shop, int value) {
        int loop = 1, line = 0;
        String data = null;
        try {
            Scanner s = new Scanner(new FileInputStream("Input.txt"));
            while (s.hasNextLine()) {
                String read = s.nextLine();
                line++;
                if (read.equals("")) {
                    loop++;
                    line = 0;
                }
                if (shop == loop && value == line) {
                    data = read;    //copy String to data
                }
            }
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return data;
    }

    public static String getCustomer(int number, int value) {
        int loop = 1, line = 0;
        String data = null;
        try {
            Scanner s = new Scanner(new FileInputStream("Customer.txt"));
            while (s.hasNextLine()) {
                String read = s.nextLine();
                line++;
                if (read.equals("")) {
                    loop++;
                    line = 0;
                }
                if (number == loop && value == line) {
                    data = read;
                }
            }
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return data;
    }

    public MainGUI() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        Enter = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Automated", "Manual"}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        Enter.setText("Enter");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("WELCOME TO ABC FOOD DELIVERY!\n\nSelect manually or automated\ngenerating customers: ");
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Enter))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Enter))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        input = jComboBox1.getSelectedItem().toString();


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        result = new printLogFileGUI(customerList);
        System.out.println(input);
        if (input.equalsIgnoreCase("Manual")) {
            ManualGUI mg = new ManualGUI();
            mg.setVisible(true);
            try {
                PrintWriter writer = new PrintWriter("manuallog.txt");
                writer.print("");
                writer.close();
            } catch (Exception e) {
                System.out.println("Fail to rewrite file.");
            }
        } else {

            cb = new MainGUI();
            cb.setVisible(false);
            result.setVisible(true);
        }
    }//GEN-LAST:event_EnterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                //first
                String[][] dish = new String[4][4];
                int[][] prepareTime = new int[4][4];

                FoodDelivery start = new FoodDelivery(16, getNumberOfCustomer());    //count?
                Shop shop = new Shop(start.choice, start.choice);
                customerList = new ArrayList<>();

                for (int n = 0; n < 4; n++) {
                    for (int i = 0; i < 4; i++) {
                        dish[n][i] = getvalue((1 + n), 6 + (2 * i));         //(read frm input)getValue(int shop, int dish)- shop 1/2/3/4 - dish , dish[n][i]:dish name
                        prepareTime[n][i] = Integer.parseInt(getvalue((1 + n), 7 + (2 * i)));    //(read frm input)prepare time for different dish , String -> Integer: Integer.parseInt
                    }
                    //?? Character.getNumericValue
                    for (int m = 0; m < 4; m++) {
                        //start.addLast(shop name, dish name :String[][] , prepareTime , get int x from string, ...y 
                        start.addLast(getvalue((1 + n), 1), dish[n], prepareTime[n], Character.getNumericValue(getvalue((1 + n), 2 + m).charAt(0)), Character.getNumericValue(getvalue((1 + n), 2 + m).charAt(2)));
                    }
                }

                //map
                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        int get = 0;
                        for (int i = 0; i < start.count; i++) {
                            if (x == start.getx(i) && y == start.gety(i)) {
                                System.out.print(start.getShopName(i).charAt(0) + "  ");
                                get = 1;
                            }
                        }
                        if (get == 0) {
                            System.out.print("0  ");
                        }
                    }
                    System.out.println("");
                }

                System.out.println("");
                //reporting system
                int numberOfArrival = 0;
                int delivered = 0;
                int count = 0;
                while (delivered != getNumberOfCustomer()) {
                    if (count == 0) {
                        System.out.println(count + ": A new day has start");
                    }
                    for (int i = 0; i < start.count; i++) {
                        if (start.getWaitingTime(i) > 0) {
                            start.minusWaitingTime(i);
                        }
                    }
                    for (int i = 0; i < getNumberOfCustomer(); i++) {
                        if (count == Integer.parseInt(getCustomer(1 + i, 1))) {
                            numberOfArrival++;
                            Customer c = new Customer(Integer.parseInt(getCustomer(1 + i, 1)), getCustomer(1 + i, 2), getCustomer(1 + i, 3), numberOfArrival);
                            start.receiveOrder(c);
                        }
                    }
                    delivered += start.delivery(count);
                    if (delivered == getNumberOfCustomer()) {
                        System.out.println(count + ": All Customer served and shops are closed");
                    }

                    count++;
                }

                System.out.println("");
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("|Customer |Arrival |Order Time |Finished Cooking Time |Delivery Time |Total Time ");
                Customer c;
                for (int i = 1; i <= getNumberOfCustomer(); i++) {
                    for (int n = 0; n < getNumberOfCustomer(); n++) {
                        c = (Customer) start.logging.get(n);
                        if (c.getNumberOfArrival() == i) {
                            System.out.format("|%-9d|%-8d|%-11d|%-22d|%-14d|%-10d", c.getNumberOfArrival(), c.getArrivalTime(), c.getArrivalTime(), c.getFinishCookingTime(), (c.getDeliveryTime()), (c.getFinishCookingTime() + c.getDeliveryTime() - c.getArrivalTime()));
                            System.out.println();
                        }
                    }

                }
                Customer p;
                for (int i = 1; i <= getNumberOfCustomer(); i++) {
                    for (int n = 0; n < getNumberOfCustomer(); n++) {
                        p = (Customer) start.logging.get(n);
                        if (p.getNumberOfArrival() == i) {
                            customerList.add(p);
                        }
                    }
                }
            }
        });
        new MainGUI().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enter;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
