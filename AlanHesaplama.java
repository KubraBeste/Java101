import java.util.Scanner;

public class AlanHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double edge1,edge2,edge3;

        System.out.print("Enter the first edge: ");
        edge1 = inp.nextDouble();
        System.out.print("Enter the second edge: ");
        edge2 = inp.nextDouble();
        System.out.print("Enter the third edge: ");
        edge3 = inp.nextDouble();

        double perimeter,area,u;
        perimeter = edge1+edge2+edge3;
        u = perimeter/2;

        area=Math.sqrt(u*(u-edge1)*(u-edge2)*(u-edge3));

        System.out.println("Area of triangle is " + area);



    }
}
