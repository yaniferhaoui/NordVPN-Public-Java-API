package com.yferhaoui.nordvpnc_public_api.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.ToString;

@ToString
public final class Location implements Serializable, Comparable<Location> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9035130951544665094L;
	
	@SerializedName("lat") 
	@Expose(serialize = true, deserialize = true)
	private String latitude;
	
	@SerializedName("long") 
	@Expose(serialize = true, deserialize = true)
	private String longitude;
	
	// Getter
	public final String getLatitude() {
		return this.latitude;
	}
	
	public final String getLongitude() {
		return this.longitude;
	}

	@Override
	public final int compareTo(final Location arg0) {
		final String res = this.latitude + this.longitude;
		return res.compareTo(arg0.latitude + arg0.longitude);
	}

}
