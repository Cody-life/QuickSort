import java.awt.*;
import javax.swing.*;

public class QuickSortVisualizer extends JPanel{

	private int arr[];
	private final int BAR_WIDTH = 30;
	private final int DELAY = 100;
	
	public QuickSortVisualizer(int arr[])
	{
		this.arr  = arr;
		setPreferredSize(new Dimension(arr.length*BAR_WIDTH , 400));
		
	}
	
	public void update(int arr[])
	{
		this.arr = arr;
		repaint();
		try {
			Thread.sleep(DELAY);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		for(int i = 0; i<arr.length;i++)
		{
			int height = arr[i] * 4;
			g.fillRect(i*BAR_WIDTH, getHeight()- height, BAR_WIDTH, height);
		}
	}

	
	
}
