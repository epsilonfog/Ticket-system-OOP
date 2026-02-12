package edu.ticket.state;

import edu.ticket.Ticket;

public class CreatedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket is created and waiting for assignment.");
        ticket.setState(new AssignedState());
    }

    @Override
    public String getName() {
        return "CREATED";
    }
}
