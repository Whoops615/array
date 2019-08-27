package by.pth.home02.main7;

import java.util.Scanner;

/*
 * 27. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на
соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
 */

public class Task27 {

	public static void main(String[] args) {

		int[][] mas = new int[5][5];
		Method.masRand(mas, 10);
		Method.print1(mas);

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите номера столбцов >>");
		int j1 = sc.nextInt();
		int j2 = sc.nextInt();
		System.out.println("-----------------------");

		int temp1 = 0;
		int temp2 = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j == j1) {
					temp1 = mas[i][j];
				}
				if (j == j2) {
					temp2 = mas[i][j];
				}
			}
			mas[i][j1] = temp2;
			mas[i][j2] = temp1;
		}

		Method.print1(mas);

	}

}
