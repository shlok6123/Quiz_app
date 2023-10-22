package Quize.app;
import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.font.ImageGraphicAttribute;
import java.awt.image.BufferedImage;

class Score extends JFrame{
    Score(String name,int score){

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(200,150,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(60,200,200,150);
        add(image);

        JLabel heading=new JLabel("Thank You "+ name +"for playing Quiz Test");
        heading.setFont(new Font("Tahoma",Font.BOLD,26));
        heading.setBounds(100,80,700,30);
        add(heading);

        JLabel Score=new JLabel("Your Score is "+score);
        Score.setFont(new Font("Tahoma",Font.BOLD,26));
        Score.setBounds(350,200,300,30);
        add(Score);

        JButton exit=new JButton("Exit");
        exit.setBounds(380,270,120,30);
        exit.setBackground(Color.BLACK);
        exit.setForeground(Color.WHITE);
        add(exit);

        exit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();
            }
        });

        ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("icons/back.png"));
        Image i22 = i11.getImage().getScaledInstance(750,550,Image.SCALE_DEFAULT);
        ImageIcon i33=new ImageIcon(i22);
        JLabel imagee=new JLabel(i33);
        imagee.setBounds(0,0,750,550);
        add(imagee);

        setSize(750,550);
        setLocation(400,150);
        setUndecorated(true);
        setLayout(null);
        setVisible(true);

    }




    public static void main(String[] args) {
        new Score("User",0);{

        }
    }
}