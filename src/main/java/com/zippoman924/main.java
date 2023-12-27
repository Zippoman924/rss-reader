package com.zippoman924;

public class main {
  public static void main(String[] args) {

    System.out.println("Program is running...");

    //Creates & shows the UI
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
          gui.createAndShowGUI();
      }
    });

    //Type
  
  }
}
