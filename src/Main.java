import com.bridgelabz.matrix.EqualMatrix;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        EqualMatrix e = new EqualMatrix();
        int[][]a={{2,4},{6,8}};
        int[][]b={{8,1},{5,6}};
        System.out.println(e.checkMatrices(a,b));
        }
    }
