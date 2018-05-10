
public class quick {
	public static void quickSort(int a[],int low,int high) {
		if(low<high) {
			int mid=getMiddle(a,low,high);
			quickSort(a,low,mid-1);
			quickSort(a,mid+1,high);
		}
	}
	public static int getMiddle(int a[],int low, int high) {
		int temp=a[low];
		while(low<high) {
			while(low<high && temp<=a[high]) {
				high--;
			}
			a[low]=a[high];
			while(low<high && temp>=a[low]) {	
				low++;
			}
			a[high]=a[low];
			
			
		}
		a[low]=temp;
		return low;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64};
		quickSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
	}
}
