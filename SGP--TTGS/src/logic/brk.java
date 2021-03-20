package logic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class brk extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JComboBox comboBox1;

    public brk() {

setLayout(new GridLayout());
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        comboBox1=new JComboBox(ts.a6);

comboBox1.addItem(ts.a6);

//        comboBox1.setSelectedIndex(1);
//        add(comboBox1);

       contentPane. add(comboBox1);
//        comboBox1.add("None");
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

//        comboBox1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String s=(String)comboBox1.getSelectedItem();
//
//            }
//        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        brk dialog = new brk();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }


}
