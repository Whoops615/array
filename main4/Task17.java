package by.pth.home02.main4;

/*
 * 17. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная
в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать
декомпозицию.
 */

public class Task17 {

	public static void main(String[] args) {

		int k = 1000;
		arm(k);

	}

	public static void arm(int k) {
		for (int i = 1; i < k; i++) {
			if (sum(i) == i) {
				System.out.print(i + " ");
			}
		}
	}

	public static int sum(int a) {
		int n = 0;
		int sum = 0;
		int _a = a;
		int count = count(a);

		while (_a > 0) {
			n = _a % 10;
			_a = (_a - n) / 10;
			sum = sum + (int) Math.pow(n, count);
		}
		return sum;
	}

	public static int count(int a) {
		int n = 0;
		int count = 0;
		int _a = a;

		while (_a > 0) {
			n = _a % 10;
			_a = (_a - n) / 10;
			count++;
		}
		return count;
	}

}
