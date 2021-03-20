package logic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class inn {
    private JButton button1;

    public inn() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null,"givennnnn.........");
            }
        });
    }

    public static void newsc() {
inn m=new inn();
m.button1.setVisible(true);

    }
}
