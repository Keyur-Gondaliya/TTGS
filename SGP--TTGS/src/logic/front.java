package logic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class front extends t implements ActionListener {



        public static JFrame frame=new JFrame();
        public static JPanel panel=new JPanel();
        public static JLabel label=new JLabel("user");
        public static JTextField ut=new JTextField(20);
    public static JLabel l1=new JLabel("enter study day pr week");
    public static JTextField u1=new JTextField(20);
    public static JLabel l2=new JLabel("enter let pr day");
    public static JTextField u2=new JTextField(20);
    public static JLabel l3=new JLabel("enter day starting time first entry hour and secound minute");
    public static JTextField u3=new JTextField(20);
    public static JTextField u3a=new JTextField(20);
    public static JLabel l4=new JLabel("number of batches");
    public static JTextField u4=new JTextField(20);
        public static JButton b=new JButton("login");
        public static JLabel passwordl=new JLabel("password");
        public static JTextField uu=new JTextField(20);
        public static JLabel s=new JLabel("");
        private JPanel panel1;
        private JList list1;
        private JRadioButton radioButton1;
        private JTable table1;

        public static void main(String[] args) {
            frame.setSize(100,100);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.add(panel);
            panel.setLayout(new FlowLayout());

//            label.setBounds(10,20,80,25);
            panel.add(label);

//            ut.setBounds(100,20,165,25);
            panel.add(ut);

//            passwordl.setBounds(10,50,80,25);
            panel.add(passwordl);

//            uu.setBounds(100,50,165,25);
            panel.add(uu);

            b.addActionListener(new front());
//            b.setBounds(80,60,80,25);
            panel.add(b);

//            b.setBounds(100,90,80,25);
            panel.add(s);
            frame.setVisible(true);
            frame.setSize(325,400);
        }
        @Override
        public void actionPerformed(ActionEvent e) {

            String n=ut.getText();
            String pm= uu.getText();
            if(n.equals("kur")&&pm.equals("uuu")){
                System.out.println("yo");
//                s.setBounds(150,150,150,150);
                s.setText("yo");
                panel.add(l1);
                panel.add(u1);
                x=u1.getX();
                System.out.println(x);
                panel.add(l2);
                panel.add(u2);
                y=u2.getX();
                System.out.println(y);
                panel.add(l3);
                panel.add(u3);
                bb=u3.getX();
                mm=u3a.getX();
                System.out.println("bb "+bb+"mm "+mm);
                panel.add(u3a);
                panel.add(l4);

                panel.add(u4);
                p=u4.getX();
                System.out.println(p);
            }
            else
//                s.setBounds(150,150,150,150);
            s.setText("no");
        }
    }