/*Project: TicSnake
* Programmer: Nikita Zagorodski
* Program: MainTitle.java
* Date: January 10 2015
* Description: Program as a whole: creates two games,comomonly know as 
*              Tic Tac Toe and Snake running separately in the same program,,
*              initalizating when called upon, through the use of button the 
*              user can interact with the program and play
* This class: creates the Snake Game 
*/
package ticspock;
//importing
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author 067123042
 */
public class Spock extends JFrame {
    Random rand = new Random();

    //creating instance variables
    
 
   //north buttons
   private int r0=0,p1=1,s2=2,l3=3,sp4=4,x=0;
   private JButton rock, paper, scissor, lizard, spock;
   //south buttons
   private JButton inform,reset;
   private JLabel highScore, currentScore,statementDisplay,user,computer;
   private final JLabel picUser= new JLabel(" ");
   private final JLabel picComputer = new JLabel(" ");
   private int hScore,cScore=0;
   private String message = " ";
   private JLabel msg;
   private ImageIcon picS,picP,picR,picL,picSp,picStart;
   private final JPanel Field; 
   private final JPanel southField;
   private final JPanel centerField;
   private boolean flag = true;
   
    public Spock(){
     
        rockBut();
        paperBut();
        scissorBut();
        lizardBut();
        spockBut();
        informBut();
        restartBut();
        addPhoto();
       
       
       //North part of screen
        Field = new JPanel(new GridLayout(2,1, 5, 5));
        addNorthPart();
        
        //Center part of Screen
        centerField = new JPanel(new GridLayout(1,3, 20, 20));
        addCenterPart();
    
        
        //South part of screen
        southField= new JPanel(new GridLayout(2,3, 5, 5));
        addSouthPart();
              
      
        
        
    }public void addNorthPart(){
        
          statementDisplay = new JLabel("  ");
        String text = "<html>   Five Choices    <br/> "
                + "     One Winner  <br/>"
                + "Man Vs Machine<br/>"
                + "May the Luck be With You</html>";
        statementDisplay.setText(text); 
      
        Field.add(rock);
        Field.add(paper);
        Field.add(scissor);
        Field.add(lizard);
        Field.add(statementDisplay);
        Field.add(spock);
        
      
        add(Field, BorderLayout.NORTH);
    } public void addCenterPart(){
             message = "<html>Click one Choice Above<br/> Reset for next Round";
        msg = new JLabel(" ");
        msg.setText(message);
       
               centerField.add(picUser);
               centerField.add(msg);
               centerField.add(picComputer);
                
           add(centerField, BorderLayout.CENTER);
    }
    public void addSouthPart(){
        user = new JLabel("Player");
              computer = new JLabel("Computer");
               highScore = new JLabel("HighScore");
               currentScore = new JLabel("CurrentScore");
               
              
              southField.add(user);
              southField.add(reset);
              southField.add(computer);
              southField.add(currentScore);
              southField.add(inform);
              southField.add(highScore);
              add(southField, BorderLayout.SOUTH);
    }

   
    
