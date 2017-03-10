/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ticspock;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image.*;
import javax.swing.*;
import java.net.*;
import javax.imageio.ImageIO;
/**
 *
 * @author Nikita
 */
public class SpockAbout extends JFrame{
     private JButton back;
     private final JLabel msg = new JLabel();
     private final JLabel spockPhoto = new JLabel();
     private ImageIcon spock;
    private final JPanel backPanel = new JPanel();
    public SpockAbout(){
        addback();
        addText();
        addPhoto();
        backPanel.add(back);
                add(backPanel, BorderLayout.NORTH);
    }
    private void addPhoto(){
         try{
      spock = new ImageIcon(new URL("file:.\\pictures\\lspock.jpg"));
      }
        catch(MalformedURLException e)
        {
        }
         spockPhoto.setIcon(spock);
         add(spockPhoto, BorderLayout.SOUTH);
    }
    private void addText(){
        
        String text = "<html>Line1<br/> +"
                + "Cookie<br/>+"
                + "Monster</html>";
        msg.setText(text); 
        add(msg, BorderLayout.CENTER);
        
    }
    
    public void addback(){
        back = new JButton("Back");
        class addActionListener implements ActionListener {

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
