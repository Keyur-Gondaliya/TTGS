package logic;

import javax.swing.*;
import javax.swing.plaf.metal.MetalScrollBarUI;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class ttp extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTable table1;
    private JTable table =new JTable();
    private JTable[] t=new JTable[36];
    private JTable[] tt=new JTable[36];
    JLabel l[]=new JLabel[36];
    JLabel l1[]=new JLabel[36];
private String[] columns=new String[8];
private String[][] data=new String[8][8];
    public ttp() {
        setLayout(new GridLayout(8,0));
        setContentPane(contentPane);
        this.setTitle("Time Table Generator");

//        String[] columns={"gfd","fgdsf"};
        for (int i=0;i<ff.x;i++){
            columns[i]=ts.a6[i];
        }
//        String[][] data={{"hfg","hgf"},{"hgf","ghfg"}};
        for (int i=0;i<ff.p;i++){
//            JLabel l=new JLabel();
            l[i]=new JLabel("       "+ff.p2[i]+"       :");
            add(l[i]);
        t[i]=new JTable(ts.t[i],ts.a6);
        this.add(new JScrollPane(t[i]));

        }
        for (int i=0;i<ts.xy;i++){

            l1[i]=new JLabel("      time table of "+ts.a1[i]+"         :");
            add(l1[i]);
            tt[i]=new JTable(ts.tt[i],ts.a6);
            this.add(new JScrollPane(tt[i]));

        }

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });


    }



    private void onOK() {

//        table1.getCellRect(0,0,true);
//        ta[0].addColumn();
        // add your code here
       // dispose();
    }

    private void onCancel() {
        ts t= new ts();
        t.getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        t.pack();
        t.setVisible(true);
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ttp");
        frame.setContentPane(new ttp().contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
//    public static void main(String[] args) {
//
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                ttp dialog = new ttp();
//                dialog.pack();
//                dialog.setVisible(true);
////                System.exit(0);
////                dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//            }
//        });
//
//
//        }

//        System.exit(0);
    }
