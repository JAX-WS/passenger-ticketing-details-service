package com.java.opts;

import java.util.HashMap;
import java.util.Map;

import com.java.exception.ErrorModel;
import com.java.exception.TicketDetailsNotFoundException;
import com.java.model.TicketInfoModel;

import javax.jws.WebService;

@WebService(serviceName = "ticketMgrService", endpointInterface = "com.java.opts.ITicketMgrService", portName = "ticketMgrServiceSoapPort")
public class TicketMgrServiceImpl implements ITicketMgrService {

	static Map<Integer, TicketInfoModel> ticketDataMap = new HashMap<Integer, TicketInfoModel>();

	static {
		ticketDataMap.put(1, new TicketInfoModel(1, "ASIS", "AIR-2345",
				"DEL TO BLR", "2150HRS", "2350HRS"));
		ticketDataMap.put(2, new TicketInfoModel(2, "NEETA", "ETH-A123",
				"DEL TO PUNE", "1530HRS", "1730HRS"));
	}

	public TicketInfoModel findTicketInfoByTicketId(int ticketId)
			throws TicketDetailsNotFoundException {
		// TODO Auto-generated method stub
		if (ticketDataMap.containsKey(ticketId)) {
			return ticketDataMap.get(ticketId);
		} else {
			System.setProperty(
					"com.sun.xml.ws.fault.SOAPFaultBuilder.disableCaptureStackTrace",
					"false");
			throw new TicketDetailsNotFoundException(new ErrorModel(4404,
					"Ticket Details Not Found for ticketID: " + ticketId));
		}

	}

}
