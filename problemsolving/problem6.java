import java.util.Scanner;
public class problem6 
{
    private static final float Math = 0;

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        float num1 = scan.nextFloat();
        float num2 = scan.nextFloat();
        float num3 = scan.nextFloat();
        float num4 = scan.nextFloat();
        System.out.println((num1 * num2 - num2 * num2)/(num3 - num4));
    }
}
