package by.pth.home02.main4;

/*
 * 15. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не большее N.
 */

public class Task15 {

	public static void main(String[] args) {

		int n = 17;
		int k = 600;
		int size;
		size = (sizeMas(n, k));
		System.out.println("Размер массива: " + size);
		int[] mas = new int[size];
		getMas(mas, n, k);
		Method.print(mas);

	}

	public static int sizeMas(int n, int k) {
		int sum = 0;
		int j = 0;
		int n1 = 0;
		int count = 0;

		for (int i = 1; i < k; i++) {
			j = i;
			sum = 0;

			while (j > 0) {
				n1 = j % 10;
				j = (j - n1) / 10;
				sum = sum + n1;
			}

			if (sum == n) {
				count++;
			}
		}
		return count;
	}

	public static void getMas(int[] mas, int n, int k) {
		int sum = 0;
		int j = 0;
		int n1 = 0;
		int f = 0;

		for (int i = 1; i < k; i++) {
			j = i;
			sum = 0;

			while (j > 0) {
				n1 = j % 10;
				j = (j - n1) / 10;
				sum = sum + n1;
			}

			if (sum == n) {
				mas[f] = i;
				f++;
			}
		}

	}

}
