public class HelloWorld {
    public static void main(String[] args) {
        // напишем программу, которая вычисляет площадь треугольника по рандомным параметрам
        // умножаем две стороны, делим пополам и умножаем на синус угла
        int a = 3;
        int b = 4;
        int x = 30;
        double square = (a * b / 2 * Math.sin(x));
        System.out.println(square);
    }
}
