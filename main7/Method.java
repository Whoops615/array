package by.pth.home02.main7;

import java.util.Random;

public class Method {

	public static void main(String[] args) {

	}

	// Вывод значений
	public static void print1(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%-5d", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	// Вывод значений с номерами ячеек
	public static void print2(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("mas[%d][%d]=%-6d", i, j, mas[i][j]);
			}
			System.out.println();
		}
	}

	// Заполнение случайными сислами с заданным диапозоном
	public static void masRand(int[][] mas, int range) {
		Random rand = new Random();
		int r = range;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(r);
			}
		}
	}
	//Максимальный элемент двумерного массива
	public static int max(int[][] mas) {
		int max = mas[0][0];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (max > mas[i][j]) {
				} else {
					max = mas[i][j];
				}
			}
		}
		return max;
	}
	//Минимальный элемент двумерного массива
	public static int min(int[][] mas) {
		int min = mas[0][0];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (min < mas[i][j]) {
				} else {
					min = mas[i][j];
				}
			}
		}
		return min;
	}

}
