package com.yferhaoui.nordvpnc_public_api.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;

public final class Features implements Serializable, Comparable<Features> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7632731472755045722L;
	
	@Expose(serialize = true, deserialize = true)
	private Boolean ikev2;
	
	@Expose(serialize = true, deserialize = true)
	private Boolean openvpn_udp;
	
	@Expose(serialize = true, deserialize = true)
	private Boolean openvpn_tcp;
	
	@Expose(serialize = true, deserialize = true)
	private Boolean socks;
	
	@Expose(serialize = true, deserialize = true)
	private Boolean proxy;
	
	@Expose(serialize = true, deserialize = true)
	private Boolean pptp;
	
	@Expose(serialize = true, deserialize = true)
	private Boolean l2tp;
	
	@Expose(serialize = true, deserialize = true)
	private Boolean openvpn_xor_udp;
	
	@Expose(serialize = true, deserialize = true)
	private Boolean openvpn_xor_tcp;
	
	@Expose(serialize = true, deserialize = true)
	private Boolean proxy_cybersec;
	
	@Expose(serialize = true, deserialize = true)
	private Boolean proxy_ssl;
	
	@Expose(serialize = true, deserialize = true)
	private Boolean proxy_ssl_cybersec;
	
	@Expose(serialize = true, deserialize = true)
	private Boolean ikev2_v6;
	
	@Expose(serialize = true, deserialize = true)
	private Boolean openvpn_udp_v6;
	
	@Expose(serialize = true, deserialize = true)
	private Boolean openvpn_tcp_v6;
	
	@Expose(serialize = true, deserialize = true)
	private Boolean wireguard_udp;
	
	@Expose(serialize = true, deserialize = true)
	private Boolean openvpn_udp_tls_crypt;
	
	@Expose(serialize = true, deserialize = true)
	private Boolean openvpn_tcp_tls_crypt;
	
	@Expose(serialize = true, deserialize = true)
	private Boolean openvpn_dedicated_udp;
	
	@Expose(serialize = true, deserialize = true)
	private Boolean openvpn_dedicated_tcp;
	
	@Expose(serialize = true, deserialize = true)
	private Boolean v2ray;
	
	// Getter
	public final Boolean isIkev2() {
		return this.ikev2;
	}
	
	public final Boolean isOpenvpn_udp() {
		return this.openvpn_udp;
	}
	
	public final Boolean isOpenvpn_tcp() {
		return this.openvpn_tcp;
	}
	
	public final Boolean isSocks() {
		return this.socks;
	}
	
	public final Boolean isProxy() {
		return this.proxy;
	}
	
	public final Boolean isPptp() {
		return this.pptp;
	}
	
	public final Boolean isL2tp() {
		return this.l2tp;
	}
	
	public final Boolean isOpenvpn_xor_udp() {
		return this.openvpn_xor_udp;
	}
	
	public final Boolean isOpenvpn_xor_tcp() {
		return this.openvpn_xor_tcp;
	}
	
	public final Boolean isProxy_cybersec() {
		return this.proxy_cybersec;
	}
	
	public final Boolean isProxy_ssl() {
		return this.proxy_ssl;
	}
	
	public final Boolean isProxy_ssl_cybersec() {
		return this.proxy_ssl_cybersec;
	}
	
	public final Boolean isIkev2_v6() {
		return this.ikev2_v6;
	}
	
	public final Boolean isOpenvpn_udp_v6() {
		return this.openvpn_udp_v6;
	}
	
	public final Boolean isOpenvpn_tcp_v6() {
		return this.openvpn_tcp_v6;
	}
	
	public final Boolean isWireguard_udp() {
		return this.wireguard_udp;
	}
	
	public final Boolean isOpenvpn_udp_tls_crypt() {
		return this.openvpn_udp_tls_crypt;
	}
	
	public final Boolean isOpenvpn_tcp_tls_crypt() {
		return this.openvpn_tcp_tls_crypt;
	}
	
	public final Boolean isOpenvpn_dedicated_udp() {
		return this.openvpn_dedicated_udp;
	}
	
	public final Boolean isOpenvpn_dedicated_tcp() {
		return this.openvpn_dedicated_tcp;
	}
	
	public final Boolean isV2ray() {
		return this.v2ray;
	}

	@Override
	public final int compareTo(final Features arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
