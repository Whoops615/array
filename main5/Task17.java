package by.pth.home02.main5;

public class Task17 {

	public static void main(String[] args) {

		int[] mas = new int[10];
		Method.randMas(mas);
		Method.print(mas);
		System.out.println("\n---------------------------");

		int min;
		min = Method.min(mas);
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == mas[min]) {
				count++;
			}
		}

		int n = mas.length - count;
		int[] mas2 = new int[n];
		int j = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] != mas[min]) {
				mas2[j] = mas[i];
				j++;
			}
		}
		Method.print(mas2);

	}

}
