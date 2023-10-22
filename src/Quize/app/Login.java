package Quize.app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener  {
    JButton rules;
    JButton back;
    JTextField tfname;
    Login(){

        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);

        //
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg.jpg"));
//        JLabel image=new JLabel(i1);
//        add(image);
//        image.setBounds(0,0,550,700);
        Image i=i1.getImage().getScaledInstance(550,500,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(i);
        JLabel image=new JLabel(i2);
        image.setBounds(0,0,550,500);
        add(image);

        JLabel heading=new JLabel("QUIZ TIME");
        heading.setBounds(760,100,400,70);
        heading.setFont(new Font("DejaVu Sans Mono",Font.BOLD,40));
        heading.setForeground(Color.red);
        add(heading);


       //For printiing enter the name:
        JLabel name=new JLabel("Enter Your Name");
        name.setBounds(790,190,400,50);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        name.setForeground(Color.black);
        add(name);

        //For Entering the Name:
        tfname=new JTextField();
        tfname.setBounds(725,250,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);

        rules=new JButton("Rules");
        rules.setBounds(720,290,120,25);
        rules.setBackground(Color.BLUE);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        back=new JButton("Back");
        back.setBounds(915,290,120,25);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(1200,500);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name=tfname.getText();
            setVisible(false);
            new Rules(name);

        }else if(ae.getSource()==back)
        {
            setVisible(false);
        }
    }
    public static void main(String args[]) {
        new Login();
    }
}
