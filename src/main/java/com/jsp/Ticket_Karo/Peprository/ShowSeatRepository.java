package com.jsp.Ticket_Karo.Peprository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Ticket_Karo.Entity.Seat;
import com.jsp.Ticket_Karo.Entity.ShowSeat;



public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {

	List<ShowSeat> findBySeatIn(List<Seat> seats);

}