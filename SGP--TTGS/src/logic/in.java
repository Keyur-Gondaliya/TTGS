package logic;

public class in extends t{

//    private int x;
//    private int y;
//    private int bb;
//    private int mm;
//    private int p;
t t1=new t();
    public in(int y, int x, int bb, int mm, int p) {
//        this.x=Integer.toString(t.x);
//        this.y=Integer.toString(t.y);
//        this.bb=Integer.toString(t.bb);
//        this.mm=Integer.toString(t.mm);
//        this.p=Integer.toString(t.p);
        t1.x = x;
        t1.y = y;
        t1.bb = bb;
        t1.mm = mm;
        t1.p = p;
        System.out.println(t1.x);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        t1.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        t1.y = y;
    }

    public int getBb() {
        return bb;
    }

    public void setBb(int bb) {
        t1.bb = bb;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        t1.mm = mm;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }
}
