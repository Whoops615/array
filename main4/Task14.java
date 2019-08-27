package by.pth.home02.main4;

/*
 * 14. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class Task14 {

	public static void main(String[] args) {

		int a = 1274564789;
		int b = 123456;
		System.out.println("Число А: " + a);
		System.out.println("Число В: " + b);
		maxNum(a, b);

	}

	public static int sizeNum(int a) {

		int b;
		int count = 0;
		while (a > 0) {
			b = a % 10;
			a = (a - b) / 10;
			count++;
		}

		return count;
	}

	public static void maxNum(int a, int b) {
		if (sizeNum(a) > sizeNum(b)) {
			System.out.println("В числе A больше цифр");
		} else if (sizeNum(a) < sizeNum(b)) {
			System.out.println("В числе B больше цифр");
		} else {
			System.out.println("Одинаковое количиство цифр");
		}
	}

}
