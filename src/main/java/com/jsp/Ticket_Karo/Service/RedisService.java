package com.jsp.Ticket_Karo.Service;

import com.jsp.Ticket_Karo.Entity.BookedTicket;
import com.jsp.Ticket_Karo.dto.UserDto;

public interface RedisService {

	void saveUserDto(String email, UserDto userDto);

	void saveOtp(String email, int otp);

	UserDto getDtoByEmail(String email);

	int getOtpByEmail(String email);

	void saveTicket(String id, BookedTicket ticket);

	BookedTicket getTicket(String razorpay_order_id);
	
}