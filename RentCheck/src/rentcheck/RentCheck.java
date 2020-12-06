/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentcheck;
import javax.swing.*;
/**
 *
 * @author mnisi
 */
public class RentCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        int[][] rent = { {5400, 5450, 5510},
                         {5500, 4560, 5630},
                         {5625, 6676, 6740},
                         {7000, 7250, 7600} };
        String sFloor,sBed;
        int floor;
        int bedroom;
        
        JOptionPane.showMessageDialog(null, "Welcome to Rent Check applicaton, Press OK to continue.");
        
        sFloor =  JOptionPane.showInputDialog(null, "Enter floor number");
        //Subtract one as user will not assume floor 1 is actually floor 0.
        floor = Integer.parseInt(sFloor) -1;
        
        sBed = JOptionPane.showInputDialog(null, "Enter the number of bedrooms");
        //Subtract one as user will not assume bedroom 1 is actually bedroom 0.
        bedroom = Integer.parseInt(sBed) -1;
        
        JOptionPane.showMessageDialog(null, "The rent for the " + sBed + " bedroom apartment on floor " + sFloor +
                " is R" + rent[floor][bedroom] + " pm.");
             
        
        }
    }
    

