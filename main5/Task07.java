package by.pth.home02.main5;


/*
 * 7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
Подсчитать количество замен.
 */

public class Task07 {

	public static void main(String[] args) {

		int[] mas = new int[10];
		int z = 25;

		Method.randMas(mas);
		Method.print(mas);
		System.out.println("\n------------------------------");
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > z) {
				mas[i] = z;
				count++;
			}
		}

		Method.print(mas);
		System.out.println("\n------------------------------");
		System.out.println("Количесво замен: " + count);

	}

}
