package by.pth.home02.main5;


/*
 * 9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */

public class Task09 {

	public static void main(String[] args) {

		int[] mas = new int[10];
		Method.randMas(mas);
		Method.print(mas);
		System.out.println("\n------------------------------");
		int indexmin = Method.min(mas);
		System.out.println("Наименьший элемент в ячейке: " + indexmin);
		int indexmax = Method.max(mas);
		System.out.println("Наибольший элемент в ячейке: " + indexmax);
		System.out.println("------------------------------");
		System.out.println("Новый массив:");

		int a = mas[indexmin];
		mas[indexmin] = mas[indexmax];
		mas[indexmax] = a;
		Method.print(mas);

	}

}
