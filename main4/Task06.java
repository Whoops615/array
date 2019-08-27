package by.pth.home02.main4;

/*
 * 6. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника.
 */

public class Task06 {

	public static void main(String[] args) {

		double s;
		s = getSquare2(4);
		System.out.println("Площадь Правильного шестиугольника: " + s);

	}

	public static double getSquare2(int a) {

		double s = 6 * getSquare(a, a, a);
		return s;
	}

	public static double getSquare(int a, int b, int c) {

		double pr;
		double pl;
		double p;

		pr = a + b + c;
		p = pr / 2;
		pl = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		return pl;
	}

}
