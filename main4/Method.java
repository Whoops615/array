package by.pth.home02.main4;

import java.util.Random;

public class Method {

	// Заполнение массива случайными числами
	public static void randMas(int[] mas, int range) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(range);

		}
	}
	// Вывод массива в консоль
	public static void print(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println("\n-------------------------");
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
	// Пузырьковая сортировка от большего к меньшему
	public static void sortMax(int[] mas) {
		for(int i = 0; i<mas.length;i++) {
			
			for(int j = 0; j<mas.length-1;j++) {
				
				if(mas[j] < mas[j+1]) { 
					int temp;
					temp = mas[j];
					mas[j] = mas[j+1];
					mas[j+1] = temp;	
				}
			}
		}
		
	}
	

}
