import java.util.Scanner;
public  class conditional 
{
    public static void main(String[] args) 
    {
        System.out.print("Input the marks of a Student : ");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int marks = Integer.parseInt(st);
        if(marks > 90)
        {
            System.out.println("excelent");
        }
        else if(marks> 80 && marks<=90 )
        {
            System.out.println("good");
        }
        else if(marks > 70 && marks <=80)
        {
            System.out.println("fair");
        }
        else if(marks > 60 && marks <=70)
        {
            System.out.println("meets expectations");
        }
        else if(marks <= 60)
        {
            System.out.println("Below Par");
        }
        else 
        {
            System.out.println("Fuck you");
        }
    }
}
