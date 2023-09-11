import java.util.Scanner;
public class NameAge{

    public static void main(String[] args)
    {
    Scanner name = new Scanner(System.in);
    Scanner age= new Scanner(System.in);
    System.out.println("Enter Your Name");
    String names=name.nextLine();
    System.out.println("Enter Your Age");
    int ages=age.nextInt();
    System.out.println("Hello, "+names+"! You are "+ages+" years old.");
    name.close();
    age.close();
    }
}
