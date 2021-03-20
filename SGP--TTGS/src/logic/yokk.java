package logic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class yok extends JFrame{
    private JPanel keypanal;
    private JButton msg;
    private JPanel w;
    private JPanel e;
    private JPanel s;
    private JLabel wl;
    private JLabel wl1;
    private JLabel wl2;
    private JLabel wl3;
    private JTextField e0;
    private JTextField e1;
    private JTextField e2;
    private JTextField e3;
    private JTextField e4;

    private JButton bot;
    private JLabel w0;
    public static String[] a1=new String[36];
    public static String[] a2=new String[36];
    public static String[] a3=new String[36];
    public static String[] a5=new String[24];
    public static String[] a6={"MONDAY","TUESDAY","WEDNESDAY","THERSDAY","FRIDAY","SATURDAY","SUNDAY"};
    public static final Integer[] q=new Integer[36];
    public static int[] p1=new int[36];
    public static int[] p0=new int[36];
    public static int[] z =new int[36];
    public static String[] p2=new String[36];
    public static int x;
    public static int y;

    public static int p;
    public static int xx=0;
    public static int xy=0;
    public static int bb;
    public static int mm;
    public static int b1;
    public static int b2;
    public static int b3;
    public static boolean n0;
   // private  final static List<in> clk= new ArrayList<in>();
    public yok(){



        bot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // t t1=new t();
//                setVisible(true);
                x=Integer.parseInt(e0.getText());
                y=Integer.parseInt(e1.getText());
                bb=Integer.parseInt(e2.getText());
                mm=Integer.parseInt(e3.getText());
                p=Integer.parseInt(e4.getText());
//                System.out.println(x);
//                System.out.println(y);
//                System.out.println(mm);
//                System.out.println(bb);
//                System.out.println(p);
                for (int i = 0; i < p; i++) {
                    p0[i] = i;
                    p2[i] = "BATCH" + Integer.toString(p0[i]+1);
                }
                while (mm>60){
                    mm=mm-60;
                    bb=bb+1;
                }
                for (int i=0;i<y;i++){
                    if (bb==0 || bb<12)
                        a5[i]=bb+":"+mm+"to"+(bb+1)+":"+mm;
                    else  if (bb==12){
                        a5[i]=bb+":"+mm +"to"+ "0:"+mm;}
                    else {
                        bb=0;
                        a5[i]=bb+":"+mm+"to"+(bb+1)+":"+mm;}
                    bb++;
                }

//                JOptionPane.showConfirmDialog(null,"give.........","abc...",JOptionPane.PLAIN_MESSAGE);

                new sss().setVisible(true);

            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("yok");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setContentPane(new yok().keypanal);
//        new yok();

    }
}