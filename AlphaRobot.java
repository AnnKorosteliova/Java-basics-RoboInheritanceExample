package robo;

public class AlphaRobot extends AbstractRobot{

	private String name;
	private String model;
	private int x = 0;
	private int y = 0;
	
	public AlphaRobot(){}
	
	public AlphaRobot(String name, String model) {
		setName(name);
		setModel(model);
	}
	
	public void setName(String name) {
		if(name != null)
			this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setModel(String model) {
		if(model != null)
			this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setX(int x) {
		if( x >= 0 && x <= 100)
			this.x = x;
		else 
			System.out.println("Error!");
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		if( y >= 0 && y <= 100)
			this.y = y;
		else 
			System.out.println("Error!");
	}
	
	public int getY() {
		return y;
	}
	
	public boolean moveRight() {
		int prevX = getX();
		setX(prevX + 1);
		int newX = getX();
			if( prevX < newX)
			return true;
		else
			return false;
	}
	
	public boolean moveLeft() {
		int prevX = getX();
		setX(prevX - 1);
		int newX = getX();
			if( prevX > newX)
			return true;
		else
			return false;
	}
	
	public boolean moveDown() {
		int prevY = getY();
		setY(prevY + 1);
		int newY = getY();
			if( prevY > newY)
			return true;
		else
			return false;
	}
	
	public boolean moveUp() {
		int prevY = getY();
		setY(prevY - 1);
		int newY = getY();
			if( prevY < newY)
			return true;
		else
			return false;	
	}
}
