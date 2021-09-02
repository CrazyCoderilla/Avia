package manager;

import model.Ticket;
import repository.TicketRepository;

import java.util.ArrayList;

public class TicketManager {
    TicketRepository repository = new TicketRepository();

    public void addTicket(Ticket ticket) {
        repository.addTicket(ticket);
    }

    public ArrayList<Ticket> findAll(String from, String to) {
        ArrayList<Ticket> tickets = new ArrayList<>();
        for (Ticket ticket : repository.getTickets()) {
            if (ticket.getDepartureAirport().equals(from) && ticket.getArrivalAirport().equals(to)) {
                tickets.add(ticket);
            }
        }
        return tickets;
    }
}
