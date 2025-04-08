package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	
	//2. create an array of 5 robots.
Robot[] broBots = new Robot [5];

	//3. use a for loop to initialize the robots.
for(int i = 0; i<5; i++) {
	broBots[i] = new Robot();
	broBots[i].setSpeed(20);
	broBots[i].miniaturize();
}

		//4. make each robot start at the bottom of the screen, side by side, facing up
broBots[0].setX(450);
broBots[0].setY(530);
broBots[1].setX(450);
broBots[1].setY(530);
broBots[2].setX(450);
broBots[2].setY(530);
broBots[3].setX(450);
broBots[3].setY(530);
broBots[4].setX(450);	
broBots[4].setY(530);
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random random = new Random();
boolean winner = false;

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.


	//7. declare that robot the winner and throw it a party!
		
	//8. try different races with different amounts of robots.
	//9. make the robots race around a circular track.
while(!winner) {
for(int a = 0; a<5; a++) {
	broBots[a].move(random.nextInt(50));
	if(broBots[a].getY()<50) {
		broBots[a].setY(51);
		broBots[a].turn(-90);
	}
	if(broBots[a].getX()<50) {
		broBots[a].setX(51);
		broBots[a].turn(-90);
		
		if(broBots[a].getX()<760)
		System.out.println("Robot number "+a+" is the winner of the 2025 Formula One Grand Prix!");
		winner = true;
		break;
		
					}
		}
}
		}
	}