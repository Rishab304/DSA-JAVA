package array;

import java.util.Scanner;
public class LinearSearch {
    static boolean is_Linear(int[] arr, int target){
        for(int i =0; i <arr.length;i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;

    }
   

    
    static int Linear_search(int[] arr, int target){
        for(int i=0; i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return 0;
       

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements: ");
            int n =sc.nextInt();
            int[] arr = new int[n];

            for(int i =0; i<arr.length;i++){
                arr[i]=sc.nextInt();



            }
            System.out.println("Enter your target to search: ");
            int target = sc.nextInt();

            System.out.println(Linear_search(arr, target));
            System.out.println((is_Linear(arr, target)));

        }
    }



    

