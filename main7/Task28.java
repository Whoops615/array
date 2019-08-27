package by.pth.home02.main7;

/*
 * 28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец
содержит максимальную сумму.
 */

public class Task28 {

	public static void main(String[] args) {

		int n = 5;
		int[][] mas = new int[n][n];
		Method.masRand(mas, 10);
		Method.print1(mas);

		int sum0 = sumColumn(mas, 0);
		int sum1 = sumColumn(mas, 1);
		int sum2 = sumColumn(mas, 2);
		int sum3 = sumColumn(mas, 3);
		int sum4 = sumColumn(mas, 4);

		System.out.println("Сумма столбца: 0 = " + sum0);
		System.out.println("Сумма столбца: 1 = " + sum1);
		System.out.println("Сумма столбца: 2 = " + sum2);
		System.out.println("Сумма столбца: 3 = " + sum3);
		System.out.println("Сумма столбца: 4 = " + sum4);

		int[] mas2 = new int[5];

		for (int i = 0; i < mas2.length; i++) {
			mas2[i] = sumColumn(mas, i);
		}

		int maxsum = 0;
		int index = 0;

		for (int i = 0; i < mas2.length; i++) {
			if (maxsum > mas2[i]) {
			} else {
				maxsum = mas2[i];
				index = i;
			}
		}

		System.out.println("Столбец: " + index + " содержит наибольшую сумму: " + maxsum);

	}

	public static int sumColumn(int[][] mas, int numberj) {
		int sum = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j == numberj) {
					sum = sum + mas[i][j];
				}
			}
		}
		return sum;
	}

}
