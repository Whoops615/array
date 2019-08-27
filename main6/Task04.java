package by.pth.home02.main6;

/*
 * 4. Сортировка обменами. Дана последовательность чисел
 .Требуется переставить числа в порядке
возрастания. Для этого сравниваются два соседних числа ai и ai+1. Если ai  ai+1, то делается перестановка. Так
продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания. Составить алгоритм
сортировки, подсчитывая при этом количества перестановок.
 */

public class Task04 {

	public static void main(String[] args) {

		int[] mas = new int[10];
		Method.randMas(mas);
		Method.print(mas);

		int count = 0;

		while (check(mas) == false) {

			int temp;

			for (int i = 0; i < mas.length - 1; i++) {
				if (mas[i] > mas[i + 1]) {
					temp = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = temp;
					count++;
				}
			}
		}

		Method.print(mas);
		System.out.println("Количесво перестановок: " + count);

	}

	public static boolean check(int[] mas) {

		boolean check = false;

		for (int i = 0; i < mas.length - 1; i++) {
			if (mas[i] <= mas[i + 1]) {
				check = true;
			} else {
				check = false;
				break;
			}
		}

		return check;
	}

}
