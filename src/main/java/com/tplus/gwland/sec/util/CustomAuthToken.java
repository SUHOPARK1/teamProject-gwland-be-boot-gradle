package com.tplus.gwland.sec.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Getter;

interface AuthToken {
	String getToken();
}
@Builder
@Getter
public class CustomAuthToken implements AuthToken{
	private String token;
}
