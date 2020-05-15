/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbotubes;

/**
 *
 * @author Aris Febriansyah
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        loginform login = new loginform();
        login.setVisible(true);
       
        singupform signup = new singupform();
        signup.setVisible(true);
       
        home hm = new home();
        hm.pack();
        hm.setVisible(true);
        
        beli bl = new beli();
        bl.pack();
        bl.setVisible(true);
        
        history hs = new history();
        hs.setVisible(true);
    }
    
}
