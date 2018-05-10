
public class Insertion {
	public static void insert(int a[]) {
		for(int i=0;i<a.length;i++) {
			int temp=a[i],j=0;
			for(j=i;j>0 && temp<a[j-1];j--) {
				a[j]=a[j-1];
			}
			a[j]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void select(int a[]) {
		for(int i=0;i<a.length;i++) {
			int index=i,temp=0;
			for(int j=i;j<a.length;j++) {
				if(a[j]<a[index]) {
					index=j;
				}
			}
			temp=a[index];
			a[i]=a[index];
			a[index]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void bubble(int a[]) {
		for(int i=0;i<a.length;i++) {
			int temp=0;
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64};
		insert(a);
		System.out.println();
		select(a);
		System.out.println();
		bubble(a);
	}

}
