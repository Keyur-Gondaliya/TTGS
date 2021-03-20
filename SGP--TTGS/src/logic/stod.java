package logic;

import javax.swing.*;
import java.awt.*;

public class stod extends JFrame {
    private JPanel a1;
    private JButton nextButton;
    private JPanel y1;
    private JPanel y2;


    public stod(){
        y1.setLayout(new GridLayout(0,1));
        y2.setLayout(new GridLayout(0,1));
        for (int i=0;i<3;i++){
            for (int j=0;j<2;j++){
                JLabel mn=new JLabel("Enter teacher name");
                JTextField nm=new JTextField(20);
                t.a2[i]=nm.getText();
                JLabel mnn=new JLabel("Enter credit");

                JTextField nmm=new JTextField(20);
                t.z0[i]=nmm.getText();


                y1.add(mn);
                y2. add(nm);
                y1.add(mnn);
                y2. add(nmm);

            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("stod");
        frame.setContentPane(new stod().a1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
