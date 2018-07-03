import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJavaTest{
    public static void main(String[] args){
        PuzzleJava puzzle = new PuzzleJava();

        // First puzzle
        // int[] arr1 = {3,5,1,2,7,9,8,13,25,32};
        // System.out.println (Arrays.toString(arr1));
        // System.out.println (puzzle.greater10(arr1));

        // Second puzzle
        // ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));
        // Collections.shuffle(arr2);
        // System.out.println(arr2);
        // System.out.println(puzzle.longer5(arr2));

        // Third puzzle
        // ArrayList<Character> arr3 = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        // puzzle.shuffleIsVowel(arr3);

        // Fourth puzzle
        // System.out.println(puzzle.random10());

        // Fifth puzzle
        // puzzle.sortedRandom10();

        // Sixth puzzle
        // System.out.println(puzzle.randomStr());

        // Seventh puzzle
        System.out.println(puzzle.listRandomStr());

    }
}