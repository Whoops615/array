package by.pth.home02.main7;

/*
 * 31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней.
 */

public class Task31 {

	public static void main(String[] args) {

		int[][] mas = new int[10][100];
		int temp = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == 0 & j == 0) {
					mas[i][j] = 0;
				} else {
					mas[i][j] = temp + 1;
					temp = mas[i][j];
				}

			}
		}

		Method.print1(mas);
		System.out.println("Количесво двузначных: "+count(mas));

	}

	public static int count(int[][] mas) {
		int count = 0;
		int count2 = 0;
		int a;
		int n;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				count2 = 0;
				a = mas[i][j];
				while (a > 0) {
					n = a % 10;
					a = (a - n) / 10;
					count2++;
				}
				if (count2 == 2) {
					count++;
				}

			}
		}

		return count;
	}

}
