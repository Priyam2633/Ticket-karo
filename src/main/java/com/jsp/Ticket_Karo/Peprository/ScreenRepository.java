package com.jsp.Ticket_Karo.Peprository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Ticket_Karo.Entity.Screen;
import com.jsp.Ticket_Karo.Entity.Theater;



public interface ScreenRepository extends JpaRepository<Screen, Long> {

	List<Screen> findByTheater(Theater theater);

	boolean existsByNameAndTheater(String name, Theater theater);

}
