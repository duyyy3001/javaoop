package javaoop.lab.shape;

public abstract class DaGiac {
    protected int edges;
    protected double[] eLength;
    public DaGiac() {
        edges=0;
        eLength=new double[1];
        for (int i=0;i<eLength.length;i++) eLength[i]=0;
    }
    public abstract double perimeter();
    public void in() {
        for(int i=0;i<eLength.length;i++) System.out.print(eLength[i]+" ");
        System.out.println();
    }
    public String toString() {
        String str="";
        for (int i=0;i<eLength.length;i++) {
            str+=eLength[i]+" ";
        }
        return str;
    }
}
