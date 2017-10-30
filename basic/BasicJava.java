import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    public void numberTo255(){
        for (int i=0; i<=255; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }

    }

    public void sumation(){
        int sum=0;
        for (int i=0; i<=255; i++){
            sum = sum + i;
        }
        System.out.println("Sum:" + sum);
    }

    public void printArr(int arr[] ){
        for (int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public Integer max(int arr[]){
        int max = arr[0];
        for (int i=0; i < arr.length; i++){
            if (arr[0] < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public Integer min(int arr[]){
        int min = arr[0];
        for (int i=0; i < arr.length; i++){
            if (arr[0] > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public Integer average(int arr[]){
        int average = 0;
        for (int i=0; i < arr.length; i++){
            average += i;
        }
   
        return average/arr.length;
    }
    
    public void arrayOfOdds() {
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        for (int i = 1; i < 256; i = i + 2) {
            myArray.add(i);
        }

        System.out.println(myArray);
    }
    
    public void greaterThanY(int[] arr, int x) {
        int count = 0;
        for (int i=0; i < arr.length; i++){
             if (arr[i] > x){
                 count++;
            }
        }
        System.out.println(count);
    }
    public void square(int[] arr){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i=0; i < arr.length; i++){
            myArray.add(arr[i]*arr[i]);
        }
        System.out.println(myArray);
    }

    public void negativeNum(int[] arr){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i=0; i < arr.length; i++){
            if(arr[i] < 0){
                continue;
            } else {
                myArray.add(arr[i]);
            }
        }
        System.out.println(myArray);
    }

    public String maxMinAverage(int[] arr){
        int[] newArr = new int[3];
        newArr[0] = max(arr);
        newArr[1] = average(arr);
        newArr[2] = min(arr);
        
        String str = "[";
        for(Integer val: newArr){
            if (val == newArr[newArr.length-1]){
                str += val;
            } else {
             str += val + ", ";
            }
        }
        str += "]";
        return str;
    }

    public static void main(String[] args) {
        BasicJava bj = new BasicJava();
        bj.sumation();
        int[] myArray = {1,3,5,-7,9,13};
        bj.printArr(myArray);
        Integer max =  bj.max(myArray);
        System.out.println("Max value: " + max);
        Integer average = bj.average(myArray);
        System.out.println("Average: " + average);
        bj.arrayOfOdds();
        bj.greaterThanY(myArray, 3);
        bj.square(myArray);
        bj.negativeNum(myArray);
         System.out.println(bj.maxMinAverage(myArray));
    }



}