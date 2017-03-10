/*Project: TicSnake
* Programmer: Nikita Zagorodski
* Program: MainTitle.java
* Date: January 10 2015
* Description: Program as a whole: creates two games,comomonly know as 
*              Tic Tac Toe and Snake running separately in the same program,,
*              initalizating when called upon, through the use of button the 
*              user can interact with the program and play
* This class: gives Credits, allows user to go back to Inform class,
*             and an easter egg gif image since not many people look at credit
*             
*/
package ticspock;
//importing
import java.awt.*;
import java.awt.event.*;
import java.awt.Image.*;
import javax.swing.*;
import java.net.*;

/**
 *
 * @author Nikita
 */
public class Credits extends JFrame {
    //creating instance variables
    private JButton back;
    private final JLabel msg = new JLabel();
    private final JPanel backPanel = new JPanel();
    private ImageIcon easterEgg;
    private final JLabel easterEggLabel = new JLabel();
    //constuctor
    public Credits(){
        addback();
        addeasterEgg();
        addText();
        backPanel.add(back);
        add(backPanel, BorderLayout.NORTH);
    }
     public void addText(){
        String text = "<html>Chris Jamesion <br/> +"
                + "thanks for explainations<br/>+"
                + "Monster</html>";
        msg.setText(text); 
        add(msg, BorderLayout.CENTER);
    }
    public void addeasterEgg(){
         try{
      easterEgg = new ImageIcon(new URL("file:.\\pictures\\easter.gif"));
      }
        catch(MalformedURLException e)
        {
        }
         easterEggLabel.setIcon(easterEgg);
         add(easterEggLabel, BorderLayout.SOUTH);
         
    }
    public void addback(){
        back = new JButton("Back");
        class addActionListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                createPreviousPanel();
               

            }
        }
         //adds action listener
        ActionListener listener = new addActionListener();
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
