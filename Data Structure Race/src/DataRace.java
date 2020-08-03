import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.*;

public class DataRace extends JPanel implements ActionListener, MouseListener {
	
	JFrame frame;
	JMenuBar menuBar;
	JMenu menuOne;
	JMenu menuTwo;
	private static final int windowWidth = 1400;
	private static final int windowHeight = 600;
	private static final int barWidth = 8;
	private static final int bars = windowWidth/barWidth;
	private static int[] array;
	
	public DataRace(){
		//Create an array that stores the size of a bar
		array = new int[bars]; 
		for(int i=0;i<bars;i++) {
			array[i] = i;
		}
		//Randomly shuffling the array so that it can be sorted
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			int randomIndexToSwap = rand.nextInt(array.length);
			int temp = array[randomIndexToSwap];
			array[randomIndexToSwap] = array[i];
			array[i] = temp;
		}
		//Creating the initial GUI
		frame = new JFrame("Sorting Algorithim Race");
		frame.add(this);
		frame.setSize(1400,600);
		frame.setBackground(Color.BLACK);
		
		menuBar = new JMenuBar();
		menuOne = new JMenu("Algorithim 1");
		menuTwo = new JMenu("Algorithim 2");
		menuBar.add(menuOne);
		menuBar.add(menuTwo);
		frame.add(menuBar,BorderLayout.NORTH);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public void paintComponent(Graphics g) {
		Graphics2D graphics = (Graphics2D) g;
		super.paintComponent(graphics);
		
		graphics.setColor(Color.BLACK);

		for(int i=0;i<bars;i++) {
			int height = array[i] *3;
			int xInitial = i+(barWidth-1)*i;
			int yInitial = windowHeight - height;
		
			graphics.fillRect(xInitial, yInitial, barWidth, height);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataRace sort = new DataRace();
		//mergeSort.sort(array,array.length);
		//bubbleSort.sort(array);
		//selectionSort.sort(array);
		//insertionSort.sort(array);
		//quickSort.sort(array,0,array.length-1);
	}





	
	

}
