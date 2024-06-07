
public class QuickSort {
    
	private int arr[];
	private QuickSortVisualizer visualizer;
	
	public QuickSort(int arr[], QuickSortVisualizer visualizer)
	{
	this.arr = arr;
	this.visualizer = visualizer;
    }
	
	public void quickSorting(int arr[], int low, int high)
	{
		if(low<high)
		{
			int pidx = partition(arr, low, high);
			visualizer.update(arr);
			quickSorting(arr, low, pidx-1);
			quickSorting(arr,pidx+1, high);

		}
	}
	
	public  int partition(int arr[], int low, int high)
	{
		int pivot = arr[high];
		int i = low-1;
		
		for(int j = low; j<high; j++)
		{ 
			if(arr[j] < pivot)
			{
				i++;
				swap(arr, i, j);
				visualizer.update(arr);
			}
		}
		
		i++;
		swap(arr, i, high);
		visualizer.update(arr);
		return i;
	}
	
	
private void swap(int arr[],int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
}
