import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        int count1,count2 , select ,result;

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the larger number first ");
        System.out.print("Enter the first count: ");
        count1=inp.nextInt();
        System.out.print("Enter the second count: ");
        count2=inp.nextInt();

        System.out.println("Enter 1 for addition " +
                "\nEnter 2 for subtraction" +
                "\nEnter 3 for division" +
                "\nEnter 4 for multiplication");
        select = inp.nextInt();

        switch (select){
            case 1:
               result = count1 + count2;
               System.out.println("Result of addition is : " + result);
               break;
            case 2:
                result = count1 - count2;
                System.out.println("Result of subtraction is : " + result);
                break;
            case 3:
                if(count1>count2)
                {
                    result = count1 / count2;
                    System.out.println("Result of division is : "+ result);
                }else
                    System.out.println("Numbers is not applicable");
                break;
            case 4:
                result = count1 * count2;
                System.out.println("Result of multiplication is : "+ result);
                break;
        }





    }
}
