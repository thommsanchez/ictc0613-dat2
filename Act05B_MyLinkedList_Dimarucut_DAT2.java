
package act5_mylinkedlist._dimarucut_dat2;

import java.util.LinkedList;
import java.util.Scanner;

public class Act5_MyLinkedList_Dimarucut_DAT2 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);

        LinkedList<String> FirstName = new LinkedList<>();
        LinkedList<String> MiddleName = new LinkedList<>();
        LinkedList<String> LastName = new LinkedList<>();
        LinkedList<Integer> Area = new LinkedList<>();
        LinkedList<String> Telephone = new LinkedList<>();
        LinkedList<String> Gender = new LinkedList<>();
        LinkedList<Integer> Age = new LinkedList<>();

        System.out.print("How many members information will be entered? ");
        int members = in.nextInt();

        for(int i = 0; i < members; i++){
            Scanner scan = new Scanner(System.in);
            Scanner scan2 = new Scanner(System.in);
            System.out.println("\nKindly give the information of member #" + (i + 1));
             
            System.out.print("Enter first name: ");
            String firstname = scan.nextLine();
            System.out.print("Enter middle name: ");
            String middlename = scan.nextLine();
            System.out.print("Enter last name: ");
            String lastname = scan.nextLine();
            System.out.print("Enter area code: ");
            int area = scan.nextInt();
            System.out.print("Enter telephone number: ");
            String telephone = scan2.nextLine();
            System.out.print("Enter gender: ");
            String gender = scan2.nextLine();
            System.out.print("Enter age: ");
            int age = scan2.nextInt();
             
            FirstName.add(firstname);
            MiddleName.add(middlename);
            LastName.add(lastname);
            Area.add(area);
            Telephone.add(telephone);
            Gender.add(gender);
            Age.add(age);
        
           }

           for(int x = 0; x < members; x++){
               System.out.println("\nWelcome to the club " + FirstName.get(x) + " " + MiddleName.get(x) + " " + LastName.get(x) + "!");
               System.out.println("Your area code and telephone number is (" + Area.get(x) + ") " + Telephone.get(x) + ".");
               System.out.println("You are a " + Gender.get(x) + " member and your age is " + Age.get(x) + ".");
        
            }
}
}