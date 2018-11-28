package com.example.demo.vo;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class BoardVO {

	private Integer bnum;
	private String btitle;
	private String bcontent;
	private String bcredat;
	private String bcretim;
}
