/*Project: TicSnake
 * Programmer: Nikita Zagorodski
 * Program: MainTitle.java
 * Date: January 10 2015
 * Description: Program as a whole: creates two games,comomonly know as 
 *              Tic Tac Toe and Snake running separately in the same program,,
 *              initalizating when called upon, through the use of button the 
 *              user can interact with the program and play
 * This class: creates the TicTacToe Game 
 */
package ticspock;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author 067123042
 */
public class TicTacToe extends JFrame {

    private JButton inform;
    private final int[] check = new int[9];
    private int b11 = 0, b22 = 0, b33 = 0, b44 = 0, b55 = 0, b66 = 0, b77 = 0, 
                b88 = 0, b99 = 0;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private int xValue = 0, oValue = 0;
    private final JLabel xScore;
    private final JLabel oScore;
    //true = x ,false = o
    private boolean flag = true;
    //checks for cat game
    private boolean displayText = true;
    private int catX = 5,cat0 = 5;
 

    public TicTacToe() {
        b1But();
        b2But();
        b3But();
        b4But();
        b5But();
        b6But();
        b7But();
        b8But();
        b9But();

        informBut();
        JPanel layout = new JPanel(new GridLayout(4, 4, 10, 10));
        xScore = new JLabel(" X SCORE: " + xValue);
        oScore = new JLabel(" O SCORE: " + oValue);
        layout.add(b1);
        layout.add(b2);
        layout.add(b3);
        layout.add(b4);
        layout.add(b5);
        layout.add(b6);
        layout.add(b7);
        layout.add(b8);
        layout.add(b9);
        layout.add(xScore);
        layout.add(inform);
        layout.add(oScore);
        add(layout, BorderLayout.CENTER);

        //.setText();
    }

