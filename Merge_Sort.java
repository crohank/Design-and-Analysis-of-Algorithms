
public class Merge_Sort {
	public static void print(int p[]) {
		for(int i=0;i<p.length;i++) {
			System.out.print(p[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int [] a = {80, 50, 30, 10, 90, 60, 0, 70, 40, 20, 5};
		System.out.print("Given array: ");
		print(a);
		a=mergesort(a);
		System.out.print("Sorted array: ");
		print(a);
	}
	public static int[] mergesort(int a[]) {
		int n=a.length;
		if(n<=1) {
			return a;
		}
		int mid = n/2;
		int left[] = new int[mid];
		int right[];
		if(n%2 == 0) {
			right = new int [mid];
		}
		else {
			right = new int[mid+1];
		}
		for (int i=0;i<mid;i++) {
			left[i]=a[i];
		}
		for(int i=0;i<right.length;i++) {
			right[i]=a[i+mid];
		}
		left = mergesort(left);
		right = mergesort(right);
		int result[] = new int[n];
		result = merge(left,right);
		return result;
	}
	public static int[] merge(int left[],int right[]) {
		int ll = left.length;
		int rl = right.length;
		int [] result = new int[ll+rl];
		int lp=0,rp=0,mp=0;
		while(lp < ll || rp<rl) {
			if(lp < ll && rp < rl) {
				if(left[lp]<right[rp]) {
					result[mp++]=left[lp++];
				}
				else {
					result[mp++]=right[rp++];
				}
			}
			else if(lp < ll) {
				result[mp++]=left[lp++];
			}
			else if(rp < rl) {
				result[mp++]=right[rp++];
			}
		}
		return result;
	}
}
