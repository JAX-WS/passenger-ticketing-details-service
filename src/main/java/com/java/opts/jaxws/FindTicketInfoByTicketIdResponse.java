
package com.java.opts.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findTicketInfoByTicketIdResponse", namespace = "http://opts.java.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findTicketInfoByTicketIdResponse", namespace = "http://opts.java.com/")
public class FindTicketInfoByTicketIdResponse {

    @XmlElement(name = "ticketInfoModel", namespace = "")
    private com.java.model.TicketInfoModel ticketInfoModel;

    /**
     * 
     * @return
     *     returns TicketInfoModel
     */
    public com.java.model.TicketInfoModel getTicketInfoModel() {
        return this.ticketInfoModel;
    }

    /**
     * 
     * @param ticketInfoModel
     *     the value for the ticketInfoModel property
     */
    public void setTicketInfoModel(com.java.model.TicketInfoModel ticketInfoModel) {
        this.ticketInfoModel = ticketInfoModel;
    }

}
