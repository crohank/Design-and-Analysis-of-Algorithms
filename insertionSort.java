//Insertion sort
//Time Complexity: O(N^2) 
public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{9,18,3,2,10};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static void sort(int arr[]) {
		int n = arr.length;
		for(int i=1;i<n;i++) {
			int j = i-1;
			int t = arr[i];
			while(j>=0 && arr[j]>t) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=t;
	}
}
}
