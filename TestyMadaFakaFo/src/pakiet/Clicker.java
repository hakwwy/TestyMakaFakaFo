package pakiet;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;


public class Clicker extends Robot {

	//ArrayList<int[][]> list = new ArrayList<int[][]>();
	
	public Clicker() throws AWTException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void klick(int x, int y)
	{	
		mouseMove(x, y);
		mousePress(InputEvent.BUTTON1_MASK);
	}
	

}
