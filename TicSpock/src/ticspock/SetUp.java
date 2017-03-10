/*Project: TicSnake
* Programmer: Nikita Zagorodski
* Program: SetUp.java
* Date: January 10 2015
* Description: Program as a whole: creates two games,comomonly know as 
*              Tic Tac Toe and Snake running separately in the same program,
*              initalizating when called upon, through the use of button which 
*              user can interact with the program and play
* This class: creates the first window class, creates window panels and
*              images, depending on user selection go to game choice 
*/
package ticspock;
//import different type of library for use in program
import java.awt.*;
import java.awt.event.*;
import java.awt.Image.*;
import javax.swing.*;
import java.net.*;

/**
 *
 * @author 067123042
 */
//entends frame
public class SetUp extends JFrame {
    //create instance variable
    private JFrame frame;
    private int n = 2;
    private JComboBox GameType;
    private JButton Start;
    private JPanel GamePanel = new JPanel();
    private ImageIcon picT;
    private ImageIcon picS;
    private JLabel picSpock = new JLabel();
    private JLabel picTic = new JLabel();

    //constructor
    public SetUp() {
        //runs GameType ComboBox Method
        addGameType();
        //runs the start button method
        addStartBut();
        //runs the photos method
        addPhotos();
        
        //addes the JComboBox GameType to the GamePanel panel
        GamePanel.add(GameType);
        //adding the JButton to the GamePanel panel
        GamePanel.add(Start);
        //Adding the GamePanel to the North part of the window
        add(GamePanel, BorderLayout.NORTH);
        
         

    }
    /*
     * addPhoto - obtains pictures from the picture folder from the 
     *              project folder and sets in on the window
     */
    private void addPhotos(){
       //attempt to receive images and set as an ImageIcon variable
         try{
      picS = new ImageIcon(new URL("file:.\\pictures\\lspock.jpg"));
       picT = new ImageIcon(new URL("file:.\\pictures\\TTT.gif"));
      } 
        //catch any malformed url when the url path does not correspond
        //and as a result will not include it in the window
        catch(MalformedURLException e)
        {
        }
        //Adding the gif images to a JLabel 
           picTic.setIcon(picT);
           picSpock.setIcon(picS);
           //adding tictactoe gif to center of screen,below the Jpanel and 
           //above the Snake gif
            add(picTic, BorderLayout.CENTER);
            //creates the Snake gif below the tictactoe gif
            add(picSpock, BorderLayout.SOUTH);
        
        
     }
    /*
     * addGameType - creates the JComboBox, and sets interger n to a value
     *                  corresponding to user choice
     */

    private void addGameType() {
         //creates a list of what is going to be displayed on the combobox
        String[] gameType = {"Tic Tac Toe", "RPSL Spock Game","Select a Game",};
        //creates the combobox
        GameType = new JComboBox(gameType);
        GameType.setSelectedIndex(2);
        //creates action listener
        class addActionListener implements ActionListener {

            //finds selected option and sends said option as a
            //parameter to the main window class
            public void actionPerformed(ActionEvent e) {
                //based on option selects the snake or tictaetok game
                
                JComboBox cb = (JComboBox) e.getSource();
                String games = (String) cb.getSelectedItem();
                //depending on what user clicks on the JCombobox
                //a integer value  of n will be recevied to be used in 
                //determining what game the user wants to play
                for (int i = 0; i < gameType.length; i++) {
                    if (games.equals(gameType[i])) {
                        n = i;
                        break;
                    }

                }
                 
            }
            
        }
        //adds action listener
        ActionListener listener = new addActionListener();
        GameType.addActionListener(listener);
        
    }
     /*
      * addStartBut - creates the button snake, when clicked, depending on 
      *               interger n value, will call a method which will redirect
      *               them to the corresponding game
      */
    public void addStartBut() {
        //creates button
        Start = new JButton("Start");

        //creates action listener 
        class addActionListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                //if the integer value n, if it is less than
                //2 it will run a method, less the click wont do anything
                //the only scenario is if the user clicks start when the JCombobox
                //says select a game
                if(n<2)
                //runs the choseGame method
                choseGame();

            }
        }
             //adds action listener   
        ActionListener listener = new addActionListener();
      Start.addActionListener(listener);
    }
    
    /*
     * choseGame - redirects the user to their selected game, 
     */
    public void choseGame() {
        //closes window and goes to the selected game window
        dispose();
        //if n ==0 the tictactoe game window will appear
         if (n == 0) {
             
            frame = new TicTacToe();
            frame.setTitle("Tic Tac Toe Game");
        }  
         //else if n == 1 the snake window will appear
        else if (n == 1) {
               
            frame = new Spock(); 
            frame.setTitle("Rock Paper Scissors Lizard Spock");
        }
         //sets the size of the window
        
         frame.setSize(500, 500);
        //make visible and close on exit
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set to center of screen and lock size
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        //sets the title of the frame
      
    
         
            
    }
}
