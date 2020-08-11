package robo;

public class BetaRobot extends AlphaRobot{

	protected byte charge = 0;
	private boolean even = false;
	
	public BetaRobot() {}
	
	public BetaRobot(String name, String model){
		super(name, model);
	}

	public byte getCharge() {
		return charge;
	}

	public void setCharge(byte charge) {
		if(charge >= 0 && charge <= 100)
			this.charge = charge;
	}
	
	public boolean moveRight() {
		int prevX = getX();
		setX(prevX + 1);
		int newX = getX();
			if( prevX < newX && charge > 5 && isEven()) {
				setCharge((byte)(getCharge() - 1));
				setEven(false);
				return true;
			} else {
				setEven(true);
				return false;
			}
	}
	
	public boolean moveLeft() {
		int prevX = getX();
		setX(prevX - 1);
		int newX = getX();
			if( prevX > newX && charge > 5 && isEven()) {
				setCharge((byte)(getCharge() - 1));
				setEven(false);
				return true;
			} else
				setEven(true);
				return false;
	}
	
	public boolean moveDown() {
		int prevY = getY();
		setY(prevY + 1);
		int newY = getY();
			if( prevY > newY && charge > 5 && isEven()) {
				setCharge((byte)(getCharge() - 1));
				setEven(false);
				return true;
			} else
				setEven(true);
				return false;
	}
	
	public boolean moveUp() {
		int prevY = getY();
		setY(prevY - 1);
		int newY = getY();
			if( prevY < newY && charge > 5 && isEven()) {
				setCharge((byte)(getCharge() - 1));
				setEven(false);
				return true;				
			} else
				setEven(true);
				return false;	
	}

	public boolean isEven() {
		return even;
	}

	public void setEven(boolean even) {
		this.even = even;
	}
	
}
