package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import particles.Mote;
import code.Kepler;

public class Orbit {

	@Test
	public void keplersFirst() {
		double theta =0;
		

		assertEquals((Kepler.one(theta)),1.47201263E8,1e6);
	}
	@Test
	public void keplersFirstMote(){
		double theta = 180;
		assertEquals((Kepler.one(theta)),152098232,1e6);
		Mote mote = new Mote();
		//mote.setMass(mass);
		//mote.setX(x);
		//mote.setY(y);
		mote.setZ(0);
	}
	@Test
	public void keplersThird(){
		//P^2/a^3
		//"The square of the orbital period of a planet is directly proportional to the cube of the semi-major axis of its orbit."
		
		
	}

}
