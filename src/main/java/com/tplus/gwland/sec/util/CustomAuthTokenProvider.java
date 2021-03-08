package com.tplus.gwland.sec.util;

import javax.servlet.http.HttpServletRequest;
import org.springframework.security.core.Authentication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

public class CustomAuthTokenProvider implements AuthTokenProvider {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Value("${auth.jwtSecret}")
	private String jwtSecret;
	@Value("${auth.jwtExpirationMs}")
	private int jwtExpirationMs;

	@Override
	public String parseTokenString(HttpServletRequest request) {
		String bearerToken = request.getHeader("Authorization");
		if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
			return bearerToken.substring(7);
		}
		return null;
	}

	@Override
	public Long getTokenOwnerNo(String token) {
		return null;
	}
	@Override
	public boolean validateToken(String token) {
		return false;
	}

	@Override
	public String issue(Authentication auth) {
		return null;
	}

}
