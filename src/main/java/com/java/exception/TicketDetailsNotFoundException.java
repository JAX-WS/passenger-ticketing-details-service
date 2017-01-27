package com.java.exception;

import javax.xml.ws.WebFault;

@WebFault(name = "soapFault")
public class TicketDetailsNotFoundException extends Exception {

	private ErrorModel errorModel;

	public TicketDetailsNotFoundException(ErrorModel errorModel) {
		super();
		this.errorModel = errorModel;
	}

	public ErrorModel getErrorModel() {
		return errorModel;
	}

	public void setErrorModel(ErrorModel errorModel) {
		this.errorModel = errorModel;
	}

}
