package com.jsp.Ticket_Karo.Peprository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Ticket_Karo.Entity.BookedTicket;

public interface TicketRepository extends JpaRepository<BookedTicket, Long> {

}