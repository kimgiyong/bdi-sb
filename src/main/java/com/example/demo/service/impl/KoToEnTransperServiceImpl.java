package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.KoToEnTransperService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KoToEnTransperServiceImpl implements KoToEnTransperService {

	private String clientId = "RfATdtwtvDjMwDOrc8ax";
	private String clientSecret = "vyQr8HWQ1h";
	@Override
	public String transper(String koText) {
		log.info("input Test=>{}",koText);
		return null;
	}

}
