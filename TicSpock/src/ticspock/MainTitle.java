/*Project: TicSnake
* Programmer: Nikita Zagorodski
* Program: MainTitle.java
* Date: January 10 2015
* Description: Program as a whole: creates two games,comomonly know as 
*              Tic Tac Toe and Snake running separately in the same program,,
*              initalizating when called upon, through the use of button the 
*              user can interact with the program and play
* This class: creates first view window, and allows the user to chose what
*             game the user wants to play 
*/
package ticspock;
//importing
import java.io.*;
import javax.swing.*;

/**
 *
 * @author Nikita
 */
//extend Jpanel
public class MainTitle extends JPanel  {

  
    public static void main(String[] args) throws IOException {
        //creating object SetUp to receive all components of window frame
        JFrame frame = new SetUp();
         // set JFrame size based on the sizes of the components
        //such as buttons,pictures,and text
        frame.pack();
        //make visible and close on exit
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //displays the window to the center and locks size
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        //sets Frame Title
         frame.setTitle("Main Menu");
    }
}
