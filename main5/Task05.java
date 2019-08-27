package by.pth.home02.main5;

/*
 * 5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности.
Если таких чисел нет, то вывести сообщение об этом факте.
 */

public class Task05 {

	public static void main(String[] args) {

		int[] mas = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Method.print(mas);
		System.out.println("\n------------------------------");
		int n = getAmount(mas);

		if (n > 0) {
			System.out.println("Количество четных: " + n);
			int[] mas2 = new int[n];
			int i2 = 0;
			for (int i = 0; i < mas.length; i++) {
				if (mas[i] % 2 == 0) {
					mas2[i2] = mas[i];
					i2++;
				}
			}
			System.out.println("------------------------------");
			System.out.println("Новый массив:");
			System.out.println("------------------------------");
			Method.print(mas2);
		} else {
			System.out.println("В последовательности нет четных чисел");
		}

	}



	public static int getAmount(int[] mas) {
		int amount = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				amount++;
			}
		}
		return amount;
	}

}
