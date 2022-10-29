
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Act04B_Dimarucut_DAT2 {
    public static int[] findLocationDelete(int [] array, int sub){
        if(array == null || sub < 0 || sub >= array.length) {
        return array;    
    }
        return IntStream.range(0, array.length) .filter(i -> i != sub)
        .map (i -> array[i]) .toArray();
    }
public static int[] addValue(int index, int Items[], int x)
    {
       int UpdatedArray[] = new int[index + 1];
       for (int i = 0; i < index; i++)
           UpdatedArray[i] = Items[i];
           UpdatedArray[index] = x;
    return UpdatedArray;
    }
    
public static void main (String [] args) {
        int Items[] = {10, 45, 75, 0, 27, 11, 95, 100, 1117, 05,1};
        int loop;
        do{    
                int Option;
                Scanner abby = new Scanner(System.in);

                System.out.println("\n✿.｡.*☆*.｡.Welcome to Array Operation! Please proceed to the list bellow.｡.*☆*.｡.✿");
                System.out.println("1. Insert a value \n2. Delete a value \n3. Traverse array \n4. Exit");
                System.out.print("\n•Please select your desired number to be done: ");
                Option = abby.nextInt();

                switch(Option) {
                case 1:
                    int val;
                     int Index = 11;

                    System.out.println("Original arrays: " + Arrays.toString(Items));
                    System.out.print("•Insert value to the arrays: ");
                    val = abby.nextInt();
                    // Check array if full
                    if(Items.length - 1 < Index){
                        Items = addValue(Index, Items, val);
                        System.out.println("A new value has been added: ");
                        System.out.println(Arrays.toString(Items));
                    }else{
                        System.out.println("Array is already full!");
                        }
                    break;

               case 2:
                    int sub;
                    System.out.print("\nOriginal array: " + Arrays.toString(Items));
                    System.out.print("\nEnter the value of index to be removed: ");
                    sub =abby.nextInt();
                    Items = findLocationDelete(Items, sub);

                    System.out.println("Removal of element successfull:");
                    System.out.println(Arrays.toString(Items));
                    break;

               case 3:
                    System.out.println("\nTraversing array complete: ");
                    for(int i = 0; i < Items.length; i++){
                    System.out.println(Items[i]);
                    }
                    break;

               case 4:
                    System.out.println("\n✿.｡.*☆*.｡.Thank you for using Array Operation!.｡.*☆*.｡.✿");
                    System.exit(0);
                    break;
                    
                    default:
                    System.out.println("Invalid input!\nPlease enter the number only.");  
              }
        System.out.print("\nMake another operation: 1 - YES /  0 - NO: ");
        loop = abby.nextInt();
        if(loop == 0){
            System.out.println("\n✿.｡.*☆*.｡.Thank you for using Array Operation!.｡.*☆*.｡.✿");
        }
        }while(loop == 1);
    }
}