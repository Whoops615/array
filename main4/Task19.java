package by.pth.home02.main4;

/*
 * 19. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. Определить
также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

public class Task19 {

	public static void main(String[] args) {

		sum(13579);

	}

	public static void sum(int a) {
		int n = 0;
		int sum = 0;
		while (a > 0) {
			n = a % 10;
			a = (a - n) / 10;
			if (n % 2 != 0) {
				sum = sum + n;
			} else {
				sum = 0;
				break;
			}
		}
		System.out.println("Сумма нечетных: " + sum);
		count(sum);
	}

	public static void count(int sum) {
		int n = 0;
		int count = 0;

		while (sum > 0) {
			n = sum % 10;
			sum = (sum - n) / 10;
			if (n % 2 == 0) {
				count++;
			}
		}
		System.out.println("Количесво четных в результате: " + count);
	}

}
