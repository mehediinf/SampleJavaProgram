import java.util.Scanner;

public class ArrayForEachLoop {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int i,sum=0;

        int[] num = new int[5];

        System.out.print("Enter your 5 array value : ");

        for(i=0;i<num.length;i++){

           num[i] = input.nextInt();

        }

// For-each Loop


        for(int x : num){

            sum = sum + x;

        }

        System.out.println("Array Sum : "+sum);






/** 
        int[] num = {10,20,30,40};

        for(int x : num){

            System.out.println(x);
        }
        System.out.println("Array Length : "+num.length);



      */  


    }


}
