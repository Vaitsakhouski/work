import java.util.Scanner;

/**
 * Check triangle on its type
 *
 * @author Vaitsakhouski Raman
 * @since 01-10-2016
 */
public class Main {

    /**
     * entering sides,if triangle is exist -
     * app show what type of triangle
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        try {
            double a = 0;
            double b = 0;
            double c = 0;
            System.out.println("write a - ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextDouble()) {
                a = sc.nextDouble();
            } else {
                System.out.println("side must be a number");
                System.exit(1);
            }
            System.out.println("write b - ");
            Scanner sc1 = new Scanner(System.in);
            if (sc1.hasNextDouble()) {
                b = sc1.nextDouble();
            } else {
                System.out.println("side must be a number");
                System.exit(1);
            }
            System.out.println("write c - ");
            Scanner sc2 = new Scanner(System.in);
            if (sc2.hasNextDouble()) {
                c = sc2.nextDouble();
            } else {
                System.out.println("side must be a number");
                System.exit(1);
            }
            Triangle tr = new Triangle(a, b, c);
            tr.valid();
            System.out.println(tr.getType());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
