import java.util.Scanner;
import java.text.DecimalFormat;

public class beecrowd1002 {
    void main(){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000"); // cool way to format decimal stuff -> 0 means it is mandatory
        double r = sc.nextDouble();
        double result = 3.14159 * (r*r);

        System.out.println("A="+df.format(result));

    }
}
