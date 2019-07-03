
public class Insertion {
	public void insertSort(int arr[]){
		for(int i = 0; i < arr.length; i++){
		    for(int j = i; j > 0 && arr[j] < arr[j - 1]; j--){    //往前，同时判断相邻的，交换，往前插
			swap(arr, j - 1, j);
		    }
		}
	    }
	 public void selectSort(int arr[]){
	       for(int i = 0; i < arr.length; i++){
		   int min = i;
		   for(int j = i; j < arr.length; j++){   //往后找到最小的，换到前面来
		       if(arr[min] > arr[j]){
			   min = j;
		       }
		   }
		   swap(arr, i, min);
	       }
	    }
	 public void bubbleSort(int arr[]){
		for(int i = 0; i < arr.length; i++){      //比较相邻的，往后冒泡
		    for(int j = 0; j < arr.length - 1; j++){
			if(arr[j] > arr[j + 1]){
			    swap(arr, j, j + 1);
			}
		    }
		}
	    }
	public static void swap(int arr[], int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insertion s = new Insertion();
		int[] arr={49,38,65,97,76,13,27,49,78,34,12,64};
		s.selectSort(arr);
	       s.insertSort(arr);
	       s.bubbleSort(arr);
		 for(int i = 0; i < arr.length; i++){
		    System.out.print(arr[i]+" ");
		}
	}

}
