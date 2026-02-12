package edu.ticket.state;

import edu.ticket.Ticket;

public class ResolvedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket has been resolved.");
        ticket.setState(new ClosedState());
    }

    @Override
    public String getName() {
        return "RESOLVED";
    }
}
