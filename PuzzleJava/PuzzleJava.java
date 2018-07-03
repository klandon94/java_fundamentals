import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava{
    public ArrayList<Integer> greater10(int[] arr){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<arr.length; i++){
            if (arr[i] > 10){
                list.add(arr[i]);
            }
        }
        return list;
    }

    public ArrayList<String> longer5(ArrayList<String> arr){
        ArrayList<String> list = new ArrayList<String>();
        for (int i=0; i<arr.size(); i++){
            if (arr.get(i).length() > 5){
                list.add(arr.get(i));
            }
        }
        return list;
    }

    public void shuffleIsVowel(ArrayList<Character> arr){
        Collections.shuffle(arr);
        System.out.println(arr);
        System.out.println("Last character: " + arr.get(arr.size()-1));
        System.out.println("First character: " + arr.get(0));
        if (arr.get(0) == 'a' || arr.get(0) == 'e' || arr.get(0) == 'i' || arr.get(0) == 'o' || arr.get(0) == 'u'){
            System.out.println("You've got a vowel!");
        }
    }

    public ArrayList<Integer> random10(){
        ArrayList<Integer> rando = new ArrayList<Integer>();
        Random r = new Random();
        for (int i=0; i<10; i++){
            rando.add(55 + r.nextInt(45));
        }
        return rando;
    }

    public void sortedRandom10(){
        ArrayList<Integer> rando = new ArrayList<Integer>();
        Random r = new Random();
        for (int i=0; i<10; i++){
            rando.add(55 + r.nextInt(46));
        }
        Collections.sort(rando);
        System.out.println(rando);
        System.out.println("Min: " + rando.get(0));
        System.out.println("Max: " + rando.get(9));
    }

    public String randomStr(){
        Random r = new Random();
        ArrayList<Character> blah = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        String newStr = "";
        for (int i=0; i<5; i++){
            newStr += blah.get(r.nextInt(blah.size()));
        }
        return newStr;
    }

    public ArrayList<String> listRandomStr(){
        Random r = new Random();
        ArrayList<Character> blah = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        ArrayList<String> newlist = new ArrayList<String>();
        String newStr = "";

        for (int i=0; i<10; i++){
            for (int j=0; j<5; j++){
                newStr += blah.get(r.nextInt(26));
            }
            newlist.add(newStr);
            newStr = "";
        }
        return newlist;
    }
    
}