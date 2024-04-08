package exercism;

class NeedForSpeed {
	private int speed;
	private int batteryDrain;
	private int mileage = 0;
	private int battery = 100;

	NeedForSpeed(int speed, int batteryDrain) {
		this.speed = speed;
		this.batteryDrain = batteryDrain;
	}

	public boolean batteryDrained() {
		return battery <= 0;
	}

	public int distanceDriven() {
		return mileage;
	}

	public void drive() {
		if (battery > 0) {
			mileage += speed;
			battery -= batteryDrain;
		}
	}

	public static NeedForSpeed nitro() {
		return new NeedForSpeed(50, 4);
	}
}

class RaceTrack {
	private int distance;

	RaceTrack(int distance) {
		this.distance = distance;
	}

	public boolean tryFinishTrack(NeedForSpeed car) {
		while (car.distanceDriven() < distance && !car.batteryDrained()) {
			car.drive();
		}
		return car.distanceDriven() >= distance;
	}
}
