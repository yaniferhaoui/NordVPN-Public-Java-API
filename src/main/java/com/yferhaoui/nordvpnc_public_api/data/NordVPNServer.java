package com.yferhaoui.nordvpnc_public_api.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;

import lombok.ToString;

@ToString
public final class NordVPNServer implements Serializable, Comparable<NordVPNServer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7284509242857833408L;
	
	@Expose(serialize = true, deserialize = true)
	private String id;
	
	@Expose(serialize = true, deserialize = true)
	private String ip_address;
	
	@Expose(serialize = true, deserialize = true)
	private String[] search_keywords;
	
	@Expose(serialize = true, deserialize = true)
	private Categorie[] categories;
	
	@Expose(serialize = true, deserialize = true)
	private String name;
	
	@Expose(serialize = true, deserialize = true)
	private String domain;
	
	@Expose(serialize = true, deserialize = true)
	private String price;
	
	@Expose(serialize = true, deserialize = true)
	private String flag;
	
	@Expose(serialize = true, deserialize = true)
	private String country;
	
	@Expose(serialize = true, deserialize = true)
	private Location location;
	
	@Expose(serialize = true, deserialize = true)
	private String load;

	@Expose(serialize = true, deserialize = true)
	private Features features;
	
	// Getter
	public final String getID() {
		return this.id;
	}
	
	public final String getIp_address() {
		return this.ip_address;
	}
	
	public final String[] getSearch_keywords() {
		return this.search_keywords;
	}
	
	public final Categorie[] getCategories() {
		return this.categories;
	}
	
	public final String getName() {
		return this.name;
	}
	
	public final String getDomain() {
		return this.domain;
	}
	
	public final String getPrice() {
		return this.price;
	}
	
	public final String getFlag() {
		return this.flag;
	}
	
	public final String getCountry() {
		return this.country;
	}
	
	public final Location getLocation() {
		return this.location;
	}
	
	public final String getLoad() {
		return this.load;
	}
	
	public final Features getFeatures() {
		return this.features;
	}
	
	@Override
	public final int compareTo(final NordVPNServer arg0) {
		return this.domain.compareTo(arg0.domain);
	}

}
