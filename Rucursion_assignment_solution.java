//solution1-->
import java.util.*;
public class myText {
    public static int number(int n){
        if (n>0){
            return(n%10 + number(n/10));
        }return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int result=number(n);
        System.out.println(result);


    }


}




//solution2-->
import java.io.*;
import java.util.*;

public class Main
{   static int go(int n  , int i){
    if(i == n + 1)return 0;
    if(i%2 == 0)return go(n , i + 1) - i;
    else return go(n , i + 1) + i;
}
	public static void main(String[] args) {
	   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(go(n,1));
   

	}
}


solution3-->
  // Recursive java program to find maximum element in an array
// function to print maximum element using recursion
import java.io.*;
import java.util.*;
public class Main{
    public static int maxValue(int arr[], int n, int idx){
        if(idx == n - 1)
        return arr[n - 1];
        int maxOfLaterIndices = maxValue(arr, n,idx + 1);
        int maxVal = Math.max(arr[idx], maxOfLaterIndices);
        return maxVal;
    }
    public static void main(String[] args) {
        int[] arr={13,1,-3,22,5};
        int n=arr.length;
        System.out.println("The max value is : " + maxValue(arr,n,0));
    }
}
