/* Swing is a Java library used to create Graphical User Interface (GUI) applications.
It is part of Java Foundation Classes (JFC).
Package: javax.swing
Example components: JFrame, JButton, JLabel, JTextField, JTable, JMenu, etc.
👉 Swing is platform-independent and lightweight (doesn’t depend on the operating system look).  */

import javax.swing.*;
public class file41 {
    public static void main(String[]args){
        JFrame j1 = new JFrame("Hello,Welcome in my world");  // Create a frame
        j1.setVisible(true); // for showing frame
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close and exite code
        j1.setSize(500,600);
    }
}