    public void b1But() {
        //creates button

        b1 = new JButton("");

        //creates action listener class
        class addActionListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                int y = 1, lastCheck = 0;
                if (b11 == 0) {
                    if (flag == true) {
                        b1.setText("X");
                        b11 = 1;
                        lastCheck = check(b11, 1);
                    } else {
                        b1.setText("0");
                        b11 = 2;
                        lastCheck = check(b11, 1);

                    }
                    flag = !flag;
                    if (y != lastCheck) {
                        b11 = 5;
                    } else {
                        b11 = 0;
                    }

                }

            }
        }//end of action listener class
        //creates action listener
        ActionListener listener = new addActionListener();
        //adds action listener
        b1.addActionListener(listener);
    }//end of restartBut

    public void b2But() {
        //creates button

        b2 = new JButton("");

        //creates action listener class
        class addActionListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                int y = 2, lastCheck = 0;
                if (b22 == 0) {
                    if (flag == true) {
                        b2.setText("X");
                        b22 = 1;
                        lastCheck = check(b22, 2);
                    } else {
                        b2.setText("0");
                        b22 = 2;
                        lastCheck = check(b22, 2);
                    }
                    flag = !flag;
                    if (y != lastCheck) {
                        b22 = 5;
                    } else {
                        b22 = 0;
                    }
                }

            }
        }//end of action listener class
        //creates action listener
        ActionListener listener = new addActionListener();
        //adds action listener
        b2.addActionListener(listener);
    }//end of restartBut

    public void b3But() {
        //creates button

        b3 = new JButton("");

        //creates action listener class
        class addActionListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                int y = 3, lastCheck = 0;
                if (b33 == 0) {
                    if (flag == true) {
                        b3.setText("X");
                        b33 = 1;
                        lastCheck = check(b33, 3);
                    } else {
                        b3.setText("0");
                        b33 = 2;
                        lastCheck = check(b33, 3);
                    }
                    flag = !flag;
                    if (y != lastCheck) {
                        b33 = 5;
                    } else {
                        b33 = 0;
                    }
                }

            }
        }//end of action listener class
        //creates action listener
        ActionListener listener = new addActionListener();
        //adds action listener
        b3.addActionListener(listener);
    }//end of restartBut

    public void b4But() {
        //creates buton

        b4 = new JButton("");

        //creates action listener class
        class addActionListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                int y = 4, lastCheck = 0;
                if (b44 == 0) {
                    if (flag == true) {
                        b4.setText("X");
                        b44 = 1;
                        lastCheck = check(b44, 4);
                    } else {
                        b4.setText("0");
                        b44 = 2;
                        lastCheck = check(b44, 4);
                    }
                    flag = !flag;
                    if (y != lastCheck) {
                        b44 = 5;
                    } else {
                        b44 = 0;
                    }
                }

            }
        }//end of action listener class
        //creates action listener
        ActionListener listener = new addActionListener();
        //adds action listener
        b4.addActionListener(listener);
    }//end of restartBut

    public void b5But() {
        //creates button

        b5 = new JButton("");

        //creates action listener class
        class addActionListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                int y = 5, lastCheck = 0;
                if (b55 == 0) {
                    if (flag == true) {
                        b5.setText("X");
                        b55 = 1;
                        lastCheck = check(b55, 5);
                    } else {
                        b5.setText("0");
                        b55 = 2;
                        lastCheck = check(b55, 5);
                    }
                    flag = !flag;
                    if (y != lastCheck) {
                        b55 = 5;
                    } else {
                        b55 = 0;
                    }
                }

            }
        }//end of action listener class
        //creates action listener
        ActionListener listener = new addActionListener();
        //adds action listener
        b5.addActionListener(listener);
    }//end of restartBut

    public void b6But() {
        //creates button

        b6 = new JButton("");

        //creates action listener class
        class addActionListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                int y = 6, lastCheck = 0;
                if (b66 == 0) {
                    if (flag == true) {
                        b6.setText("X");
                        b66 = 1;
                        lastCheck = check(b66, 6);
                    } else {
                        b6.setText("0");
                        b66 = 2;
                        lastCheck = check(b66, 6);

                    }
                    flag = !flag;
                    if (y != lastCheck) {
                        b66 = 5;
                    } else {
                        b66 = 0;
                    }
                }

            }
        }//end of action listener class
        //creates action listener
        ActionListener listener = new addActionListener();
        //adds action listener
        b6.addActionListener(listener);
    }//end of restartBut

    public void b7But() {
        //creates button

        b7 = new JButton("");

        //creates action listener class
        class addActionListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                int y = 7, lastCheck = 0;
                if (b77 == 0) {
                    if (flag == true) {
                        b7.setText("X");
                        b77 = 1;
                        lastCheck = check(b77, 7);
                    } else {
                        b7.setText("0");
                        b77 = 2;
                        lastCheck = check(b77, 7);
                    }
                    flag = !flag;
                    if (y != lastCheck) {
                        b77 = 5;
                    } else {
                        b77 = 0;
                    }
                }

            }
        }//end of action listener class
        //creates action listener
        ActionListener listener = new addActionListener();
        //adds action listener
        b7.addActionListener(listener);
    }//end of restartBut

    public void b8But() {
        //creates button

        b8 = new JButton("");

        //creates action listener class
        class addActionListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                int y = 8, lastCheck = 0;
                if (b88 == 0) {
                    if (flag == true) {
                        b8.setText("X");
                        b88 = 1;
                        lastCheck = check(b88, 8);
                    } else {
                        b8.setText("0");
                        b88 = 2;
                        lastCheck = check(b88, 8);
                    }
                    flag = !flag;
                    if (y != lastCheck) {
                        b88 = 5;
                    } else {
                        b88 = 0;
                    }
                }

            }
        }//end of action listener class
        //creates action listener
        ActionListener listener = new addActionListener();
        //adds action listener
        b8.addActionListener(listener);
    }//end of restartBut

    public void b9But() {
        //creates button

        b9 = new JButton("");

        //creates action listener class
        class addActionListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                int y = 9, lastCheck = 0;
                if (b99 == 0) {
                    if (flag == true) {
                        b9.setText("X");
                        b99 = 1;
                        lastCheck = check(b99, 9);
                    } else {
                        b9.setText("0");
                        b99 = 2;
                        lastCheck = check(b99, 9);
                    }
                    flag = !flag;
                    if (y != lastCheck) {
                        b99 = 5;
                    } else {
                        b99 = 0;
                    }
                }

            }
        }//end of action listener class
        //creates action listener
        ActionListener listener = new addActionListener();
        //adds action listener
        b9.addActionListener(listener);
    }//end of restartBut

    public int check(int xo, int button) {
        int x = 1, o = 2, catgame = 0;
        int restartNumber = 99;
        for (int i = 0; i < check.length; i++) {  //note x =1 , o =2
            if (i == (button - 1)) {
                check[i] = xo;
            }
        }
        if ((check[0] == x && check[1] == x && check[2] == x)
                || (check[3] == x && check[4] == x && check[5] == x)
                || (check[6] == x && check[7] == x && check[8] == x)
                || (check[0] == x && check[3] == x && check[6] == x)
                || (check[1] == x && check[4] == x && check[7] == x)
                || (check[2] == x && check[5] == x && check[8] == x)
                || (check[0] == x && check[4] == x && check[8] == x)
                || (check[6] == x && check[4] == x && check[2] == x)) {
            
            xValue++;
            xScore.setText("X WINS, X Score: " + xValue);
            catX = 0;
            restartNumber = restart(xo,button);
        } //x wins
        else if ((check[0] == o && check[1] == o && check[2] == o)
                || (check[3] == o && check[4] == o && check[5] == o)
                || (check[6] == o && check[7] == o && check[8] == o)
                || (check[0] == o && check[3] == o && check[6] == o)
                || (check[1] == o && check[4] == o && check[7] == o)
                || (check[2] == o && check[5] == o && check[8] == o)
                || (check[0] == o && check[4] == o && check[8] == o)
                || (check[6] == o && check[4] == o && check[2] == o)) {

            oValue++;
            
            oScore.setText("O WINS, O Score: " + oValue);
            cat0 = 0;
            restartNumber = restart(xo,button);
        }

        for (int i = 0; i < check.length; i++) {  //note x =1 , o =2
            if (check[i] == 1 || check[i] == 2) {
                catgame++;
            }
        }
        if (catgame == check.length) {
            displayText = false;
            oScore.setText("Cat Game, O Score: " + oValue);
            xScore.setText("Cat Game, X Score: " + xValue);
            restartNumber = restart(xo,button);
        }
        return restartNumber;

    }

    public int restart(int xo,int buttonNumber) {
        int LastButtonClick = buttonNumber;
        
        for (int i = 0; i < check.length; i++) {  //note x =1 , o =2
            check[i] = 0;
        }
//       if(buttonNumber==1&&xo==1)
//           b1.setText("X");
//       else if(buttonNumber==1&&xo==2)
//           b1.setText("O");
//       else if(buttonNumber==2&&xo==1)
//           b2.setText("X");
//       else if(buttonNumber==2&&xo==2)
//           b2.setText("O");
//       else if(buttonNumber==3&&xo==1)
//           b3.setText("X");
//       else if(buttonNumber==3&&xo==2)
//           b3.setText("O");
//       else if(buttonNumber==4&&xo==1)
//           b4.setText("X");
//       else if(buttonNumber==4&&xo==2)
//           b4.setText("O");
//       else if(buttonNumber==5&&xo==1)
//           b5.setText("X");
//       else if(buttonNumber==5&&xo==2)
//           b5.setText("O");
//       else if(buttonNumber==6&&xo==1)
//           b6.setText("X");
//       else if(buttonNumber==6&&xo==2)
//           b6.setText("O");
//       else if(buttonNumber==7&&xo==1)
//           b7.setText("X");
//       else if(buttonNumber==7&&xo==2)
//           b7.setText("O");
//       else if(buttonNumber==8&&xo==1)
//           b8.setText("X");
//       else if(buttonNumber==8&&xo==2)
//           b8.setText("O");
//       else if(buttonNumber==9&&xo==1)
//           b9.setText("X");
//       else if(buttonNumber==9&&xo==2)
//           b9.setText("O");
        //gives 50 milliseconds to let user review the board before restarting
       pass(50);
        b11 = 0;
        b22 = 0;
        b33 = 0;
        b44 = 0;
        b55 = 0;
        b66 = 0;
        b77 = 0;
        b88 = 0;
        b99 = 0;
       
        b1.setText("    ");
        b2.setText("    ");
        b3.setText("    ");
        b4.setText("    ");
        b5.setText("    ");
        b6.setText("    ");
        b7.setText("    ");
        b8.setText("    ");
        b9.setText("    ");
        pass(60);
        if(displayText){
         if(catX!=0)
         xScore .setText(" X SCORE: " + xValue);
         if(cat0!=0)
         oScore.setText(" O SCORE: " + oValue);
        }
        displayText=true;
        catX = 5;
        cat0 = 5;
        return LastButtonClick;
        
    }
     public static void pass(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
        }
    }

    public void informBut() {
        //creates button

        inform = new JButton("Inform/Restart");

        //creates action listener class
        class addActionListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {

                OtherMenu();

            }
        }//end of action listener class
        //creates action listener
        ActionListener listener = new addActionListener();
        //adds action listener
        inform.addActionListener(listener);
    }//end of restartBut

    public void OtherMenu() {
        //closes current window and goes to Inform window
        dispose();

        JFrame frame = new Inform();
        //set size based on components
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
