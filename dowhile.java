import java.util.Scanner;
public class dowhile {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a valid number");
            i = input.nextInt();
        } while (i < 1 || i > 10);
        input.close();
        System.out.println("You Entered "+i);

    }
}
