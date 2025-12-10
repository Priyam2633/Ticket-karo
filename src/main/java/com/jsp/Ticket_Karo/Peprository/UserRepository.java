package com.jsp.Ticket_Karo.Peprository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Ticket_Karo.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	boolean existsByEmail(String email);

	void deleteByRole(String string);

	User findByEmail(String email);

	boolean existsByMobile(Long mobile);

	List<User> findByRole(String string);

	
}
