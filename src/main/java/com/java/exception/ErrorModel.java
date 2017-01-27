package com.java.exception;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "errorInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class ErrorModel {

	private int errorCode;
	private String errorMessage;

	public ErrorModel(int errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public ErrorModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
