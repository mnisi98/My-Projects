/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buy.a.car;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author mnisi
 */
public class BuyACar extends JFrame implements ActionListener
{

    /**
     * @param args the command line arguments
     */
    //Constants
    final int WIDTH = 480;
    final int HEIGHT = 230;
    
    final int HATCHBACK_BASE_PRICE = 130000;
    final int SEDAN_BASE_PRICE = 320000;
    final int SUV_BASE_PRICE = 430000;
    
    final int SUNROOF = 5000;
    final int TOUCHSCREEN = 1500;
    final int PARKING_SENSORS = 3800;
    final int MONTHS = 24;
    
    int totalPrice = 0;
    int monthlyPayment = 0;
    
    //Buttons for vehicle type
    JButton hatchback = new JButton("Hatchback");
    JButton sedan = new JButton("Sedan");
    JButton suv = new JButton("SUV");
   
    //Checkbox for extras
    JCheckBox sunroofcBox = new JCheckBox("Sunroof = R" + SUNROOF,false);
    JCheckBox touchscreencBox = new JCheckBox("Touchscreen = R" + TOUCHSCREEN,false);
    JCheckBox parkingSensorscBox = new JCheckBox("Parking Sensors = R" + PARKING_SENSORS,false);
    
    
    //Labels for application
    JLabel buyCarLbl = new JLabel("Buy A Car");
    JLabel totalHeadLbl = new JLabel("Total car price = R");
    JLabel totPriceLbl = new JLabel();
    JLabel welcomeLbl = new JLabel("Welcome to Car Price Check");
    JLabel instrucLbl = new JLabel("Please choose your extras, then click on the type of vehicle you would like to buy.");
    
    
    //Constructor
    public BuyACar()
    {
        super("Car Price Check");
        setLayout(new FlowLayout());
        setSize(WIDTH,HEIGHT);

        //Add components to form
        add(welcomeLbl);
        add(instrucLbl);
        add(sunroofcBox);
        add(touchscreencBox);
        add(parkingSensorscBox);
        add(totPriceLbl);
        add(hatchback);
        add(sedan);
        add(suv);
        
        //Listeners for buttons
        hatchback.addActionListener(this);
        sedan.addActionListener(this);
        suv.addActionListener(this);
        
        //Ensure program stops/exists after closing of application
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
   //Buttons actions
     @Override
    public void actionPerformed(ActionEvent e) {
        
        final JButton source = (JButton)e.getSource();
        
        //Hatchback button
        if(source.equals(hatchback))
            
        {
            totalPrice = HATCHBACK_BASE_PRICE;
           calculatePrice(totalPrice);
           
        }
        //Sedan button
      else if (source.equals(sedan))
        {
            totalPrice = SEDAN_BASE_PRICE;
            calculatePrice(totalPrice);
           
        }
        //SUV button
       else if ( source.equals(suv))
        {
            totalPrice = SUV_BASE_PRICE;
            calculatePrice(totalPrice);
            
        }
        
       
    }
    
    //Method to calculate price and monthly payment
    public void calculatePrice( int basePrice)
    {
        int total = basePrice;
        
        if (sunroofcBox.isSelected())
        {
            total += SUNROOF;
        }
        if (touchscreencBox.isSelected())
        {
            total += TOUCHSCREEN;
        }
        
        if (parkingSensorscBox.isSelected())
        {
            total += PARKING_SENSORS;
        }
        
        monthlyPayment = Math.round(total/ MONTHS);
        
        JOptionPane.showMessageDialog(null, "The total price of your car is R" + total + "\n Your monthly"
                + " payment will be R" + monthlyPayment + " pm for 24 months");
        
         
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        BuyACar fBac = new BuyACar();
        fBac.setVisible(true);
        
    }

   
    
}
