package com.jsp.Ticket_Karo.Peprository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Ticket_Karo.Entity.Screen;
import com.jsp.Ticket_Karo.Entity.Seat;



public interface SeatRepository extends JpaRepository<Seat, Long> {

	List<Seat> findByScreenOrderBySeatRowAscSeatColumnAsc(Screen screen);

	Seat findBySeatNumber(String seatNumber);

}
