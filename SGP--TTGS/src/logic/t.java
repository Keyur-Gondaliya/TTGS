package logic;
import jxl.write.WriteException;
import java.io.IOException;
import java.util.Scanner;
public class t {
        public static String[] a1=new String[36];

        public static String[] a3=new String[36];
        public static String[] a5=new String[24];
        public static String[] a6={"MONDAY","TUESDAY","WEDNESDAY","THERSDAY","FRIDAY","SATURDAY","SUNDAY"};
        public static final Integer[] q=new Integer[36];
        public static int[] p1=new int[36];
        public static int[] p0=new int[36];
        public static int[] z =new int[36];
    public static String[] z0=new String[36];
    public static String[] a2=new String[36];
        public static String[] p2=new String[36];
        public static int x;
    public static int y;
    public static int z1;
    public static int p;
    public static int xx=0;
    public static int xy=0;
    public static int bb;
    public static int mm;
    public static int b1;
    public static int b2;
    public static int b3;
        public static boolean n0;
        public static void input() {
            Scanner s = new Scanner(System.in);
            Scanner t1 = new Scanner(System.in);
            //x=onday y=no of letcher pr day z=no of faclty z1= no of sub p=no of room q=credits
            System.out.println("enter study day pr week");
            x = s.nextByte();
            System.out.println("enter let pr day");
            y = s.nextInt();
            System.out.println("enter day starting time first entry hour and secound minute");
            bb=s.nextInt();
            mm=s.nextInt();


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
                System.out.println(a5[i]);
                bb++;
            }
            System.out.println("enter number of breaks ");
            b1=s.nextInt();
            System.out.println("enter  time");
            b2=s.nextInt();
            System.out.println("enter brake duration");
            b3=s.nextInt();
//            int i=0;
//            while (){
//
//            }
            System.out.println("number of batches");
            p = s.nextInt();


            System.out.println("enter number of sub");
            z1 = s.nextInt();
            for (int i = 0; i < z1; i++) {
                System.out.println("enter subject name");
                a2[i] = t1.nextLine();
                System.out.println("enter number of faculty ");
                z[i]= s.nextInt();
                for (int j=0; j < z[i]; j++) {
                    System.out.println("enter faculty name of "+a2[i]);
                    a1[xy] = t1.nextLine();
                    System.out.println("enter credit of "+a1[xy]);
                    q[xy] = s.nextInt();
                    xx+=q[xy];
                    a3[xy]=a2[i]+" "+nameso(a1[xy]);
                    xy++;
                }
            }
            for(int i=0;i<xy;i++){
                for(int j=0;j<xy;j++){
                    if(q[j]<=q[i]){
                        int temp;
                        temp=q[i];
                        q[i]=q[j];
                        q[j]=temp;
                        String tem;
                        tem=a3[i];
                        a3[i]=a3[j];
                        a3[j]=tem;
                    }
                }
            }


        }
        public static String nameso(String a1){
                int k=1;
                char[] a=new char[a1.length()];
                for (int i=0;i<a1.length();i++) {
                    if (i == 0) {
                        a[i]= a1.charAt(0);
                    } else {
                        if (a1.charAt(i)==' ') {
                            a[k] = a1.charAt(i + 1);
                            k++;
                        }
                    }
                }
                String n=new String(a);
                return n.toUpperCase();
            }

        public static void main(String[] args) throws IOException, WriteException {
            logic l=new logic();
            input();

            l.tgl();
            if(n0==false)
            {l.ttt();}
            else {
                System.out.println("invalid");
            }
        }
}