package Snakegame;
import javax.swing.*;

public class Snakegame extends JFrame {
    Snakegame(){
        super("snakegame");//gives title to the dialog box appearing
        add(new Board());
        pack();//refreshes the frame..works like setvisible prr setv ko baar baar use nahi kr skte
        setVisible(true);//frame deta hai
        //setLocation(700,300);//this will set location at (x.y)
        //to get frame and set its location at center we will make a frame and then set location relative to screen size now guess what happens if pehle location set krdi and baadme center diya
        setSize(300, 300);//set frame size
        setLocationRelativeTo(null);//relative to screen center khulega
    }
    public static void main(String args[]){
        new Snakegame();

    }
    
}
