import java.util.Arrays;

public class heap {
	public static void buildMax(int a[],int last) {
		for(int i=(last-1)/2;i>=0;i--) {
			int k=i;
			while((k+1)*2<=last) {
				int bigger=(k+1)*2;
				if(bigger<last) {	
					if(a[bigger]<a[bigger+1]) {
						bigger++;
					}
				}
				if(a[k]<a[bigger]) {
					swap(a,k,bigger);
					k=bigger;
				}
				else {
					break;
				}
			}
		}
	}
	public static void swap(int a[],int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64};
		for(int i=0;i<a.length;i++) {
			buildMax(a,a.length-1-i);
			swap(a,0,a.length-1-i);
			System.out.println(Arrays.toString(a));
		}
	}

}
