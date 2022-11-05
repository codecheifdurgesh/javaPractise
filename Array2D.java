import java.util.Scanner;

public class Array2D {
	public static int[][] takeInput() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
		return arr;
	}

	public static void print2D(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static void rowWiseSum(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			int sum = 0;
			for (int j = 0; j < mat[i].length; j++) {
				sum = sum + mat[i][j];
			}
			System.out.print(sum + " ");
		}
	}

	public static void findLargest(int input[][]) {
		int maxRowSum = 0;
		int maxColSum = 0;
		for (int i = 0; i < input.length; i++) {
			int sum = 0;
			for (int j = 0; j < input[i].length; j++) {
				sum = sum + input[i][j];
			}
			if (sum > maxRowSum) {
				maxRowSum = sum;
			}
		}
		for (int j = 0; j < input[0].length; j++) {
			int sum = 0;
			for (int i = 0; i < input.length; i++) {
				sum = sum + input[i][j];
			}
			if (sum > maxColSum) {
				maxColSum = sum;
			}
		}
		if (maxColSum > maxRowSum) {
			System.out.println(maxColSum);
		} else {
			System.out.println(maxRowSum);
		}

	}

	public static void totalSum(int[][] mat) {
		int i = 0;
		int j = 0;
		int sum = 0;
		do {
			if (i == 0 && j == 0) {
				while (j <= mat.length - 1) {
					sum = sum + mat[i][j];
					j++;
				}
				j--;
				while (i <= mat.length - 1) {
					sum = sum + mat[i][j];
					i++;
				}
				i--;
			} else {
				if (i == mat.length - 1 && j == mat.length - 1) {
					while (j >= 0) {
						sum = sum + mat[i][j];
						j--;
					}
					j++;
					while (i >= 0) {
						sum = sum + mat[i][j];
						i--;
					}
					i++;
				}
			}
		} while (!(i != 0 && j != 0));
		sum = sum - mat[0][0];
		i = 0;
		j = 0;
		while (i <= mat.length - 1 && j < mat.length - 1) {
			sum = sum + mat[i][j];
			i++;
			j++;
		}
		sum = sum - (mat[0][0] + mat[mat.length - 1][mat.length - 1]);
		i = mat.length - 1;
		j = 0;
		while (j <= mat.length - 1 && i >= 0) {
			if (i == j) {
				i++;
				j++;
			}
			sum = sum + mat[i][j];
			i--;
			j++;

		}
		sum = sum - (mat[mat.length - 1][0] + mat[0][mat.length - 1]);

		System.out.println(sum);

	}

	public static void wavePrint(int mat[][]) {
		int n = mat.length;
		int m = mat[0].length;
		int count = n * m;
		String flag = "down";
		int k = 0;
		int i = 0;
		int j = 0;
		while (k < count) {
			if (flag == "down") {
				while (flag == "down") {
					if (i == n) {
						flag = "top";
						j++;
						i--;

					} else {
						System.out.print(mat[i][j]);
						i++;
						k++;
					}
				}
			} else {
				while (flag == "top") {
					if (i == -1) {
						flag = "down";
						j++;
						i++;
					} else {
						System.out.print(mat[i][j]);
						i--;
						k++;
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		takeInput();

	}

}
