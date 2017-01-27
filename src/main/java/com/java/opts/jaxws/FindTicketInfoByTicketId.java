
package com.java.opts.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findTicketInfoByTicketId", namespace = "http://opts.java.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findTicketInfoByTicketId", namespace = "http://opts.java.com/")
public class FindTicketInfoByTicketId {

    @XmlElement(name = "ticketID", namespace = "")
    private int ticketID;

    /**
     * 
     * @return
     *     returns int
     */
    public int getTicketID() {
        return this.ticketID;
    }

    /**
     * 
     * @param ticketID
     *     the value for the ticketID property
     */
    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

}
