import edu.ticket.state.CreatedState;
import edu.ticket.state.TicketState;
import edu.ticket.logger.SystemLogger;

public class Ticket {

    private TicketState state;

    public Ticket() {
        this.state = new CreatedState();
    }

    public void process() {
        state.handle(this);
        state.handle(this);
    responseStrategy.sendResponse(this);

    SystemLogger.getInstance()
        .log("Ticket processed. Current state: " + getStateName());
    }

    public void setState(TicketState state) {
        this.state = state;
    }

    public String getStateName() {
        return state.getName();
    }
}
