package Snakegame;

import javax.swing.*;
import java.awt.*;


public class Board extends JPanel{
    private int dots;
    private Image apple;
    private Image head;
    private Image dot;

    private int alldots = 900;//this is max number of dots(30x30)
    private int dotsize = 10;//suppose

    private  int x[] = new int[alldots];
    private  int y[] = new int[alldots];


    Board(){
        setBackground(new Color(0,0,0));//bg colour black krdiya
        setFocusable(true);//jese hi frame khule focus ho jaaye..click krke start krne ki zrurat na pade

        loadimages();
        initGame();
    }

    public void loadimages(){
        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("snakegame/snakegame images/apple.png"));
        apple = a1.getImage();
        ImageIcon a2 = new ImageIcon(ClassLoader.getSystemResource("snakegame/snakegame images/dot.png"));
        dot = a2.getImage();
        ImageIcon a3 = new ImageIcon(ClassLoader.getSystemResource("snakegame/snakegame images/head.png"));
        head = a3.getImage();
    }
    public void initGame(){
        dots = 3;
        for(int i =0;i< dots ;i++){
            y[i] = 50;
            x[i] = 50 - i * dotsize;
        }
    }

    //abhi images ko show krne ke liye we have to paint
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g){
        for(int i = 0; i < dots ;i++){
            if(i==0){
                g.drawImage(head, x[i], y[i], this);
            }
            else{
                g.drawImage(dot, x[i], y[i], this);
            }
        }
        Toolkit.getDefaultToolkit().sync();
    }
}
