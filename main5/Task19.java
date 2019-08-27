package by.pth.home02.main5;

import java.util.Random;

/*
 * 19. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел
несколько, то определить наименьшее из них.
 */

public class Task19 {

	public static void main(String[] args) {
		
		int[] mas = new int[20];
		int[] mas2 = new int[20];
		randMas(mas);
		Method.print(mas);
		System.out.println("\n---------------------------");

		int a = 0;
		int b = 0;
		int count = 0;
		int c = 0;

		for (int i = 0; i < mas.length; i++) {
			a = mas[i];
			for (int j = 0; j < mas.length; j++) {
				if (a == mas[j]) {
					b++;
				}
			}
			mas2[i] = b;
			b = 0;
		}
		Method.print(mas2);
		System.out.println("\n---------------------------");
		int maxpovtor;
		maxpovtor = Method.max(mas2);
		System.out.println("Максимальное число повторений: " + mas2[maxpovtor]);

		for (int i = 0; i < mas2.length; i++) {
			if (mas2[i] == mas2[maxpovtor]) {
				count++;
			}
		}
		System.out.println("Размер массива наибольших повторений: " + count);
		int[] mas3 = new int[count];

		for (int i = 0; i < mas2.length; i++) {
			if (mas2[i] == mas2[maxpovtor]) {
				mas3[c] = mas[i];
				c++;
			}
		}

		Method.print(mas3);
		System.out.println("\n---------------------------");
		int result;
		result = Method.min(mas3);

		if (count == 20) {
			System.out.println("Повторов нету");
		} else {
			System.out.println("Минимальное, наиболее часто встречающееся число: " + mas3[result]);
		}

	}
	
	public static void randMas(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(5);

		}
	}

}
