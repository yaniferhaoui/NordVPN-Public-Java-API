package com.yferhaoui.nordvpnc_public_api.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;

import lombok.ToString;

@ToString
public final class City implements Serializable, Comparable<City> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9102542638604216444L;
	
	@Expose(serialize = true, deserialize = true)
	private String id;
	
	@Expose(serialize = true, deserialize = true)
	private String name;
	
	@Expose(serialize = true, deserialize = true)
	private String latitude;
	
	@Expose(serialize = true, deserialize = true)
	private String longitude;
	
	@Expose(serialize = true, deserialize = true)
	private String dns_name;
	
	@Expose(serialize = true, deserialize = true)
	private String hub_score;
	
	// Getter
	public final String getID() {
		return this.id;
	}
	
	public final String getName() {
		return this.name;
	}
	
	public final String getLatitude() {
		return this.latitude;
	}
	
	public final String getLongitude() {
		return this.longitude;
	}
	
	public final String getHub_score() {
		return this.hub_score;
	}

	@Override
	public final int compareTo(final City arg0) {
		return this.id.compareTo(arg0.id);
	}

}
