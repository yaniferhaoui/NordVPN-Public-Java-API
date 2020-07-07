package com.yferhaoui.nordvpnc_public_api.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;

import lombok.ToString;

@ToString
public final class Country implements Serializable, Comparable<Country> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2546688863896437088L;

	@Expose(serialize = true, deserialize = true)
	private String id;
	
	@Expose(serialize = true, deserialize = true)
	private String name;
	
	@Expose(serialize = true, deserialize = true)
	private String code;
	
	@Expose(serialize = true, deserialize = true)
	private City[] cities;
	
	// Getter
	public final String getID() {
		return this.id;
	}
	
	public final String getName() {
		return this.name;
	}
	
	public final String getCode() {
		return this.code;
	}
	
	public final City[] getCities() {
		return this.cities;
	}
	
	@Override
	public final int compareTo(final Country arg0) {
		return this.id.compareTo(arg0.id);
	}

}
