package uk.co.eelpieconsulting.common.geo.model;

public class BoundingBox {
	
	private final LatLong topLeft, bottomRight;
		
	public BoundingBox(LatLong topLeft, LatLong bottomRight) {
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}

	public LatLong getTopLeft() {
		return topLeft;
	}

	public LatLong getBottomRight() {
		return bottomRight;
	}

	public LatLong getCenter() {
		double latCenter = topLeft.getLatitude() - (getHeight() > 0 ? getHeight() / 2 : 0);		
		double longCenter = topLeft.getLongitude() + (getWidth() > 0 ? getWidth() / 2 : 0);
		return new LatLong(latCenter, longCenter);
	}

	public double getHeight() {
		return topLeft.getLatitude() - bottomRight.getLatitude();
	}
	
	public double getWidth() {
		return bottomRight.getLongitude() - topLeft.getLongitude();
	}

	@Override
	public String toString() {
		return "BoundingBox [bottomRight=" + bottomRight + ", topLeft=" + topLeft + "]";
	}
	
}