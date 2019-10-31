package dicePkg;
import objectdraw.*;
import java.awt.*;
public class Dice{
	
	//instance variables
	private static final int DICE_WIDTH = 50;
	private static final int DICE_HEIGHT = 50;
	private static final int SPOT_WIDTH = 10;
	private static final int SPOT_HEIGHT = 10;
	private FramedRect dieBody;
	private FilledOval spot1, spot2, spot3, spot4, spot5, spot6;
	
	//constructor
	public Dice(double x, double y, int roll, DrawingCanvas canvas) {
		
		dieBody = new FramedRect(x, y, DICE_WIDTH, DICE_HEIGHT, canvas);
		
		if(roll == 1) {
			spot1 = new FilledOval(DICE_WIDTH/2-5, DICE_HEIGHT/2-5, SPOT_WIDTH, SPOT_HEIGHT, canvas);
		}else if(roll == 2) {
			spot1 = new FilledOval(55, 130, SPOT_WIDTH, SPOT_HEIGHT, canvas);
			spot2 = new FilledOval(85, 110, SPOT_WIDTH, SPOT_HEIGHT, canvas);
		}else if(roll == 3) {
			spot1 = new FilledOval(55, 130, SPOT_WIDTH, SPOT_HEIGHT, canvas);
			spot2 = new FilledOval(70, 120, SPOT_WIDTH, SPOT_HEIGHT, canvas);
			spot3 = new FilledOval(85, 110, SPOT_WIDTH, SPOT_HEIGHT, canvas);
		}else if(roll == 4) {
			spot1 = new FilledOval(55, 110, SPOT_WIDTH, SPOT_HEIGHT, canvas);
			spot2 = new FilledOval(55, 130, SPOT_WIDTH, SPOT_HEIGHT, canvas);
			spot3 = new FilledOval(85, 110, SPOT_WIDTH, SPOT_HEIGHT, canvas);
			spot4 = new FilledOval(85, 130, SPOT_WIDTH, SPOT_HEIGHT, canvas);
		}else if(roll == 5) {
			spot1 = new FilledOval(55, 110, SPOT_WIDTH, SPOT_HEIGHT, canvas);
			spot2 = new FilledOval(55, 130, SPOT_WIDTH, SPOT_HEIGHT, canvas);
			spot3 = new FilledOval(85, 110, SPOT_WIDTH, SPOT_HEIGHT, canvas);
			spot4 = new FilledOval(85, 130, SPOT_WIDTH, SPOT_HEIGHT, canvas);
			spot5 = new FilledOval(70, 120, SPOT_WIDTH, SPOT_HEIGHT, canvas);
		}else {
			spot1 = new FilledOval(60, 105, SPOT_WIDTH, SPOT_HEIGHT, canvas);
			spot2 = new FilledOval(60, 120, SPOT_WIDTH, SPOT_HEIGHT, canvas);
			spot3 = new FilledOval(60, 135, SPOT_WIDTH, SPOT_HEIGHT, canvas);
			spot4 = new FilledOval(80, 105, SPOT_WIDTH, SPOT_HEIGHT, canvas);
			spot5 = new FilledOval(80, 120, SPOT_WIDTH, SPOT_HEIGHT, canvas);
			spot6 = new FilledOval(80, 135, SPOT_WIDTH, SPOT_HEIGHT, canvas);
		}
	}
}
