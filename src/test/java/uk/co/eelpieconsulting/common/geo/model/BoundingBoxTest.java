package uk.co.eelpieconsulting.common.geo.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoundingBoxTest {

	@Test
	public void canDetermineDimensions() throws Exception {
		assertEquals(2, new BoundingBox(new LatLong(2, 0), new LatLong(0, 2)).getWidth(), 0);
		assertEquals(2, new BoundingBox(new LatLong(2, -1), new LatLong(0, 1)).getWidth(), 0);
		assertEquals(2, new BoundingBox(new LatLong(2, -3), new LatLong(0, -1)).getWidth(), 0);
		assertEquals(2, new BoundingBox(new LatLong(2, -3), new LatLong(0, -1)).getHeight(), 0);		
	}
	
	@Test
	public void canDetermineCenter() throws Exception {		
		assertEquals(new LatLong(1, 0.25), new BoundingBox(new LatLong(3, -1), new LatLong(-1, 1.5)).getCenter());
		assertEquals(new LatLong(1, 1), new BoundingBox(new LatLong(2, 0), new LatLong(0, 2)).getCenter());
	}
	
}
