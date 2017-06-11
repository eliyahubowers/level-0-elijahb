package level0;
import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;
public class Robothouse {
	public static void main(String[] args) {
		
	
Robot Maker = new Robot();
Maker.penDown();
Maker.setWindowColor(Color.black);
Maker.moveTo(10, 600);
Maker.setSpeed(1000000000);
for (int i = 0; i < 10; i++) {
Maker.setPenColor(Color.blue);
Maker.move(100);
Maker.turn(90);
Maker.move(50);
Maker.turn(90);
Maker.move(100);
Maker.turn(-90);
Maker.setPenColor(Color.green);
Maker.move(30);
Maker.turn(-90);
}
}
}