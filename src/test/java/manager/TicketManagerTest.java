package manager;

import model.Ticket;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketManagerTest {

    @Test
    public void findAllTest() {
        TicketManager manager = new TicketManager();
        Ticket t1 = new Ticket();
        t1.setDepartureAirport("123");
        t1.setArrivalAirport("456");
        t1.setCost(10.0);
        Ticket t2 = new Ticket();
        t2.setDepartureAirport("123");
        t2.setArrivalAirport("456");
        t2.setCost(10.0);

        Ticket t3 = new Ticket();
        t3.setDepartureAirport("123");
        t3.setArrivalAirport("456");
        t3.setCost(9.0);

        Ticket t4 = new Ticket();
        t4.setDepartureAirport("123");
        t4.setArrivalAirport("456");
        t4.setCost(11.0);


        manager.addTicket(t1);
        manager.addTicket(t2);
        manager.addTicket(t3);
        manager.addTicket(t4);

        ArrayList<Ticket> result = manager.findAll("123", "456");

        assertEquals(4, result.size());
        assertArrayEquals(new Ticket[]{t3, t1, t2, t4}, result.toArray());

        assertEquals(0, manager.findAll("", "").size());
    }
}
