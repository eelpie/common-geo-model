package uk.co.eelpieconsulting.common.geo.model;

import java.util.Objects;

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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		BoundingBox that = (BoundingBox) o;
		return Objects.equals(topLeft, that.topLeft) && Objects.equals(bottomRight, that.bottomRight);
	}

	@Override
	public int hashCode() {
		return Objects.hash(topLeft, bottomRight);
	}
}