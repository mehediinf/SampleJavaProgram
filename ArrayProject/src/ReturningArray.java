public class ReturningArray {
    public static void main(String args[]){  

//calling method which returns an array  

    int arr[]=get();  


//printing the values of an array  

    for(int i=0;i<arr.length;i++)  
        System.out.println(arr[i]); 


    }


//creating method which returns an array  

    static int[] get(){  
  
    return (new int[]{10,7,5,4});
     
    }  
      

}
