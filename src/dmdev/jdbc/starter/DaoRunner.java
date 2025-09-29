package dmdev.jdbc.starter;

import dmdev.jdbc.starter.dao.TicketDao;
import dmdev.jdbc.starter.dto.TicketFilter;

import java.math.BigDecimal;

public class DaoRunner {
    public static void main(String[] args) {
        var ticketFilter = new TicketFilter(10,2);

        var ticketDao = TicketDao.getInstance();
        var ticket = ticketDao.findById(2L);
        System.out.println(ticket);

        ticket.ifPresent(ticket1 -> {
            ticket1.setCost(BigDecimal.valueOf(188.88));
            ticketDao.update(ticket1);
        });
    }
}
//
//        var ticket = new Ticket();
//        ticket.setPassengerNo("1111");
//        ticket.setPassengerName("1113331");
//        ticket.setFlightId(3L);
//        ticket.setSeatNo("b3");
//        ticket.setCost(BigDecimal.TEN);
//
//        var save = instance.save(ticket);
//        System.out.println(save.toString());



