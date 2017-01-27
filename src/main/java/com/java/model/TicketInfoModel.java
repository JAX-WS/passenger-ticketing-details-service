package com.java.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ticketInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class TicketInfoModel {

	private int ticketId;
	private String passengerName;
	private String flightNum;
	private String sourceAndDestn;
	private String departureTime;
	private String arrivalTime;

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}

	public String getSourceAndDestn() {
		return sourceAndDestn;
	}

	public void setSourceAndDestn(String sourceAndDestn) {
		this.sourceAndDestn = sourceAndDestn;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public TicketInfoModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TicketInfoModel(int ticketId, String passengerName,
			String flightNum, String sourceAndDestn, String departureTime,
			String arrivalTime) {
		super();
		this.ticketId = ticketId;
		this.passengerName = passengerName;
		this.flightNum = flightNum;
		this.sourceAndDestn = sourceAndDestn;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}

	// generated setters & getters , parameterized constructors , default
	// constructor.
}