         public void addPhoto(){
         try{
             picS = new ImageIcon(new URL("file:.\\pictures\\scissors.jpeg"));
             picP = new ImageIcon(new URL("file:.\\pictures\\paper.jpeg"));
             picR = new ImageIcon(new URL("file:.\\pictures\\rockimage.jpeg"));
             picSp = new ImageIcon(new URL("file:.\\pictures\\spock.jpeg"));
             picL = new ImageIcon(new URL("file:.\\pictures\\lizard.jpeg"));
            picStart = new ImageIcon(new URL("file:.\\pictures\\rock.jpeg"));
      
      }
        catch(MalformedURLException e)
        {
        }
           picUser.setIcon(picStart);
           picComputer.setIcon(picStart);
          
           
         
    }
        public void restartBut(){
        //creates button
        reset= new JButton("Reset(Next Round)");
        
        //creates action listener class
        class addActionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                   
              flag = true;
              message = "<html>Beat the HighScore<br/>"
                      + "Click Any 5 choices Above<br/>"
                      + "For Next Round<br/>"
                      + "*Computer = Wins*<br/>"
                      + "Score will reset to 0</html>";
                msg.setText(message);
            }
        }//adds action listener
        ActionListener listener = new addActionListener();
        reset.addActionListener(listener);
         }
    
      public void rockBut(){
        //creates button
        rock = new JButton("Rock");
        
        //creates action listener class
        class addActionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                   if(flag)
               results(r0);
                
            }
        }//adds action listener
        ActionListener listener = new addActionListener();
        rock.addActionListener(listener);
         }
     public void paperBut(){
        //creates button
        paper = new JButton("Paper");
        
        //creates action listener class
        class addActionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                   if(flag)
             results(p1);
                
            }
        }//adds action listener
        ActionListener listener = new addActionListener();
        paper.addActionListener(listener);
    }
  
     public void scissorBut(){
        //creates button
        scissor = new JButton("Scissor");
        
        //creates action listener class
        class addActionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                   if(flag)
             results(s2);
                
            }
        }//adds action listener
        ActionListener listener = new addActionListener();
        scissor.addActionListener(listener);
    }
       public void lizardBut(){
        //creates button
        lizard = new JButton("Lizard");
        
        //creates action listener class
        class addActionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                  if(flag) 
            results(l3);
                
            }
        }//adds action listener
        
        ActionListener listener = new addActionListener();
        lizard.addActionListener(listener);
       }
         public void spockBut(){
        //creates button
        spock= new JButton("Spock");
        
        //creates action listener class
        class addActionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                   if(flag)
            results(sp4);
               
            }
        }//adds action listener
        ActionListener listener = new addActionListener();
        spock.addActionListener(listener);
         }
           public void informBut(){
        //creates button
        inform= new JButton("Inform");
        
        //creates action listener class
        class addActionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                   
                OtherMenu();
                
            }
        }//adds action listener
        ActionListener listener = new addActionListener();
        inform.addActionListener(listener);
         }
           
           public void results(int playerValue){
               //setting boolean false to false, so top five main buttons
               //have no effect until user clicks resets
               flag = false;
               //x=1 user win, x = 2 computer wins(*if computer wins current score 
               //is reset at zero(like a lottery system), 
               //x = 0 neither computer or  user wins(player score stays the same
                int user = playerValue;
                int cpu = rand.nextInt(4);
                setPhotoNew(user,cpu);
               //reference rock = 0, paper = 1,scissors = 2,lizard = 3, spock = 4
                if (user == cpu) {
			message = "<html>It's a Tie!<br/>"
                                + "Score Unaffected</html>";
                           x = 0;
                         
		} else if (user ==  0&& cpu == 1) {
			message =   "<html>Paper covers Rock <br/>"
                                    + " Computer Wins<br/>"
                                    + " Score reset</html>";
			x = 2;
		} else if (user == 1 && cpu == 0) {
			message =   "<html>Paper covers Rock <br/> "
                                    + " You Win<br/>"
                                    + " Score + 1 </html>";
                         x = 1;
		} else if (user ==  2 && cpu == 0) {
			message =   "<html>Rock smashs Scissors<br/>"
                                    + " Computer Wins<br/>"
                                    + " Score reset</html>";
			x = 2;
		} else if (user == 0  && cpu ==  2) {
			message =   "<html>Rock smashs Scissors <br/>"
                                    + " You Win<br/>"
                                    + " Score + 1 </html>";
                         x = 1;
		} 
                else if (user ==  0 && cpu == 3) {
			message =   "<html>Rock smashs Lizard<br/>"
                                    + " You Win<br/>"
                                    + " Score  + 1</html>";
			x = 1;
		} else if (user == 3  && cpu ==  0) {
			message =   "<html>Rock smash Lizard <br/>"
                                    + " Computer win<br/>"
                                    + " Score reset </html>";
                         x = 2;
		} 
                 else if (user ==  0 && cpu == 4) {
			message =   "<html>Spock Vaporizes Rock<br/>"
                                    + " Computer Wins<br/>"
                                    + " Score reset</html>";
			x = 2;
		} else if (user == 4  && cpu ==  0) {
			message =   "<html>Spock Vapories Rock<br/>"
                                    + " You Win<br/>"
                                    + " Score + 1 </html>";
                         x = 1;
		} 
                else if (user ==  1 && cpu == 2) {
			message =   "<html>Scissors cut Paper<br/>"
                                    + " Computer Wins<br/>"
                                    + " Score reset</html>";
			x = 2;
		} else if (user == 2  && cpu ==  1) {
			message =   "<html>Scissors cut Paper<br/>"
                                    + " You Win<br/>"
                                    + " Score + 1 </html>";
                         x = 1;
		} 
                else if (user ==  1 && cpu == 3) {
			message =   "<html>Lizard eats Paper<br/>"
                                    + " Computer Wins<br/>"
                                    + " Score reset</html>";
			x = 2;
		} else if (user == 3  && cpu ==  1) {
			message =   "<html>Lizard eats Paper<br/>"
                                    + " You Win<br/>"
                                    + " Score + 1 </html>";
                         x = 1;
		} 
                else if (user ==  4 && cpu == 1) {
			message =   "<html>Paper disproves Spock<br/>"
                                    + " Computer Wins<br/>"
                                    + " Score reset</html>";
			x = 2;
		} else if (user == 1  && cpu ==  4) {
			message =   "<html>Paper disproves Spock<br/>"
                                    + " You Win<br/>"
                                    + " Score + 1 </html>";
                         x = 1;
		} 
                 else if (user ==  3 && cpu == 2) {
			message =   "<html>Scissors decapitates <br/>"
                                + ".  The  Lizard<br/>"
                                    + " Computer Wins<br/>"
                                    + " Score reset</html>";
			x = 2;
		} else if (user == 2  && cpu ==  3) {
			message =   "<html>Scissors decapitates <br/>"
                                    +".  The Lizard<br/>"
                                    + " You Win<br/>"
                                    + " Score + 1 </html>";
                         x = 1;
		} 
                 else if (user ==  2 && cpu == 4) {
			message =   "<html>Spock Smashes Scissors<br/>"
                                    + " Computer Wins<br/>"
                                    + " Score reset</html>";
			x = 2;
		} else if (user == 4  && cpu ==  2) {
			message =   "<html>Spock Smashes Scissors<br/>"
                                    + " You Win<br/>"
                                    + " Score + 1 </html>";
                         x = 1;
		} 
                 else if (user ==  4 && cpu == 3) {
			message =   "<html>Lizard posions Spock<br/>"
                                    + " Computer Wins<br/>"
                                    + " Score reset</html>";
			x = 2;
		} else if (user == 3  && cpu ==  4) {
			message =   "<html>Lizard posions Spock<br/>"
                                    + " You Win<br/>"
                                    + " Score + 1 </html>";
                         x = 1;
		}
                if(x==1)
                    cScore++;
                else if(x==2)
                    cScore= 0;
                hScore = getScore();
                saveScore();
                
                
                 msg.setText(message);
                  
           }
           public void setPhotoNew(int user, int computer){
               if(user == 0)
                   picUser.setIcon(picR);
               else if(user == 1)
                   picUser.setIcon(picP);
               else if(user == 2)
                   picUser.setIcon(picS);
               else if(user==3)
                   picUser.setIcon(picL);
               else if(user==4)
                   picUser.setIcon(picSp);
                 if(computer == 0)
                   picComputer.setIcon(picR);
               else if(computer== 1)
                   picComputer.setIcon(picP);
               else if(computer== 2)
                   picComputer.setIcon(picS);
               else if(computer==3)
                   picComputer.setIcon(picL);
               else if(computer==4)
                   picComputer.setIcon(picSp);
           }
           //credits to Chris
     public int getScore()
    {
        //creates highscore variable
        int n;
        String num;
        try{
            //trys to read high score file, parses high score, and
            //closes the stream
           File file = new File("highScore.txt");
            try (Scanner inputFile = new Scanner(file)) {
                num = inputFile.nextLine();
                n = Integer.parseInt(num);
            }
        }
        catch(IOException e)
        {
            //if no file is found, 0 is used
            n=0;
        }
        //returns highscore
        return n;
    }//end of getScore
     //credits to Chris
      public void saveScore()
    {
        //sets the score label to the score
        currentScore.setText("CurrentScore: "+cScore);
        //checks if the score is above the high score
        if(cScore>hScore)
        {
            try{
                try (PrintWriter outputFile = new PrintWriter("highScore.txt")) {
                    outputFile.println(cScore);
                }
            hScore =cScore;
            }
            catch(IOException e)
            {
                
            }
        }
        //sets the highscore
        highScore.setText("HighScore: "+hScore);
    }//end of save
     
      public void OtherMenu(){
         //closes window and go to the selected game window
        dispose();
        JFrame frame = new Inform();
         // set JFrame size based on the sizes of the components
        //such as buttons,pictures,and text
        frame.pack();
        //make visible and close on exit
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set to center of screen and lock size
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        //sets the title of the frame
        frame.setTitle("Inform");
    
        
        
     
    }
    
    
}
