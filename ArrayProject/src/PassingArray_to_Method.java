import java.util.Scanner;

public class PassingArray_to_Method {




    //Main Mathod ..................
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        int a[] = new int[5];

        System.out.print("Enter a Random Number : ");

        for(int i = 0;i<a.length;i++){

            a[i] = input.nextInt();

        }

        max(a);
        min(a);


    }

//<Main Mathod End ..........................



//Max Mathod  Start ..................

    static void max(int arr[]){

        int max = arr[0];

        for(int x : arr){

            if (max<x) {
                max=x;


            }
           
        }
        System.out.println("Max Number is : "+max); 
    

    }

//Max Mathod End .............


//Min Mathod Start .............

    static void min(int ar[]){

        int min = ar[0];

        for(int i=0;i<ar.length;i++){

            if (min>ar[i]) {
                
                min=ar[i];

            }

        }
        System.out.println("Min Number is : "+min); 


    }


// Min Mathod End  .............



}
