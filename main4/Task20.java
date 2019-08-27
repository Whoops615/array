package by.pth.home02.main4;

/*
 * 20. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */

public class Task20 {

	public static void main(String[] args) {

		System.out.println("Количество вычитаний: " + subtraction(5687));

	}

	public static int subtraction(int a) {
		int count = 0;
		while (a > 0) {
			a = a - sum(a);
			count++;
		}

		return count;
	}

	public static int sum(int b) {
		int n = 0;
		int sum = 0;
		while (b > 0) {
			n = b % 10;
			b = (b - n) / 10;
			sum = sum + n;
		}

		return sum;
	}

}
