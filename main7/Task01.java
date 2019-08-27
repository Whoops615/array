package by.pth.home02.main7;

/*
 * 1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и
вывести на экран.
 */

public class Task01 {

	public static void main(String[] args) {
		
		int[][] mas = new int[3][4];
		boolean a = true;
		
		for(int i = 0; i<mas.length;i++) {
			for(int j = 0; j<mas[i].length;j++) {
				if(a == true) {
					mas[i][j] = 1;
					a = false;
				}
				else {
					mas[i][j] = 0;
				}	
			}
			a = true;
		}
		
		Method.print1(mas);

	}

}
