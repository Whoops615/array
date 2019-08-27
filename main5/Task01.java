package by.pth.home02.main5;



/*
 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

public class Task01 {

	public static void main(String[] args) {
		
		int k = 2;
		int sum = 0;
		int[] mas = new int[5];

		Method.randMas(mas);
		Method.print(mas);
		System.out.println("\n---------------------");

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % k == 0) {
				sum += mas[i];
			}
		}
		System.out.println("Сумма кратных K: " + sum);


	}

}
