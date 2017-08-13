package level0;
import java.awt.Color;
import java.util.Random;
import org.jointheleague.graphical.robot.Robot;
public class Robothouse {
	public static void main(String[] args) {
int height = 100;		
Random randomMaker = new Random(); 	
Robot Maker = new Robot("mini");
Maker.penDown();
Maker.setWindowColor(Color.black);
Maker.moveTo(10, 600);
Maker.setSpeed(10);
for (int i = 0; i < 20; i++) {
height = randomMaker.nextInt(401)+100;	
if(height > 350){
Maker.setRandomPenColor();
Maker.move(height);
Maker.turn(90);
Maker.move(42);
Maker.turn(90);
Maker.move(height);
Maker.turn(-90);
}
else if(height > 150 && height < 350){
Maker.setRandomPenColor();
Maker.move(height);
Maker.turn(45);
Maker.move(30);
Maker.turn(90);
Maker.move(30);
Maker.turn(45);
Maker.move(height);
Maker.turn(-90);
}
else{
	Maker.setRandomPenColor();
	Maker.move(height);
	Maker.turn(30);
	Maker.move(40);
	Maker.turn(120);
	Maker.move(40);
	Maker.turn(30);
	Maker.move(height);
	Maker.turn(-90);	
}

Maker.setPenColor(Color.green);
Maker.move(30);
Maker.turn(-90);
}
}
}