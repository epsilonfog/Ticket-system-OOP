package edu.ticket.state;

import edu.ticket.Ticket;

public class InProgressState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket is currently being processed.");
        ticket.setState(new ResolvedState());
    }

    @Override
    public String getName() {
        return "IN_PROGRESS";
    }
}
