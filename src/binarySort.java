
public class binarySort {
	public static int search(int a[], int target) {
		int start=0;
		int end=a.length-1;
		while(start+1<end) {
			int mid=start+(end-start)/2;
			if(a[mid]<target) {
				start=mid;
			}
			else {
				end=mid;
			}
		}
		if(a[start]==target) return start;
		else return end;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,8,9,10};
		int target=8;
		System.out.println(search(a,target));
	}

}
