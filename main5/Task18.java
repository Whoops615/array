package by.pth.home02.main5;

import java.util.Random;

public class Task18 {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] mas = new int[10];

		int index1;
		int index2;
		int a1;
		int a2;

		do {
			index1 = rand.nextInt(10);
			index2 = rand.nextInt(10);
			a1 = rand.nextInt(6) + 1;
			a2 = rand.nextInt(6) + 1;

		} while (index1 == index2 | (Math.abs(index1 - index2) < 3 & (a1 + a2 > 9 | a1 + a2 < 4)));

		mas[index1] = a1;
		mas[index2] = a2;

		System.out.println(index1 + " " + a1);
		System.out.println(index2 + " " + a2);

		while (prov(mas) == false) {
			for (int i = 0; i < mas.length; i++) {
				mas[i] = rand.nextInt(6) + 1;
			}
			mas[index1] = a1;
			mas[index2] = a2;
		}

		if (prov(mas) == true) {
			for (int i = 0; i < mas.length; i++) {
				System.out.print(mas[i] + " ");
			}
		}

	}

	public static boolean prov(int[] mas) {
		boolean b = false;
		for (int i = 0; i < mas.length - 2; i++) {
			b = sum3(mas[i], mas[i + 1], mas[i + 2]);
			if (b == true) {
			} else {
				break;
			}
		}
		return b;
	}

	public static boolean sum3(int x, int y, int z) {
		int sum = x + y + z;
		if (sum == 10) {
			return true;
		} else {
			return false;
		}
	}

}
