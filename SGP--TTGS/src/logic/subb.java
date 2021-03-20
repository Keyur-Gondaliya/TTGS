package logic;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class sub extends JFrame implements CaretListener{

    public static int z1;
    private JButton button1;
    private JPanel t1;
    private JTextField textField1;
    private JLabel tfl;
    private JPanel a;
    private JPanel b;
    private JPanel yep;
    private JPanel nope;
String s1;

    public sub() {



        textField1.addCaretListener(this);
        nope.setLayout(new GridLayout(0,1));
        yep.setLayout(new GridLayout(0,1));

//        textField1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                z1=Integer.parseInt(textField1.getText());
//                System.out.println(z1);
//                nope.removeAll();
//                yep.removeAll();
//                for (int i=0;i<z1;i++){
//                    JLabel mn=new JLabel("Enter subject name");
//                    JTextField nm=new JTextField(20);
//                    a2[i]=nm.getText();
//                    JLabel mnn=new JLabel("Enter number of feculty");
//
//                    JTextField nmm=new JTextField(20);
//                    z[i]=nmm.getText();
//
////                    nmm.addActionListener(new ActionListener() {
////                        @Override
////                        public void actionPerformed(ActionEvent e) {
//////                    z[i]=Integer.parseInt(nmm.getText());
////                    for (int j=0;j<z[i];j++){
////
////                    }
////                        }
////                    });
//                    nope.add(mnn);
//                    yep. add(nmm);
//                    nope.add(mn);
//                    yep. add(nm);
//                }
//
//
//                nope.validate();
//                nope.repaint();
//                yep.validate();
//                yep.repaint();
//
//            }
//        });

        System.out.println("hi");

    }
    @Override
    public void caretUpdate(CaretEvent e) {
        z1=Integer.parseInt(textField1.getText());
        nope.removeAll();
        yep.removeAll();
        for (int i=0;i<z1;i++){
            JLabel mn=new JLabel("Enter subject name");
            JTextField nm=new JTextField(20);
            t.a2[i]=nm.getText();
            JLabel mnn=new JLabel("Enter number of feculty");

            JTextField nmm=new JTextField(20);
           // t.z=Integer.parseInt(nmm.getText());
            t.z0[i]=nmm.getText();

 //           int finalI = i;
//            textField1.addActionListener(new ActionListener() {
//            //@Override
//            public void actionPerformed(ActionEvent e) {
//
// while (!finalI)
//            }
//        });
            nope.add(mn);
            yep. add(nm);
            nope.add(mnn);
            yep. add(nmm);

        }

        System.out.println("hi");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i=0;i<z1;i++) {

                    System.out.println(t.a2[i]);
//                    System.out.println(sub.z[i]);
                }
            }
        });
        nope.validate();
        nope.repaint();
            yep.validate();
            yep.repaint();

    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("sub");
        frame.setContentPane(new sub().t1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
//frame.wait(20000);

        System.out.println("fsddvcxzx");
    }



}
