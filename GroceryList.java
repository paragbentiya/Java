import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;

public class GroceryList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList Grocery = new ArrayList<>();


        {

                System.out.println("Enter a Choice:\n" +
                        "1:Add items to the grocery list \n" +
                        "2:Remove items from the grocery list \n" +
                        "3:Print the current grocery list\n" +
                        "4:Check if a specific item is already on the grocery list \n" +
                        "5:Clear the entire grocery list");

                int scase = input.nextInt();
                switch (scase) {
                    case 1:
                        System.out.println("Enter an Item to be entered in List");
                        String data1 = input.next();
                        Grocery.add(data1);
                        System.out.println("Item added to List");
                        break;
                    case 2:
                        System.out.println("Enter an Item to be Removed from List");
                        String data2 = input.next();
                        Grocery.remove(data2);
                        break;
                    case 3:
                        System.out.println("Current List\n" + Grocery);

                        break;
                    case 4:
                        System.out.println("Enter an Item Name be Checked in List");
                        String data3 = input.next();
                        if (Grocery.contains(data3)) {
                            System.out.println("Item already present");
                        } else {
                            System.out.println("Item Absent from list");
                        }

                        break;
                    case 5:
                        Grocery.clear();
                        System.out.println("List Cleared");
                        break;
                    default: break;
                }
            }
        }
    }