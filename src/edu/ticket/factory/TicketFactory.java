package edu.ticket.factory;

import edu.ticket.Ticket;
import edu.ticket.strategy.EmailResponseStrategy;
import edu.ticket.strategy.WebResponseStrategy;

public class TicketFactory {

    public static Ticket createTicket(TicketType type) {

        switch (type) {
            case WEB:
                return new Ticket(new WebResponseStrategy());

            case EMAIL:
                return new Ticket(new EmailResponseStrategy());

            default:
                throw new IllegalArgumentException("Unsupported ticket type");
        }
    }
}
