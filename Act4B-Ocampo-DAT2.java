
package activity4b.ocampo.dat2;

import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Scanner;

public class Activity4BOcampoDAT2 {

    public static int[] FinLocationDelete(int[] Arr, int val){
        
        
    if(Arr == null || val < 0 || val >= Arr.length){
        return Arr;
    }
    
    return IntStream.range(0, Arr.length) .filter(a -> a != val).map(a -> Arr[a]).toArray();
         }
    
    public static void main(String[] args) {
       
        int Arr[] = {20,  23, 90, 23, 65, 63, 25, 21, 26, 21, 0};
        
        String val1;
        Scanner scn  = new Scanner(System.in);
        
        System.out.println("Welcome");
        System.out.println("What would you like to do?");
        System.out.println("-> Insert Value (1)\n-> Delete a Value (2)\n-> Traverse Array (3)\n-> Exit (4)");
        
        System.out.print("Please kindly input here = ");
        val1 = scn.nextLine();
        
        switch(val1){
            
           
            case"1":
            {int num;
            int position = 10;
            
            System.out.print("\n Array : "+Arrays.toString(Arr));
            System.out.print("\n Enter the element which you want to insert: ");
            num = scn.nextInt();
            
            for(int i = 0; i <Arr.length; i++)
                
            Arr[position] = num;
            System.out.print("After inserting: ");
            System.out.print(Arrays.toString(Arr));
            break;
            }
            
            case"2":{
                int val, a = 0;
                System.out.print("\n Array : "+Arrays.toString(Arr));
                System.out.print("\nEnter the element which you want to Remove: ");
                val = scn.nextInt();
                Arr = FinLocationDelete(Arr, val);
                
                System.out.println("\nSuccessfully Remove a Element!");
                System.out.println(Arrays.toString(Arr));
                
                break;
            }
            
            case"3":{
                System.out.print("\n Traversing Array is Complete: ");
                for(int a = 0; a < Arr.length; a++){
                    System.out.print(Arr[a]+",");
                }
                break;
            }
            case"4":
            System.out.println("Thank please come again");
            break;
        }
        
    }
    
}
