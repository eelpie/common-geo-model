package uk.co.eelpieconsulting.common.geo.model;

import java.io.Serializable;
import java.util.Objects;

public class Place implements Serializable {
    
	private static final long serialVersionUID = 1L;
	
    private String address;
    private LatLong latLong;
    private OsmId osmId;
    
	public Place() {
	}
    
	public Place(String address, LatLong latLong, OsmId osmId) {
		this.address = address;
		this.latLong = latLong;
		this.osmId = osmId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public LatLong getLatLong() {
		return latLong;
	}
	public void setLatLong(LatLong latLong) {
		this.latLong = latLong;
	}
	
	public OsmId getOsmId() {
		return osmId;
	}
	public void setOsmId(OsmId osmId) {
		this.osmId = osmId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "Place [address=" + address + ", latLong=" + latLong + ", osmId=" + osmId + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Place place = (Place) o;
		return Objects.equals(address, place.address) && Objects.equals(latLong, place.latLong) && Objects.equals(osmId, place.osmId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, latLong, osmId);
	}
}
