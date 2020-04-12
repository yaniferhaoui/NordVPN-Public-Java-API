package com.yferhaoui.nordvpn_public_api;

import java.io.IOException;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;

import com.yferhaoui.nordvpnc_public_api.Example;

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public final class ExempleTest {

	@Test
	@Order(1) // Check getProxy
	public final void testGetProxy() throws IOException, InterruptedException {
		
		// Just test no exception 
		Example.main(null);
		
	}
	
}
