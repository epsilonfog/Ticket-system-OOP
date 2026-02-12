package edu.ticket;

import edu.ticket.factory.TicketFactory;
import edu.ticket.factory.TicketType;

public class Main {

    public static void main(String[] args) {

        Ticket webTicket = TicketFactory.createTicket(TicketType.WEB);
        Ticket emailTicket = TicketFactory.createTicket(TicketType.EMAIL);

        webTicket.process();
        emailTicket.process();
    }
}
