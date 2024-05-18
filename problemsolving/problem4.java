import java.util.Scanner;
public class problem4 
{
    public static void main(String[] args) 
    {
        System.out.print("Input first number: ");
        Scanner sc= new Scanner(System.in);
        int num1 =sc.nextInt();
        System.out.print("Input second number: ");
        int  num2 = sc.nextInt();
        System.out.println(num1 + " x " + num2 + "=" + (num1*num2));
    }
}
