package dal.gravity;

public class GravityConstant implements GravityModel {

	/** gravitational constant */
	public static final double EARTH_GRAVITY = 9.80665;

	private final double g;

	GravityConstant(double g) {
		this.g = g;
	}

	public double getGravitationalField() {
		return g;
	}
}
