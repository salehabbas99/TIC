import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TecTac implements ActionList{
    
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel buton_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;

    
    TecTac(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(new Color(25,25,25));
        textfield.setForeground(new Color(25,255,0));
        textfield.setFont(nwe Font("Ink free",Font.BOLD,75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-toe");
        textfield.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);

        title_panel.add(textfield);
        frame.add(title_panel,BorderLayout.NORTH);
    }
    @Override
    public void actionPerformed(ActionEvent){

    
    }

    public void firstTurn(){

    }
    public void check(){

    }
    public void xWins(int a,int b,int c){

    }
    public void oWins(int a,int b,int c){

    }
}

