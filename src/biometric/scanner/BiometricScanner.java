/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biometric.scanner;

import javax.swing.JFrame;

/**
 *
 * @author Arosha D
 */
public class BiometricScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Home home = new Home();
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setTitle("Biometric Scanner");
	home.setSize(960,760);
        home.setVisible(true);
        
        
    }
    
}
