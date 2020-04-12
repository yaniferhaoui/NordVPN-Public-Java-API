package com.yferhaoui.nordvpnc_public_api.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;

public final class Categorie implements Serializable, Comparable<Categorie> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4555633694056332193L;
	
	@Expose(serialize = true, deserialize = true)
	private String name;
	
	// Getter
	public final String getName() {
		return this.name;
	}

	@Override
	public final int compareTo(final Categorie arg0) {
		return 0;
	}

}
