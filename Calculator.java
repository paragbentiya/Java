import java.util.Scanner;
import java.lang.String;
public class Calculator{
    public static void main(String[] args)
    {
        System.out.println("Enter two Numbers:");
        Scanner input=new Scanner(System.in);
        int num1= input.nextInt();
        int num2=input.nextInt();
        char operator= input.next().charAt(0);
        System.out.println("Enter Operation + - * /");
                switch(operator)
                {
                    case '+' : System.out.println(num1+num2);break;
                    case '-': System.out.println(num1-num2);break;
                    case '*': System.out.println(num1*num2);break;
                    case '/': System.out.println(num1/num2);break;
                    default: System.out.println("Enter a Valid Operator");
                }
    }
}
