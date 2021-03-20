package logic;

import jxl.Workbook;
import jxl.write.*;
import java.io.File;
import java.io.IOException;

public class logic extends t {
    public static String[][][] t = new String[8][8][8];//student
    public static String[][][] tt = new String[8][8][8];//teacher
    public static int xyz;

    public void tgl() {
        if (x * y >= xx) {

            for (int i1 = 0; i1 < p; i1++) {
                xyz = 0;
                for (int n = 0; n < xy; n++) {
                    p1[n] = q[n];
                    for (int i = 0; i < y; i++) {
                        for (int j = 0; j < x; j++) {
                            if (p1[n] > 0) {
                                if (tt[n][i][j] == null && t[i1][i][j] == null ) {

                                    tt[n][i][j] = p2[i1];

                                    t[i1][i][j] = a3[n];
                                    xyz++;
                                    p1[n]--;
                                }
                            }
                        }
                    }
                }

                if (xyz == xx) {
                } else {
                    n0=true;
                    System.out.println(n0);
                }
            }
        }
    }


    static void ttt() throws IOException, WriteException {
        int i1=0;
        WritableWorkbook wb= Workbook.createWorkbook(new File("TTgG.xls"));
        WritableSheet ws= wb.createSheet("Sheet 1",0);
        WritableCell w1= new Label(0, 0, "                                       TIME TABLE                             ");
        ws.addCell(w1);

        for (int x1 = 0; x1 < p; x1++) {
            i1++;
            i1++;
            i1++;
            for (int j1 = 0; j1 < x; j1++) {
                WritableCell w2 = new Label(0, i1-2, "                                             "+p2[x1]+"                                 ");
                ws.addCell(w2);
                WritableCell ww = new Label(j1+1, i1-1, a6[j1]);
                ws.addCell(ww);
            }
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                WritableCell wd = new Label(0, i1, a5[i]);
                ws.addCell(wd);
                if(t[x1][i][j]!=null){
                WritableCell wc = new Label(j+1, i1, t[x1][i][j]);
                ws.addCell(wc); }
                else {
                    t[x1][i][j]="free";
                    WritableCell wc = new Label(j+1, i1, t[x1][i][j]);
                    ws.addCell(wc);

                }
            }i1++;}
        }

        for (int x1 = 0; x1 < xy; x1++) {
            i1++;
            i1++;
            i1++;
            for (int j1 = 0; j1 < x; j1++) {
                WritableCell w2 = new Label(0, i1-2,"                                             "+ a1[x1]+"                                 ");
                ws.addCell(w2);
                WritableCell ww = new Label(j1+1, i1-1, a6[j1]);
                ws.addCell(ww);}
                 for (int i = 0; i < y; i++) {
                     for (int j = 0; j < x; j++) {
                         WritableCell wd = new Label(0, i1, a5[i]);
                         ws.addCell(wd);
                    if(tt[x1][i][j]!=null){
                        WritableCell wc = new Label(j+1, i1, tt[x1][i][j]);
                        ws.addCell(wc);
                       }
                    else {
                        tt[x1][i][j]="free";
                        WritableCell wc = new Label(j+1, i1, tt[x1][i][j]);
                        ws.addCell(wc);
                    }
                }i1++;}
    }
        wb.write();
        wb.close();

        if (x * y >= xx) {
            for (int x1 = 0; x1 < p; x1++) {
                System.out.println("Batch"+(x1+1));
                for (int i = 0; i < y; i++) {
                    for (int j = 0; j < x; j++) {
                        System.out.print(t[x1][i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println("----------------------------------------");
            System.out.println();
            for (int x1 = 0; x1 < xy; x1++) {
                System.out.println("time table of "+a1[x1]);
                for (int i = 0; i < y; i++) {
                    for (int j = 0; j < x; j++) {
                        System.out.print(tt[x1][i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }

        }
    }
}