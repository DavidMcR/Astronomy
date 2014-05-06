package code;

public class Kepler {

	public static double one(double theta) {
		// TODO Auto-generated method stub
		double r;
		double p=149556483.41;//this is the semi-latus rectum obtained by 
		double semiMajorAxis = 149598261;
		//semi major axis*(1-eccentricity^2)
		double epsilon=0.0167;
		r=(semiMajorAxis)*(1-Math.pow(epsilon,2))/(1+(epsilon*Math.cos(Math.toRadians(theta))));
		//a(1-e^2)
		System.out.println(r);
		return r;
		
	}

}
