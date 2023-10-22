package Quize.app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class Rules extends JFrame implements ActionListener {
    String name;
    JButton Back,Start;
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " To Quiz");
        heading.setBounds(50, 20, 900, 70);
        heading.setFont(new Font("Georgia", Font.BOLD, 40));
        heading.setForeground(Color.RED);
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(50, 70, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setForeground(Color.black);
        rules.setText(
                "<html>"  + "<br><br>" +
                        "1.Participation in the quize is free." + "<br><br>" +
                        "2.You have only 15 sec to answer the Question." + "<br><br>" +
                        "3.No cell phones or secondary devices are allowed in the room or test area." + "<br><br>" +
                        "4.No one else can be with you in the room or test area."+"<br><br>"+
                        "5.There are total 10 Questions: "+"<br><br>"+
                        "</html"
        );
        add(rules);

        Back = new JButton("Back");
        Back.setBounds(250, 500, 100, 30);
        Back.setBackground(Color.BLUE);
        Back.setForeground(Color.WHITE);
        Back.addActionListener(this);
        add(Back);

        Start = new JButton("Start");
        Start.setBounds(400, 500, 100, 30);
        Start.setBackground(Color.BLUE);
        Start.setForeground(Color.WHITE);
        Start.addActionListener(this);
        add(Start);

        ImageIcon i1=new ImageIcon();


        setSize(800, 650);
        setLocation(350, 100);
        setUndecorated(true);
        setVisible(true);
    }

       public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Start){
            setVisible(false);
            new Quize(name);

        }else if(ae.getSource()==Back){
            setVisible(false);
            new Login();
        }


    }
    public static void main(String args[]){

        new Rules("User");
    }
}

