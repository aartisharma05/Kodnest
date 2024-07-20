package algorithms;
public class SelectionSort {
	public static int[] selectionSort(int []arr) {	
		for(int i = 0;i<=arr.length-2;i++) {
			
			int pos = i;
			int min = arr[pos];
			
			for(int j=i+1; j<= arr.length-1;j++ ) {
				if (arr[j]< arr[pos]) {
					pos = j;
					min = arr[j];			
				}
			}	
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}	
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {40,50,10,20,30};
		
		int result[]  = selectionSort(arr);
		
		for(int x: result) {
			System.out.println(x);
		}
		
	}

}
