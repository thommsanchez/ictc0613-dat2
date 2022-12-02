
package DataStructureFolder;

import java.util.Scanner;
import java.util.LinkedList;

public class Act5_MyLinkedList_Ocampo_DAT2 {


    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("How many Member's Information will be Entered? ");
        
        int a = scn.nextInt();
        
        //Name information
        LinkedList<String> val1 = new LinkedList<>();
        LinkedList<String> val2 = new LinkedList<>();
        LinkedList<String> val3 = new LinkedList<>();
        
        //Code area information
        LinkedList<Integer> num1 = new LinkedList<>();
        
        //Phone number information
        LinkedList<Integer> num2 = new LinkedList<>();
        
        //Gender Information
        LinkedList<String> val4 = new LinkedList<>();
        
        //Age Information
        LinkedList<Integer> num3 = new LinkedList<>();
        
        for (int b = 0; b < a; b++){
            
            int c= 1 +b; 
            
            System.out.println("Kindly give the information of member #"+c);
            
            
            //Name Information
            System.out.print("Enter the First Name: ");
            val1.add(scn.next());
            
            System.out.print("Enter the Middle Name: ");
            val2.add(scn.next());
            
            System.out.print("Enter the Last Name: ");
            val3.add(scn.next());
            
            //Code area Information
            System.out.print("Enter area code: ");
            num1.add(scn.nextInt());

            //Phone Number Information
            System.out.print("Enter telephone number: ");
            num2.add(scn.nextInt());
            
            //Gender Information
            System.out.print("Enter Gender: ");
            val4.add(scn.next());
            
            //Age inforamtion
            System.out.print("Enter Age: ");
            num3.add(scn.nextInt());            
        }
        
        for(int d = 0; d < a; d++){
                  
          //Information output
          System.out.println("Welcome to the club "+val1.get(d)+" "+val2.get(d)+" "+val3.get(d)+"!");
          System.out.println("Your area code and telephone number is ("+num1.get(d)+") "+num2.get(d)+"." );
          System.out.println("You are a "+val4.get(d)+" member and your age is "+num3.get(d)+".");
          System.out.println("");
        
        }
 
    }
    
}
