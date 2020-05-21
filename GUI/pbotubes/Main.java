/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbotubes;
import Logic.*;
/**
 *
 * @author Aris Febriansyah
 */
public class Main {
    String b;
    Main(String a){
        System.out.println(getClass().getResource(a));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        loginframe login = new loginframe();
        login.setVisible(true);
//        mainframe a = new mainframe(new user("tubes"));
//        a.setVisible(true);
//        System.out.println("apa");
//        singupform signup = new singupform();
//        signup.setVisible(true);
//       
//        home hm = new home();
//        hm.pack();
//        hm.setVisible(true);
//        
//        beli bl = new beli();
//        bl.pack();
//        bl.setVisible(true);
//        
//        history hs = new history();
//        hs.setVisible(true);
    }
    
}
