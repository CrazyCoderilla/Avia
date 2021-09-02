package repository;

import model.Ticket;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TicketRepositoryTest {
    private TicketRepository repository;
    private Ticket t;

    @BeforeAll
    public void setUp() {
        repository = new TicketRepository();
        t = new Ticket();
        t.setArrivalAirport("123");
    }

    @Test
    public void addTicketTest() {
        repository.addTicket(t);
        assertEquals(1, repository.getTickets().size());
        assertEquals(t, repository.getTickets().get(0));
    }

    @Test
    public void removeTicketTest() {
        repository.addTicket(t);
        assertEquals(1, repository.getTickets().size());
        repository.removeTicket(t);
        assertEquals(0, repository.getTickets().size());
    }
}
