import java.util.Scanner;
import java.util.LinkedList;
public class Act5_MyLinkedList_LALUNA_DAT2A {
    
    
    
    
    
   public static void main(String[] args) {
    Scanner lew= new Scanner(System.in).useDelimiter("\n");
    
  
    
    System.out.print("How many members’ information will be entered? ");
    int i=lew.nextInt();
    LinkedList<String> fname = new LinkedList<>();
    LinkedList<String> mname = new LinkedList<>();
    LinkedList<String> lname = new LinkedList<>();
      LinkedList<String> Acode = new LinkedList<>();
        LinkedList<String> TelNum = new LinkedList<>();
          LinkedList<String> Gender = new LinkedList<>();
            LinkedList<String> Age = new LinkedList<>();
    
System.out.println("");

    for (int x = 0; x < i; x++)
    {
        int a=1+x;
        System.out.print("Kindly give the information of member #"+a+"\n");
        
        System.out.print("Enter first name: ");
         fname.add(lew.next());
        
        
         System.out.print("Enter middle name: ");
         mname.add(lew.next());
         
          
         System.out.print("Enter last name: ");
          lname.add(lew.next());
          
         System.out.print("Enter area code: ");
            Acode.add(lew.next());
         
         
         System.out.print("Enter telephone number: ");
          TelNum.add(lew.next());
         
         System.out.print("Enter gender: ");
            Gender.add(lew.next());
         
         System.out.print("Enter age: ");
           Age.add(lew.next());
         
          System.out.println("");
    }
    
     for (int y =0 ; y < i; y++)
    {
        
        System.out.println("Welcome to the club "+fname.get(y)+" "+mname.get(y)+" "+lname.get(y)+"!");
        System.out.println("Your area code and telephone number is ("+Acode.get(y)+") "+TelNum.get(y)+"." );
         System.out.println("You are a "+Gender.get(y)+" member and your age is "+Age.get(y)+".");
          System.out.println("");
        
    }
    
     
   }
}
