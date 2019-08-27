package by.pth.home02.main4;

/*
 * 12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.
 */

public class Task12 {

	public static void main(String[] args) {

		double result;
		result = getSquare(5, 7, 4, 6);
		System.out.println("Площадь: " + result);

	}

	public static double hypotenuse(int a, int b) {
		double c;
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return c;
	}

	public static double getSquare(int x, int y, int z, int t) {

		double s1;
		double s2;
		double square;
		s1 = (x * y) / 2;
		double perimetr = z + t + hypotenuse(x, y);
		double p = perimetr / 2;
		s2 = Math.sqrt(p * (p - hypotenuse(x, y)) * (p - z) * (p - t));
		square = s1 + s2;
		return square;
	}

}
