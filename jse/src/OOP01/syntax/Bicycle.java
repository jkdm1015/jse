package OOP01.syntax;

public class Bicycle {
	
	private int cadence, gear, speed, id;
	private static int numberofbicycles = 0;

	public Bicycle() {}
	
	public Bicycle(int startCadence, int startGear, int startSpeed) {
		super();
		this.cadence = startCadence;
		this.gear = startGear;		
		this.speed = startSpeed;
		this.id = ++numberofbicycles;
	}
	
	public int getCadence() {
		return cadence;
	}
	public void setCadence(int newValue) {
		this.cadence = newValue;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int newValue) {
		this.gear = newValue;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void applyBrake(int decrement){
		speed -= decrement;
	}
	public void speedUp(int increment){
		speed += increment;
	}
}
