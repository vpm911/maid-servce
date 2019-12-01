package com.maid.dto;

import lombok.Data;

@Data
public class Response {

	String code;
	String error;
	String message;
	Object body;
}
