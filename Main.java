import javax.swing.*;

public class Main  {

	public static void main(String[] args) {
		
		 int[] arr = {95,89,78,67,56,45,33,22,12};
		 
		QuickSortVisualizer visualizer = new QuickSortVisualizer(arr);
		
		JFrame frame = new JFrame("Sorting Visualizer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(visualizer);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		QuickSort sort  = new QuickSort(arr, visualizer);
		new Thread(()-> sort.quickSorting(arr, 0, arr.length-1)).start();
		
		
		
		
	}

	

}
