/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.bed.management;

/**
 *
 * @author Skanda Prasad
 */
public class HospitalBedManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new welcome().setVisible(true);
            }
        });
        
        
        
    }
    
}
