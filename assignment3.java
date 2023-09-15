// Student no.: 121376141
// Student name: Peace Samuel

//Java Assignment 3
import java.util.*;
public class assignment3 
{
    static void number_input()//Program1
    {
        ArrayList<Integer> num_list = new ArrayList<Integer>();
        //get 10 numbers from user, store in int list
        for (int i=0; i<10; i++){
            Scanner num = new Scanner(System.in);
            System.out.println("Enter a number:");
            int number = num.nextInt();
            num_list.add(number);
        }
        // find the sum of the even numbers, and the sum of odd numbers
        int sum_even =0, sum_odd=0, n=0;
        do 
        {
            if (num_list.get(n) % 2==0){sum_even = sum_even + 1;}
            else if (num_list.get(n) % 2!= 0) {sum_odd =sum_odd + 1;}
            n++;
        }
        while (n < num_list.size());
        //print number of even and odd numbers to the screen
        System.out.println("Number of even numbers entered:" + sum_even);
        System.out.println("Number of odd numbers entered:" + sum_odd);
        
    }
    static void standard_deviation()//Program2
    {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the value of N(no. of inputs):");
        int n= num.nextInt();
        //store N numbers in the int list, input from user
        ArrayList<Double> num_list = new ArrayList<Double>();
        double sum =0;
        for (double i =0; i< n;i++)
        {
            Scanner number = new Scanner(System.in);
            System.out.println("Enter number:");
            double no = number.nextDouble();
            sum = sum +no;
            num_list.add(no);
        }
        //find average of all the numbers
        double average =0;
        average = sum / n;

        //work out the standard deviation using formula
        double accum=0, minus=0, sq=0,s=0;
        for (int i=0; i < num_list.size(); i++){
            minus= num_list.get(i) - average;
            sq = minus*minus;
            accum += sq;
        }
        accum =accum /n;
        s = Math.sqrt(accum);
        System.out.println("Standard deviation:"+ s);
        System.out.println("Average:" + average);

        
    }
    static void alphabetical_names()//Program3
    {
        //get list of names from  user, 10 total
        String[] name_list = new String[10];
        for (int i=0; i< name_list.length;i++){
            Scanner n = new Scanner(System.in);
            System.out.println("Enter a name:");
            name_list[i] = n.nextLine();
        }
        //sort the names in alphabetical order
        for (int i=0; i< name_list.length; i++){
            for (int j=i+1; j< name_list.length; j++ ){
                if (name_list[i].compareTo(name_list[j]) > 0){
                    String temp = name_list[i];
                    name_list[i] = name_list[j];
                    name_list[j] = temp;
                }
            }   
        }
        //print out each name in the sorted list
        for (String name : name_list){
            System.out.print(name + " ");
       }
    }
    static void matrix()//Program4
    {
        //create 3 2d matrices
        int [][] matrix1 = new int[3][3];
        int [][] matrix2 = new int [3][3];
        int [][] matrix_ans = new int [3][3];
        //populate matrix1
        for (int i=0; i<3;i++){
            for (int j=0; j<3; j++){
                Scanner number = new Scanner(System.in);
                System.out.println("Enter 9 numbers for matrix1:");
                int n = number.nextInt();
                matrix1[i][j]=n;
            }
        }
        //populate matrix2
        for (int i=0; i<3; i++){
            for (int j=0; j<3;j++){
                Scanner number = new Scanner(System.in);
                System.out.println("Enter 9 numbers for matrix2:");
                int n= number.nextInt();
                matrix2[i][j]=n;
            }
        }
        //populate matrix_ans with the addition of matrix1 and matrix2, print answer matrix
        for (int i=0; i< matrix1.length; i++){
            for (int j=0; j<3; j++){
                matrix_ans[i][j]= matrix1[i][j] + matrix2[i][j];
                System.out.print(matrix_ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void transpose()//Program5
    {
        //create 2d matrix
        int [][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] matrix_new = new int[3][3];

        System.out.println("ORIGINAL:");
        for (int i=0; i< matrix1.length; i++){
            for (int j=0; j<3; j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        //print the transpose of the matrix
        System.out.println("TRANSPOSE:");
        for (int i=0; i < matrix1.length; i++){
            for (int j=0; j<3; j++){
                matrix_new[i][j] =matrix1[j][i];
                System.out.print(matrix_new[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void three_d_array()//Program6
    {
        //create 3d matrix
        int [][][] array = {
            {{1,2,3},{5,4,6}},{{1,3,7},{6,3,9}},{{4,8,2},{12,7,4}}
        };
        //print 3d matrix to the screen
        for (int i=0; i < array.length; i++){
            for (int j=0; j< array[i].length; j++){
                for (int k=0; k< array[i][j].length; k++){
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        //Get number input from user
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = num.nextInt(); 

        //Check if n is in the 3D array
        Boolean found = false;
        for (int i=0; i < array.length;i++){
            for (int j =0; j< array[i].length; j++){
                for (int k=0; k< array[i][j].length; k++){
                    if (array[i][j][k] == n){
                        found = true;
                        break;
                    }
                }
                //
            }
            //
        }
        if (found == true){
            System.out.println(n + " is in the 3D array :)");
        } 
        else {
            System.out.println(n + " is not in the 3D array :(");
        }
    }

    public static void main (String args[])
    {
        //number_input();
        //standard_deviation();
        //alphabetical_names();
        //matrix();
        //transpose();
        three_d_array();
    }
}