package com.zippoman924;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     * 
     * Template pulled from https://docs.oracle.com/javase/tutorial/uiswing/start/compile.html
     * 
     */
    public static void createAndShowGUI() {
      //Create and set up the window.
      JFrame frame = new JFrame("RSS Reader");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      //Set window size & position
      int WindowWidth = 800;
      int WindowHeight = 800;

      frame.setSize(WindowWidth,WindowHeight);
      frame.setLocationRelativeTo(null);  //Openes center of screen

      //START adding elements to the window. 

      /*
      //Create the "Hello World" label.
      JLabel label = new JLabel("Hello World! How are you?");

      //Sets font and alignment to center of the window. 
      label.setHorizontalAlignment(SwingConstants.CENTER);
      label.setFont(new Font("Serif", Font.PLAIN, 40));
      frame.add(label);
      */

      //Creates an "add feed" button
      JButton addButton = new JButton("Add New RSS Feed");
      //TODO: Might be a good idea to make these positions dynamic and not hard coded.
      addButton.setBounds(300, 100, 200, 80);
      frame.add(addButton);
      addButton.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
          System.out.println("Add Button has been pressed!");
        }
        
      });

      //Creates an "remove feed" button
      JButton removeButton = new JButton("Remove RSS Feed");
      removeButton.setBounds(300, 300, 200, 80);
      frame.add(removeButton);
      removeButton.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
          System.out.println("Remove Button has been pressed!");
        }
        
      });

      //Display the window.
      frame.setLayout(null);
      frame.setVisible(true);
  }
}
