import java.util.Scanner;

public class CircleSlice {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double radius, angle , area;
        double pi = 3.14;
        System.out.print("Enter the radius : " );
        radius = inp.nextDouble();
        System.out.print("Enter the angle : " );
        angle = inp.nextDouble();

        area = (pi*radius*radius)*angle /360;

        System.out.print("Area of the circle slice is " + area);



    }
}
