import java.util.ArrayList;

public class BasicJava{
    public void print1To255(){
        for (int i=1; i<=255; i++){
            System.out.println(i);
        }
    }
    public void printOdd1To255(){
        for (int i=1; i<=255; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    public void printSums(){
        int sum = 0;
        for (int i=0; i<=255; i++){
            sum += i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }
    public void iterateArray(int[] arr){
        for (int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public int findMax(int[] arr){
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public double findAverage(int[] arr){
        double sum = 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum/arr.length;
    }
    public ArrayList<Integer> oddNumbers(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 1; i <= 255; i++){
            if (i % 2 != 0){
                y.add(i);
            }
        }
        return y;
    }
    public int greaterY(int[] arr, int Y){
        int count = 0;
        for (int i=0; i < arr.length; i++){
            if (arr[i] > Y){
                count++;
            }
        }
        return count;
    }
    public int[] squared(int[] arr){
        for (int i=0; i<arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }
    public int[] removeNegs(int[] arr){
        for (int i=0; i<arr.length; i++){
            if (arr[i] < 0){
                arr[i] = 0;
            }
        }
        return arr;
    }
    public ArrayList<Object> maxMinAvg(int[] arr){
        int max = arr[0];
        int min = arr[0];
        double sum = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];                
            }
            if (arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }
        ArrayList<Object> y = new ArrayList<Object>();
        y.add(max);
        y.add(min);
        y.add(sum/arr.length);
        return y;
    }
    public int[] shiftValues(int[] arr){
        for (int i=0; i < arr.length - 1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        return arr;
    }
    public static void dojoNegatives(Object[] arr){
        for (int i=0; i<arr.length; i++){
            if (arr[i] instanceof Integer){
                if ((int) arr[i] < 0){
                    arr[i] = "Dojo";
                }
            }
        }
        System.out.println(arr);
    }
}