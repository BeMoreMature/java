
public class merge {
	public static void mergeSort(int []a,int start,int end) {
		int mid=start+(end-start)/2;
		if(start<end) {
			mergeSort(a,start,mid);
			mergeSort(a,mid+1,end);
			Merge(a,start,mid,end);
		}
		
	}
	public static void Merge(int a[],int low,int mid,int high) {
		int []temp=new int[high-low+1];
		int i=low;
		int j=mid+1;
		int index=0;
		while(i<=mid && j<=high) {
			if(a[i]<a[j]) {
				temp[index++]=a[i++];
			}
			else {
				temp[index++]=a[j++];
			}
		}
		while(i<=mid) {
			temp[index++]=a[i++];
		}
		while(j<=high) {
			temp[index++]=a[j++];
		}
		for(int k=0;k<temp.length;k++) {
			a[low+k]=temp[k];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64};
		mergeSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
