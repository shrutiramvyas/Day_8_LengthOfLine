import java.util.Scanner;

public class Lengthofline {
    public static int x1,y1,x2,y2;
    public static double lengthlne(int x1, int y1, int x2, int y2){
        double lengthofline = Math.sqrt((x2-x1)*2+(y2-y1)*2);
        System.out.println("Distance of line is " + lengthofline);
        return lengthofline;
    }
    public static double CheckLine(){
        Scanner line = new Scanner(System.in);
        System.out.println("Enter x1,y1,x2,y2 coordinates");
        int x1=line.nextInt();
        int y1=line.nextInt();
        int x2=line.nextInt();
        int y2=line.nextInt();
        double lengthofline = lengthlne(x1,y1,x2,y2);
        return lengthofline;
    }

    public static void main(String[] args) {
        Lengthofline len = new Lengthofline();
        System.out.println("Write coordinates of 1st Line");
        double a= len.CheckLine();
        System.out.println("Write coordinates of 2nd Line");
        double b=len.CheckLine();
        if (a > b){
            System.out.println("First Line is greater");
        }
        else if(a < b){
            System.out.println("Second Line is greater");
        }
        else{
            System.out.print("Both lines are equal");
        }


    }
}
