import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PuzzleJava{
    BasicJava bj = new BasicJava();
    
    public void sum(int[] arr){
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
    public void includeNumGreaterThanTen(int arr[]){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i=0; i<arr.length; i++){
            if(arr[i] >= 10){
                myArray.add(arr[i]);
            }else {
                continue;
            }
        }
        System.out.println(myArray);
    }
    
    public void suffleArr(String arr[]){
        Collections.shuffle(Arrays.asList(arr));

        for (String str : arr) {
            System.out.println(str);
         }
    }

    public void nameLongerThanFicChar(String arr[]){
        ArrayList<String> myArray = new ArrayList<String>();
        for (int i=0; i<arr.length; i++){
            if(arr[i].length() >= 5){
                myArray.add(arr[i]);
            }else {
                continue;
            }
        }
        System.out.println(myArray);
    }

    //Generate and return an array with 10 random numbers between 55-100.
    public int[] randomGenerator(){
        int[] arr = new int[10];
        Random rand = new Random();
        int  n = 0;
        for (int i=0; i < 9; i++){
            arr[i] = rand.nextInt(100) + 55;
        }
        return arr;
    }
 
    //Create an array that contains all 26 letters of the alphabet (this array must have 26 values).

    public static void main(String[] args) {
        PuzzleJava pz = new PuzzleJava();
        BasicJava bj = new BasicJava();
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        pz.sum(arr);
        pz.includeNumGreaterThanTen(arr);

        //Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
        String[] name = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        
        //Shuffle the array and print the name of each person
        pz.suffleArr(name);

        String[] alphabet = {"a","b","c","d","e"};
        pz.suffleArr(alphabet);

        System.out.println(bj.printArr(pz.randomGenerator()));
    }
}