import java.util.Scanner;

public class CalculateBodyMassIndex {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double height , weight , result;

        System.out.print("Enter the height (meters): ");
        height = inp.nextDouble();
        System.out.print("Enter the weight : ");
        weight = inp.nextDouble();

        result = weight / (height*height);
        System.out.println("Body mass index is " + result);

        if(result < 18.5){
            System.out.println("Underweight");
        }else if(18.5 <= result && result < 24.9)
        {
            System.out.println("Normal");
        }else if(25 <= result && result < 29.9 ){
            System.out.println("Overweight");
        }else if(result >= 30){
            System.out.println("Obese");
        }




    }
}
