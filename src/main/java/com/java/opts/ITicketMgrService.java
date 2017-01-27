package com.java.opts;

import com.java.exception.TicketDetailsNotFoundException;
import com.java.model.TicketInfoModel;
import javax.jws.WebService;
import javax.jws.WebResult;
import javax.jws.WebParam;

@WebService(name = "ticketMgrService")
public interface ITicketMgrService {

	@WebResult(name = "ticketInfoModel")
	public TicketInfoModel findTicketInfoByTicketId(
			@WebParam(name = "ticketID") int ticketId)
			throws TicketDetailsNotFoundException;
}
