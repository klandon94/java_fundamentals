
public class StringManipulatorTest{
    public static void main(String[] args){
        StringManipulator manipulator = new StringManipulator();

        System.out.println(manipulator.trimAndConcat("     Hello     ","     World     "));

        Integer a = manipulator.getIndexOrNull("Coding", 'o');
        Integer b = manipulator.getIndexOrNull("Hello World", 'o');
        Integer c = manipulator.getIndexOrNull("Hi", 'o');
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = manipulator.getIndexOrNull(word, subString);
        Integer e = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(d);
        System.out.println(e);

        String newWord = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(newWord);
    }
}