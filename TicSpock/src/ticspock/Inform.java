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
public class Inform  extends JFrame{
    private int n = 2;
    private JFrame frame;
    private JPanel about = new JPanel();
    private JPanel quitRestart = new JPanel();
    private JPanel CreditPanel = new  JPanel();
    private JComboBox AboutTypePanel;
    private JButton Go;
    private JButton Restart;
    private JButton Quit;
    private JButton Credits;
    public Inform(){
        addAboutType();
        addGo();
        addQuit();
        addRestart();
        addCredits();
        about.add(AboutTypePanel);
        about.add(Go);
        add(about, BorderLayout.CENTER);
        quitRestart.add(Quit);
        quitRestart.add(Restart);
        add(quitRestart, BorderLayout.NORTH);
        CreditPanel.add(Credits);
        add(CreditPanel,BorderLayout.SOUTH);
        
    }
    private void addAboutType(){
        String [] AboutType = {"Tic Tac Toe Information", 
            " RPSL Spock Information","Select desired game information"};
            AboutTypePanel = new JComboBox(AboutType);
        AboutTypePanel.setSelectedIndex(2);
        class addActionListener implements ActionListener {

            //finds selected option and sends said option as a
            //parameter to the main window class
            public void actionPerformed(ActionEvent e) {
                //based on option selects the snake or tictaetok game
                
                JComboBox cb = (JComboBox) e.getSource();
                String games = (String) cb.getSelectedItem();
                for (int i = 0; i < AboutType.length; i++) {
                    if (games.equals(AboutType[i])) {
                        n = i;
                        
                        break;
                    }

                }
                 //choses window and creates new main window of window depending 
                //on the game
             

                 //tictaetok is one
            }
            //adds action listener
        }
        ActionListener listener = new addActionListener();
        AboutTypePanel.addActionListener(listener);
        
    }
    public void addGo() {
        //creates button
        Go = new JButton("Go");

        //creates action listener class
        class addActionListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                if(n<2)
                choseGameAbout();

            }
        }//end of action listener class
        //creates action listener
        ActionListener listener = new addActionListener();
        //adds action listener
        Go.addActionListener(listener);
    }//end of restartBut
    public void choseGameAbout() {
        dispose();
         if (n == 0) {
             
            frame = new TicTacToeAbout();
            frame.setTitle("About TicTacToe");        }  
        else if (n == 1) {
               
            frame = new SpockAbout(); 
             frame.setTitle("About RPSL Spock");
        }
        
       frameSetUp();
        
        
    }
    private void addQuit(){
         Quit = new JButton("Quit");
         class addActionListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                System.exit(0);

            }
        }//end of action listener class
        //creates action listener
        ActionListener listener = new addActionListener();
        //adds action listener
        Quit.addActionListener(listener);
         
    }
    private void addRestart(){
        Restart = new JButton("Restart");
        class addActionListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                dispose();
        
         frame = new SetUp();
         frame.setTitle("Main Menu");
         frameSetUp();

        

            }
        }//end of action listener class
        //creates action listener
        ActionListener listener = new addActionListener();
        //adds action listener
        Restart.addActionListener(listener);
        
    }
    private void addCredits(){
        Credits = new JButton("Credits");
        class addActionListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                dispose();
                  frame = new Credits();
         frame.setTitle("Credits");
         frameSetUp();
                

            }
        }//end of action listener class
        //creates action listener
        ActionListener listener = new addActionListener();
        //adds action listener
        Credits.addActionListener(listener);
        
    }
    public void frameSetUp(){
          frame.setVisible(true);
         frame.pack();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        //set to center of screen and lock size
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        
    }
}
