package by.pth.home02.main4;

/*
 * 16. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). Найти
и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения
задачи использовать декомпозицию.
 */

public class Task16 {

	public static void main(String[] args) {

		int n = 3;
		int n2 = 50;
		int size;
		size = sizeMas(n, n2);
		System.out.println("Размер массива: " + size);
		int[] mas = new int[size];
		getMas(mas, n, n2);
		Method.print(mas);
		twin(mas);

	}

	public static int sizeMas(int n, int n2) {
		int divider;
		boolean a = false;
		int count = 0;

		for (int i = n; i < n2; i++) {

			if (i == 2 || i == 3) {
				count++;

			} else if (i > 1) {
				divider = (int) Math.sqrt(i);
				for (int j = 2; j <= divider; j++) {
					if (i % j != 0) {
						a = true;

					} else {
						a = false;
						break;
					}
				}
				if (a == true) {
					count++;

				}
			}

		}
		return count;
	}

	public static void getMas(int[] mas, int n, int n2) {
		int divider;
		boolean a = false;
		int b = 0;

		for (int i = n; i < n2; i++) {

			if (i == 2 || i == 3) {
				mas[b] = i;
				b++;

			} else if (i > 1) {
				divider = (int) Math.sqrt(i);
				for (int j = 2; j <= divider; j++) {
					if (i % j != 0) {
						a = true;

					} else {
						a = false;
						break;
					}
				}
				if (a == true) {
					mas[b] = i;
					b++;

				}
			}

		}
	}

	public static void twin(int[] mas) {
		for (int i = 0; i < mas.length - 1; i++) {
			if (mas[i] - mas[i + 1] == -2) {
				System.out.println("Близнецы: " + mas[i] + " " + mas[i + 1]);
			}
		}
	}

}
