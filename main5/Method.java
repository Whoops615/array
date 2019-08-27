package by.pth.home02.main5;

import java.util.Random;

public class Method {


	// Заполнение массива случайными числами
	public static void randMas(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);

		}
	}
	// Вывод массива в консоль
	public static void print(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");

		}
	}
	// Нахождение наибольшего числа в массиве
	public static int max(int[] mas) {
		int max = mas[0];
		int indexmax = 0;
		
		for (int i = 0; i < mas.length - 1; i++) {
			if (max > mas[i + 1]) {

			} else {
				max = mas[i + 1];
				indexmax = i + 1;
			}
		}
		return indexmax;
	}
	// Нахождение наименьшего числа в массиве
	public static int min(int[] mas) {
		int min = mas[0];
		int indexmin = 0;
		for (int i = 0; i < mas.length - 1; i++) {
			if (min < mas[i + 1]) {

			} else {
				min = mas[i + 1];
				indexmin = i + 1;
			}
		}
		return indexmin;
	}

}
