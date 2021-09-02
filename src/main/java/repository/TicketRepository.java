package repository;

import model.Ticket;

import java.util.ArrayList;
import java.util.Collections;

public class TicketRepository {
    private ArrayList<Ticket> ticketList = new ArrayList<>();

    public ArrayList<Ticket> getTickets() {
        Collections.sort(ticketList);
        return ticketList;
    }

    public void addTicket(Ticket ticket) {
        ticketList.add(ticket);
    }

    public void removeTicket(Ticket ticket) {
        ticketList.remove(ticket);
    }
}
