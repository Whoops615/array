package by.pth.home02.main4;

/*
 * 5. Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.
 */

public class Task05 {

	public static void main(String[] args) {

		int sum;
		sum = sum(10, 20, 44);
		System.out.println("Сумма: " + sum);

	}

	public static int sum(int a, int b, int c) {

		int min = Math.min(Math.min(a, b), Math.min(b, c));
		int max = Math.max(Math.max(a, b), Math.max(b, c));

		System.out.println("Меньшее число: " + min);
		System.out.println("Большее число: " + max);

		int sum = min + max;
		return sum;
	}

}
