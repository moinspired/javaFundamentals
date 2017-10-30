import java.lang.Math;

public class Pythagorean {
    public static double four = 4.0;
    public double calculateHypotenuse(int legA, int legB){
        int a = legA * legA;
        int b = legB * legB;

        double squareRoot = Math.sqrt(a +b);
        return squareRoot;
    }

    public static void main(String[] args) {
       Pythagorean pyth = new Pythagorean();
       double firstPyth = pyth.calculateHypotenuse(2,2);
       System.out.println(firstPyth);
    }
}