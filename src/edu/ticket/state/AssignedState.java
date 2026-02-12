package edu.ticket.state;

import edu.ticket.Ticket;

public class AssignedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket has been assigned to a support unit.");
        ticket.setState(new InProgressState());
    }

    @Override
    public String getName() {
        return "ASSIGNED";
    }
}
