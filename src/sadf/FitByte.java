package Part5;

public class FitByte {
	private static int age; 
	private static int restingHeartRate; 
	private static double maximumHeartRate;
	
	// constructor
	public FitByte(int age, int restingHeartRate) {
		this.age = age;
		this.age = restingHeartRate;
		this.maximumHeartRate = 206.3 - (0.711 * age);
	}
	public double targetHeartRate(double percentageOfMaximum) {
		double buf = (maximumHeartRate - restingHeartRate) * percentageOfMaximum + restingHeartRate;
		return buf;
	}
}
