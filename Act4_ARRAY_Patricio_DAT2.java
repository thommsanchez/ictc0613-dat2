package com.company;
import java.util.*;
public class Main
{
    Scanner num1 = new Scanner(System.in);
    public int size = num1.nextInt();
    public int[] sorted = new int[size];
    public int counter = 0;
    public int arrL = sorted.length;

    public void insertItem()
    {
        if (counter == size)
        {
            System.out.println("Error array is full");
            return;
        }

        System.out.println("Enter element to be inserted: ");
        Scanner insert = new Scanner(System.in);
        int num2 = insert.nextInt();

        int location = identifyInsert(num2);
        int temp = sorted[location];
        sorted[location] = num2;

        for(int i = 0;i<arrL;i++)
        {
            if(sorted[i] == 0)
            {
                sorted [i] = temp;
                break;
            }
        }

        for(int i = 0;i<arrL-1;i++)
        {
            for (int j = 0;j<arrL-i-1;j++)
            {
                if(sorted[j]>sorted[j+1])
                {
                    int tmp = sorted [j];
                    sorted[j] = sorted[j+1];
                    sorted[j+1] = tmp;
                }
            }
        }
        if(num2 !=0)
            counter++;
    }

    public int identifyInsert(int num3)
    {
        int greater = 0;
        for(int i = 0;i<arrL;i++)
        {
            if(num3<sorted[i])
            {
                greater++;
            }
        }
        return greater;
    }

    public void deleteItem()
    {
        Scanner remove = new Scanner(System.in);
        int delete = remove.nextInt();
        int find = identifyDelete(delete);
        if(find == -1)
        {
            System.out.println("Element " + delete + " is not in the array");
            return;
        }
        if (arrL - 1 - find >= 0) System.arraycopy(sorted, find + 1, sorted, find, arrL - 1 - find);
        sorted[arrL-1]=0;
        System.out.println("Element " + delete + " is deleted in the array.");
    }

    public int identifyDelete(int num3)
    {
        for(int i=0;i<arrL;i++)
        {
            if(num3 == sorted[i])
            {
                return i;
            }
        }
        return -1;
    }

    public void travArray()
    {
        boolean empty = true;
        for (int i=0;i<arrL;i++)
        {
            if(sorted[i] !=0)
            {
                empty = false;
                break;
            }
        }
        if(empty)
        {
            System.out.println("Array is empty");
            return;
        }
        System.out.print("Elements of the array: ");

        for(int i=0;i<arrL;i++)
        {
            if (sorted[i] !=0)
            {
                System.out.print(sorted[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        System.out.print("Enter size of array: ");
        Main call = new Main();

        boolean stop = false;
        do
        {
            System.out.println("Basic Operations of Array");
            System.out.println("1.Input value");
            System.out.println("2.Remove value");
            System.out.println("3.Traverse array");
            System.out.println("4.Exit");

            System.out.print("Enter your choice: ");
            Scanner choice = new Scanner(System.in);

            switch(choice.nextInt())
            {
                case 1 -> call.insertItem();
                case 2 -> call.deleteItem();
                case 3 -> call.travArray();
                case 4 -> stop = true;
            }
        }
        while(!stop);
    }
}