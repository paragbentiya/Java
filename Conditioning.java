import java.util.Scanner;
public class Conditioning {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a=input.nextInt();
        int b=input.nextInt();
        if(a>b)
        {
            System.out.println(a);

        }
        else {System.out.println(b);}
        input.close();
    }
}
