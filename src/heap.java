import java.util.Arrays;

public class heap {
	public static void buildMax(int arr[],int last) {
		 for(int i = (last - 1) / 2; i >= 0; i--){              // parent是（index - 1）/ 2, 左右孩子分别是2 * index + 1, 2 * index + 2
		    int parent = i;
		    if(parent * 2 + 1 > last) continue; // 不存在孩子就结束
		    int bigger = parent * 2 + 1;
		    if(bigger < last){  //若右孩子比左孩子大，取两个孩子大的那一个
			if(arr[bigger] < arr[bigger + 1]){
			    bigger++;
			}
		    }
		    if(arr[parent] < arr[bigger]){
			swap(arr, parent, bigger);
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
