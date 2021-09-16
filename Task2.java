public class Task2 {

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 5, 4, 4 }, { 4, 3, 4 }, { 3, 2, 4 }, { 2, 2, 2 }, { 3, 3, 4 }, { 1, 4, 4 },
				{ 4, 1, 1 }, };

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
// When it reaches the last element, due to the right part also being out of bound in the down side it does not inspect any other element to the count variable but only the last element
				if (i == arr.length - 1 && j == arr[i].length - 1) {
					count++;
				} 
				
// When it reaches to the end of the column, it only inspects the right part because if it starts inspecting one step down it will be out of bound
				else if (i == arr.length - 1) {
					if (arr[i][j] != arr[i][j + 1]) {
						count++;
					}
				} 
				
// When it reaches to the end of the row, it inspects one step down, because if it starts inspecting the right part it will be out of bound
				else if (j == arr[i].length - 1) {
					if (arr[i][j] != arr[i + 1][j]) {
						count++;
					}
				} 

// This is the main part of the program, here it inspects the right side and down side of an element, if they are not equal then count variable increases
				else if (arr[i][j] != arr[i][j + 1] && arr[i][j] != arr[i + 1][j]) { 
					count++;
				}
			}
		}

		System.out.println(count);

	}

}

