package com.yferhaoui.nordvpnc_public_api.data;

import java.io.Serializable;

import com.google.gson.annotations.Expose;

import lombok.ToString;

@ToString
public final class Features implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7632731472755045722L;

	@Expose(serialize = true, deserialize = true)
	private boolean ikev2;

	@Expose(serialize = true, deserialize = true)
	private boolean openvpn_udp;

	@Expose(serialize = true, deserialize = true)
	private boolean openvpn_tcp;

	@Expose(serialize = true, deserialize = true)
	private boolean socks;

	@Expose(serialize = true, deserialize = true)
	private boolean proxy;

	@Expose(serialize = true, deserialize = true)
	private boolean pptp;

	@Expose(serialize = true, deserialize = true)
	private boolean l2tp;

	@Expose(serialize = true, deserialize = true)
	private boolean openvpn_xor_udp;

	@Expose(serialize = true, deserialize = true)
	private boolean openvpn_xor_tcp;

	@Expose(serialize = true, deserialize = true)
	private boolean proxy_cybersec;

	@Expose(serialize = true, deserialize = true)
	private boolean proxy_ssl;

	@Expose(serialize = true, deserialize = true)
	private boolean proxy_ssl_cybersec;

	@Expose(serialize = true, deserialize = true)
	private boolean ikev2_v6;

	@Expose(serialize = true, deserialize = true)
	private boolean openvpn_udp_v6;

	@Expose(serialize = true, deserialize = true)
	private boolean openvpn_tcp_v6;

	@Expose(serialize = true, deserialize = true)
	private boolean wireguard_udp;

	@Expose(serialize = true, deserialize = true)
	private boolean openvpn_udp_tls_crypt;

	@Expose(serialize = true, deserialize = true)
	private boolean openvpn_tcp_tls_crypt;

	@Expose(serialize = true, deserialize = true)
	private boolean openvpn_dedicated_udp;

	@Expose(serialize = true, deserialize = true)
	private boolean openvpn_dedicated_tcp;

	@Expose(serialize = true, deserialize = true)
	private boolean v2ray;

	// Getter
	public final boolean isIkev2() {
		return this.ikev2;
	}

	public final boolean isOpenvpn_udp() {
		return this.openvpn_udp;
	}

	public final boolean isOpenvpn_tcp() {
		return this.openvpn_tcp;
	}

	public final boolean isSocks() {
		return this.socks;
	}

	public final boolean couldBeProxy() {
		return this.proxy || this.proxy_cybersec || this.proxy_ssl || this.proxy_ssl_cybersec;
	}

	public final boolean isProxy() {
		return this.proxy;
	}

	public final boolean isPptp() {
		return this.pptp;
	}

	public final boolean isL2tp() {
		return this.l2tp;
	}

	public final boolean isOpenvpn_xor_udp() {
		return this.openvpn_xor_udp;
	}

	public final boolean isOpenvpn_xor_tcp() {
		return this.openvpn_xor_tcp;
	}

	public final boolean isProxy_cybersec() {
		return this.proxy_cybersec;
	}

	public final boolean isProxy_ssl() {
		return this.proxy_ssl;
	}

	public final boolean isProxy_ssl_cybersec() {
		return this.proxy_ssl_cybersec;
	}

	public final boolean isIkev2_v6() {
		return this.ikev2_v6;
	}

	public final boolean isOpenvpn_udp_v6() {
		return this.openvpn_udp_v6;
	}

	public final boolean isOpenvpn_tcp_v6() {
		return this.openvpn_tcp_v6;
	}

	public final boolean isWireguard_udp() {
		return this.wireguard_udp;
	}

	public final boolean isOpenvpn_udp_tls_crypt() {
		return this.openvpn_udp_tls_crypt;
	}

	public final boolean isOpenvpn_tcp_tls_crypt() {
		return this.openvpn_tcp_tls_crypt;
	}

	public final boolean isOpenvpn_dedicated_udp() {
		return this.openvpn_dedicated_udp;
	}

	public final boolean isOpenvpn_dedicated_tcp() {
		return this.openvpn_dedicated_tcp;
	}

	public final boolean isV2ray() {
		return this.v2ray;
	}
}
