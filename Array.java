import java.util.Scanner;
public class Array {
public static void main(String[] args){
    int[] myarray= new int[5];
    Scanner input= new Scanner(System.in);
    for(int i=0;i< myarray.length;i++)
    {
        myarray[i]=input.nextInt();
    }


    int sum=0,average=0,min=myarray[0], max=myarray[0];
    for(int i=0;i< myarray.length;i++)
    {
        if(max<myarray[i])
        {
            max=myarray[i];
        }
    }

    for(int i=0;i< myarray.length;i++)
    {
            if(min>myarray[i])
            {
                min=myarray[i];
            }
    }
    for(int i=0;i< myarray.length;i++)
    {
        sum+=myarray[i];
    }

    average=sum/ myarray.length;
    System.out.println("Sum is " + sum);
    System.out.println("Average is " + average);
    System.out.println("Maximum " + max);
    System.out.println("Minimum " + min);
    }

}
