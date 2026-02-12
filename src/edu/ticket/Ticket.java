import edu.ticket.state.CreatedState;
import edu.ticket.state.TicketState;

public class Ticket {

    private TicketState state;

    public Ticket() {
        this.state = new CreatedState();
    }

    public void process() {
        state.handle(this);
    }

    public void setState(TicketState state) {
        this.state = state;
    }

    public String getStateName() {
        return state.getName();
    }
}
