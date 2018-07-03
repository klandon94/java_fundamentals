public class PythagoreanTest{
    public static void main(String[] args){
        Pythagorean pythag = new Pythagorean();
        double hypotenuse = pythag.calculateHypotenuse(6, 4);
        System.out.println(hypotenuse);
    }
}