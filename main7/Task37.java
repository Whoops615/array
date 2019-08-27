package by.pth.home02.main7;

import java.util.Random;

/*
 * 37. Переставить строки матрицы случайным образом.
 */

public class Task37 {

	public static void main(String[] args) {

		int[][] mas = new int[5][5];
		Method.masRand(mas, 10);
		Method.print1(mas);

		Random rand = new Random();

		int i1 = rand.nextInt(5);
		int i2 = rand.nextInt(5);

		System.out.println("Меняем строки: " + i1 + " и " + i2);
		System.out.println("----------------------------");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				int temp = 0;
				if (i == i1) {
					temp = mas[i][j];
					mas[i][j] = mas[i2][j];
					mas[i2][j] = temp;
				}
			}
		}
		Method.print1(mas);

	}

}
