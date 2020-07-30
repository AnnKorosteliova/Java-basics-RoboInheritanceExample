package main;

import robo.AlphaRobot;
import tests.SimpleTest;

public class Application {

	public static void main(String[] args) {

		System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new AlphaRobot("Robik","alpha") ) );
		
	}

}
