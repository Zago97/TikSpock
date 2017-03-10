/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ticspock;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.net.*;

/**
 *
 * @author Nikita
 */
public class TicTacToeAbout extends JFrame {
    private JButton back;
    private final JPanel backPanel = new JPanel();
    private final JLabel msg = new JLabel();
     private final JLabel ticPhoto = new JLabel();
     private ImageIcon ticBoard;
    public TicTacToeAbout(){
       
        addback();
        addText();
        
        addPhoto();
        backPanel.add(back);
        add(backPanel, BorderLayout.NORTH);
    }
    public void addPhoto(){
         try{
      ticBoard = new ImageIcon(new URL("file:.\\pictures\\ticboard.jpg"));
      }
        catch(MalformedURLException e)
        {
        }
         ticPhoto.setIcon(ticBoard);
         add(ticPhoto, BorderLayout.SOUTH);
    }
    

    public void addText(){
        String text = "<html>Line1<br/> +"
                + "Cookie<br/>+"
                + "Monster</html>";
        msg.setText(text); 
        add(msg, BorderLayout.CENTER);
    }
    public void addback(){
       
        back = new JButton("Back");
        class addActionListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent event) {
                createPreviousPanel();
               

            }
        }//end of action listener class
        //creates action listener
        ActionListener listener = new addActionListener();
        //adds action listener
        back.addActionListener(listener);
    }
     public void createPreviousPanel(){
                dispose();
                JFrame frame = new Inform();
                frame.setVisible(true);
                frame.pack();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setTitle("Inform");
    }
}
