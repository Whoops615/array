package by.pth.home02.main5;

/*
 * 16. Даны действительные числа a1,a2,...,an . Найти max(a1 + a2n,a2 + a2n−1,...,an + an+1) .
 */

public class Task16 {

	public static void main(String[] args) {

		int[] mas = new int[10];
		Method.randMas(mas);
		Method.print(mas);
		System.out.println("\n---------------------------");

		int[] mas2 = new int[5];
		int z = mas.length - 1;

		for (int i = 0; i < mas2.length; i++) {
			mas2[i] = mas[i] + mas[z - i];
		}
		Method.print(mas2);
		System.out.println("\n---------------------------");
		int max;
		max = Method.max(mas2);
		System.out.println("Результат:" + mas2[max]);

	}

}
