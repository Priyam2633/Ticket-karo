package com.jsp.Ticket_Karo.Peprository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Ticket_Karo.Entity.BookedTicket;
import com.jsp.Ticket_Karo.Entity.User;

public interface BookedTicketRepository extends JpaRepository<BookedTicket, Long> {

    List<BookedTicket> findByUser(User user);
}

