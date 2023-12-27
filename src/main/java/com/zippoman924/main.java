package com.zippoman924;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Font;

public class main {

  /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     * 
     * Template pulled from https://docs.oracle.com/javase/tutorial/uiswing/start/compile.html
     * 
     */
    private static void createAndShowGUI() {
      //Create and set up the window.
      JFrame frame = new JFrame("RSS Reader");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      //Create the "Hello World" label.
      JLabel label = new JLabel("Hello World! How are you?");

      //Sets font and alignment to center of the window. 
      label.setHorizontalAlignment(SwingConstants.CENTER);
      label.setFont(new Font("Serif", Font.PLAIN, 40));
      frame.getContentPane().add(label);

      //Create & set minimum window size
      int WindowHeight = 800;
      int WindowWidth = 800;

      Dimension dims = new Dimension(WindowWidth, WindowHeight);
      frame.setMinimumSize(dims);

      //Set window to open in the center of the screen
      frame.setLocationRelativeTo(null);

      //Display the window.
      frame.pack();
      frame.setVisible(true);
  }

  public static void main(String[] args) {

    System.out.println("Program is running...");

    //Creates & shows the UI
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
          createAndShowGUI();
      }
    });

    //Type
  
  }
}
