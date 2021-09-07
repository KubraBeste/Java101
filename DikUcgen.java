import java.util.Scanner;

public class DikUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double edge1,edge2,hipotenus;
        System.out.print("Enter the first edge: ");
        edge1 = inp.nextDouble();
        System.out.print("Enter the second edge: ");
        edge2 = inp.nextDouble();

        hipotenus = Math.sqrt((edge1 * edge1)+(edge2*edge2));
        System.out.println("Hipotenüs : " + hipotenus);
    }
}
