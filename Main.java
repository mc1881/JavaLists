/* 
Madalynn Cannon- Lists(Java)

Purpose: Creates a list of 32 random numbers, calculates the sum, the average, the largest and smallest in the list, and the sorted list

Algorithm:
1. generate the list of numbers
2. add them to a vector
3. display the list
4. find the sum, average, max and min and display
5. sort the list and display
*/

//add all necessary headers
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class lists{
     public static void main(String []args){
         
//create scanner
         Scanner input = new Scanner(System.in);
         
//create new random number
         Random rand = new Random(); 

//create a new integer list        
         List<Integer> list = new ArrayList();

//initalize the sum         
         int sum = 0;
 
//add the random 32 numbers into the list and calculate the sum      
         for(int count = 0; count < 32; count++){
            int randNum = rand.nextInt(101);
            list.add(randNum);
            sum += randNum;
         }
         
         System.out.println("The list of numbers is: ");
         
//print the list        
        for(int i = 0; i < 32; i++){
            System.out.println(i+1 + ". " + list.get(i));
        }
        
//display the sum and calculate/display the average       
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + sum/32);

//sort the list       
        Collections.sort(list);

//display the sorted list       
        System.out.println("The sorted list of numbers is: " + list);
        
//calculate the min/max and display
        System.out.println("The mininum number in the array is: " + Collections.min(list,null));
        System.out.println("The maximum number in the array is: " + Collections.max(list));
}
}
