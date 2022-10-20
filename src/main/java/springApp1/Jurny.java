package springApp1;

public class Jurny {
	
	private Vehicle v;
	private int passanger;

	public Jurny(Vehicle v, int passanger) {
		super();
		this.v = v;
		this.passanger = passanger;
	}

	public void setPassanger(int passanger) {
		this.passanger = passanger;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}

	public Jurny(Vehicle v) {
		super();
		this.v = v;
	}
	
	

}
