import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        double pi = 3.14;
        double radius,area,circumference;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        radius = inp.nextDouble();

        area = radius*radius*pi;
        circumference = 2*pi*radius;

        System.out.print("Area of the circle : " + area + "\nCicumference of the circle : " + circumference);


    }
}
