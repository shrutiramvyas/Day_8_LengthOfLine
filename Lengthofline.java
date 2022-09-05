import java.util.Scanner;

public class Lengthofline {
    public static int x1,y1,x2,y2;
    public static void lengthlne(int x1,int y1,int x2,int y2){
        double lengthofline = Math.sqrt((x2-x1)*2+(y2-y1)*2);
        System.out.println("Distance of line is " + lengthofline);
    }

    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Enter x1,y1,x2,y2 coordinates");
        int x1=line.nextInt();
        int y1=line.nextInt();
        int x2=line.nextInt();
        int y2=line.nextInt();
        Lengthofline len = new Lengthofline();
        len.lengthlne(x1,y1,x2,y2);

    }
}
