package by.pth.home02.main4;

/*
 * 11. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.
 */

public class Task11 {

	public static void main(String[] args) {

		int[] mas = new int[10];
		Method.randMas(mas, 10);
		Method.print(mas);
		System.out.println("Сумма элементов: " + sumMas3(mas, 3, 5));

	}

	public static int sumMas3(int[] mas, int k, int m) {

		int sum = 0;
		for (int i = k; i <= m; i++) {
			sum = sum + mas[i];
		}
		return sum;
	}

}
