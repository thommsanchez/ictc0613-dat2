package com.company.Main;
import java.util.*;
class Act5B {
    public String fname, mname, lname, areacode, telephonenum, Gender;
    public int Age;
    public Act5B next;
    public static Act5B fNode;
    public static Act5B lNode = null;

    public Act5B(String Fname,String Mname,String Lname,String Acode,String Telnum,String gender,int age,Act5B n){
        fname = Fname;
        mname = Mname;
        lname = Lname;
        areacode = Acode;
        telephonenum = Telnum;
        Gender = gender;
        Age = age;
        next =  n;
    }
    public static void main(String[] args) {
        String fName, mName, lName, aCode, telNum, gender;
        int numnodes, age;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many member's information will be entered?: ");
        numnodes = scan.nextInt();
        for(int i = 0; i < numnodes; i++){
            System.out.println("\nKindly give the information of member #" + (i+1));
            System.out.print("Enter first name: ");
            fName = scan.next();
            System.out.print("Enter middle name: ");
            mName = scan.next();
            System.out.print("Enter last name: ");
            lName = scan.next();
            System.out.print("Enter area code: ");
            aCode = scan.next();
            System.out.print("Enter telephone number: ");
            telNum = scan.next();
            System.out.print("Enter gender: ");
            gender = scan.next();
            System.out.print("Enter age: ");
            age = scan.nextInt();
            Act5B n = new Act5B (fName, mName, lName, aCode, telNum, gender, age, null);
            if(lNode !=null){
                lNode.next = n;
            }
            else {
                fNode = n;
            }
            lNode = n;
        }
        Act5B n = fNode;
        while(n != null){
            System.out.println("\nWelcome to the club " + n.fname + " " + n.mname + " " + n.lname + "!");
            System.out.println("Your area code and telephone number is (" + n.areacode + ")" + n.telephonenum + ".");
            System.out.println("You are a " + n.Gender + " member, and your age is " + n.Age + ".");
            n = n.next;
        }
    }

}
