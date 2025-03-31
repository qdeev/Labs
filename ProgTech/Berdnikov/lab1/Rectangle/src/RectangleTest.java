public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("Прямоугольник 1:");
        System.out.println("Ширина: " + rectangle1.getWidth());
        System.out.println("Высота: " + rectangle1.getHeight());
        System.out.println("Площадь: " + rectangle1.getArea());
        System.out.println("Периметр: " + rectangle1.getPerimeter());

        System.out.println("\nПрямоугольник 2:");
        System.out.println("Ширина: " + rectangle2.getWidth());
        System.out.println("Высота: " + rectangle2.getHeight());
        System.out.println("Площадь: " + rectangle2.getArea());
        System.out.println("Периметр: " + rectangle2.getPerimeter());
    }
}