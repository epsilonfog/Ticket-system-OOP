package edu.ticket.strategy;

import edu.ticket.Ticket;

public class EmailResponseStrategy implements ResponseStrategy {

    @Override
    public void sendResponse(Ticket ticket) {
        System.out.println("Sending email response for ticket.");
    }
}
