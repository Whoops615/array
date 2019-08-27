package by.pth.home02.main7;

import java.util.Scanner;

/*
 * 26. С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие действия:
а) вычислить сумму отрицательных элементов в каждой строке;
б) определить максимальный элемент в каждой строке;
в) переставить местами максимальный и минимальный элементы матрицы.
 */

public class Task26 {

	public static void main(String[] args) {

		int n = 4;
		int m = 4;
		int[][] mas = new int[n][m];

		scanMas(mas);
		Method.print1(mas);
		sumNegativeLine(mas);
		maxElementLine(mas);

		int max = Method.max(mas);
		int min = Method.min(mas);
		int maxi = 0;
		int maxj = 0;
		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == max) {
					maxi = i;
					maxj = j;
				}
				if (mas[i][j] == min) {
					mas[i][j] = max;
				}
			}
		}
		mas[maxi][maxj] = min;

		Method.print1(mas);

	}

	public static void scanMas(int[][] mas) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Заполните массив >>>");
		System.out.println("-----------------------");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = sc.nextInt();
			}
		}
	}

	public static void sumNegativeLine(int[][] mas) {

		int sum = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] < 0) {
					sum = sum + mas[i][j];
				}
			}
			System.out.println("Сумма отрицательных элементов в  строке: " + i + " = " + sum);
			sum = 0;
		}
		System.out.println("-----------------------");
	}

	public static void maxElementLine(int[][] mas) {

		int max;

		for (int i = 0; i < mas.length; i++) {
			max = mas[i][0];
			for (int j = 0; j < mas[i].length; j++) {
				if (max > mas[i][j]) {
				} else {
					max = mas[i][j];
				}
			}
			System.out.println("Максимальный элемент в строке: " + i + " = " + max);
		}
		System.out.println("-----------------------");

	}

}
