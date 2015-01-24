import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Story {
   private Frame mainF;
   public Story () {
     // some fuctionality
     start();
   }
   public void start() {
      mainF = new Frame ("Story");
      mainF.setSize (500, 500);
      mainF.setLayout(new GridLayout(1,1));
      mainF.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
	        System.exit(0);
         }        
      });
   }
   public static void main (String[] args) {
      System.out.println("Yay!");
   }
}
