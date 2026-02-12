package edu.ticket;

import edu.ticket.state.CreatedState;
import edu.ticket.state.TicketState;
import edu.ticket.strategy.ResponseStrategy;

public class Ticket {

    private TicketState state;
    private ResponseStrategy responseStrategy;

    public Ticket(ResponseStrategy responseStrategy) {
        this.state = new CreatedState();
        this.responseStrategy = responseStrategy;
    }

    public void process() {
        state.handle(this);
        responseStrategy.sendResponse(this);
    }

    public void setState(TicketState state) {
        this.state = state;
    }

    public String getStateName() {
        return state.getName();
    }
}
