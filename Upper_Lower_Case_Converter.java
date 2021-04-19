/********************
 Ameer Ahmed 
 Upper/Lower Case Converter GUI
 Nov 30, 2020
********************/ 

import javax.swing.*;
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpperLowerCaseConverter extends JFrame{ 

    public void UpperLowerCaseConverter(){ 

        Panel p = new Panel();
        Panel p2 = new Panel();

        JButton Button1 = new JButton("UpperCase");
        JButton Button2 = new JButton("LowerCase");

        JTextArea textArea = new JTextArea();

        add(p, BorderLayout.NORTH);
        add(textArea, BorderLayout.CENTER);

        TextField textf = new TextField(10);
        add(p2, BorderLayout.SOUTH);
        p2.add(new JLabel("Enter Text:"));
        p2.add(textf);

        p.add(Button1, BorderLayout.WEST);
        p.add(Button2, BorderLayout.EAST);

    }

    public static void main (String [] args) {

        UpperLowerCaseConverter frame = new UpperLowerCaseConverter ();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}