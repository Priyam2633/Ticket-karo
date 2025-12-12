package com.jsp.Ticket_Karo.Peprository;
import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Ticket_Karo.Entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	boolean existsByNameAndReleaseDate(String name, LocalDate releaseDate);

}