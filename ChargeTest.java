package tests;

//import robo.AbstractRobot;
import robo.BetaRobot;

public class ChargeTest {

	public static int runCase(BetaRobot robot){
        int percentage = 0;    
        
        // charge cannot be outside 0..100
        robot.setCharge((byte)-100);
        if( robot.getCharge() < 0 ) {
            System.err.println("Y coord test failed\nREASON: Values less than 0 not allowed!");
            return percentage;
        }
        percentage+=33;
        
        // charge cannot be outside 0..100
        robot.setCharge((byte)1000);
        if( robot.getCharge() < 0 ) {
            System.err.println("Y coord test failed\nREASON: Values more than 100 not allowed!");
            return percentage;
        }
        percentage+=33;
        
        robot.setCharge((byte)50);
        for(int i = 0; i <= 100; i++ ) {
        	robot.moveRight();
        }
        System.out.println("Charge: " + robot.getCharge());
        percentage += 33;
               
        return percentage;
    }
}
