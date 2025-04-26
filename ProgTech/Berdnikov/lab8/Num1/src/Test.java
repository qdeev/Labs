import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Test {
    //    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Input 3 sides: ");
//        double side1 = scanner.nextDouble();
//        double side2 = scanner.nextDouble();
//        double side3 = scanner.nextDouble();
//
//        System.out.print("Input color: ");
//        String color = scanner.next();
//
//        System.out.print("Is filled: ");
//        boolean isFilled = scanner.nextBoolean();
//
//        Triangle triangle = new Triangle(side1, side2, side3);
//        triangle.setColor(color);
//        triangle.setFilled(isFilled);
//
//        System.out.println(triangle.toString());
//        System.out.println("Area: " + triangle.getArea());
//        System.out.println("Perimeter: " + triangle.getPerimeter());
//        System.out.println("Color: " + triangle.getColor());
//        System.out.println("IsFilled: " + triangle.isFilled());
//    }
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(new Triangle(3, 4, 5));
        list.add(new Date());
        list.add("Hello!");
        list.add(new Circle(7));

        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }
}

