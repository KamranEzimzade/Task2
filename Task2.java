public class Main {

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 5, 4, 4 }, { 4, 3, 4 }, { 3, 2, 4 }, { 2, 2, 2 }, { 3, 3, 4 }, { 1, 4, 4 },
				{ 4, 1, 1 }, };

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				//en son elemente catanda sag da ashagi da out of bounddur deye hec birin yoxlamadan sadece o elementi counta sayir
				if (i == arr.length - 1 && j == arr[i].length - 1) {
					count++;
				} 
				// column-un sonuna catanda ancaq sagi yoxlayir cunki bir ashagini yoxlasa out of bound olacaq
				else if (i == arr.length - 1) {
					if (arr[i][j] != arr[i][j + 1]) {
						count++;
					}
				} 
				//row-nun sonuna catanda bir ashagini yoxlayir, cunki sagi yoxlasa out of bound olacaq
				else if (j == arr[i].length - 1) {
					if (arr[i][j] != arr[i + 1][j]) {
						count++;
					}
				} 
				// esas hisse buradir, elementin sagini ve ashagisini yoxlayir, beraber deyilse count artir
				else if (arr[i][j] != arr[i][j + 1] && arr[i][j] != arr[i + 1][j]) { 
					count++;
				}
			}
		}

		System.out.println(count);

	}

}

