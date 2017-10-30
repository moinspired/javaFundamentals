import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB){
        int a = legA * legA;
        int b = legB * legB;

        double squareRoot = Math.sqrt(a + b);
        return squareRoot;
    }
    
}