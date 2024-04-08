package exercism;

public class ElonsToyCar {

	private int distance;
	private int batteryPercentage;

	public ElonsToyCar() {
		distance = 0;
		batteryPercentage = 100;
	}

	public static ElonsToyCar buy() {
		return new ElonsToyCar();
	}

	public String distanceDisplay() {
		return "Driven " + distance + " meters";
	}

	public String batteryDisplay() {
		if (batteryPercentage <= 0) {
			return "Battery empty";
		}
		return "Battery at " + batteryPercentage + "%";
	}

	public void drive() {
		if (batteryPercentage > 0) {
			distance += 20;
			batteryPercentage -= 1;
		}
	}

}
