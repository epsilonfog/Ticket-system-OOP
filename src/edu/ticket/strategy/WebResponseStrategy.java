package edu.ticket.strategy;

import edu.ticket.Ticket;

public class WebResponseStrategy implements ResponseStrategy {

    @Override
    public void sendResponse(Ticket ticket) {
        System.out.println("Sending web-based response for ticket.");
    }
}
