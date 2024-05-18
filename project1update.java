// making a basic calculator ........ (update the code)
// using switch case
public class project1update {
    public static void main(String args[])
    {
        int num1 = 10 ;
        int num2 = 14 ;
        
        char ch  = '-' ;
        
        switch(ch)
        {
            case '+' : // adding two number
            System.out.println( num1 + num2);
            break;

            case '-' : // subtracting  two number
             if(num1 > num2) // checking two numbers , which one is big
             {
                 System.out.println(num1 - num2);
             }
             else
             System.out.println(num2 - num1 );
            break;
             case '/': // dividing two number
             if(num1 > num2) // checking two numbers , which one is big
             {
                System.out.println(num1 / num2);
             }
            else{
                System.out.println(num1 / num2);
            }
            break;
            
            case '*' :// multiplying  two number
            System.out.println(num2 * num1);
             break;

            case '%' : // finding the remainder
            if(num1 > num2) // checking two numbers , which one is big
            {
                System.out.println(num1 % num2);
            }
            else{
                 System.out.println(num2 % num1);
            }
            break;

            default : 
            // default case
            System.out.println ("You are fucked!");
        } 
    }
    
}
