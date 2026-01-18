
import java.awt.Point;

public class Types {
    public static void main(String[] args) {
        //primitive type variable
        int x = 11;
        int y = x;
        x = 13;
        System.out.println(x);
        System.out.println(y);

        // reference type variable
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x=2;
        System.out.println(point1);
        System.out.println(point2);


    }
}