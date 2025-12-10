package com.jsp.Ticket_Karo.Peprository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Ticket_Karo.Entity.Theater;



public interface TheaterRepository extends JpaRepository<Theater, Long> {

	boolean existsByNameAndAddress(String name, String address);

}
