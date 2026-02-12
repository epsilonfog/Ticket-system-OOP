package edu.ticket.state;

import edu.ticket.Ticket;

public class ClosedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket is closed. No further actions allowed.");
    }

    @Override
    public String getName() {
        return "CLOSED";
    }
}
