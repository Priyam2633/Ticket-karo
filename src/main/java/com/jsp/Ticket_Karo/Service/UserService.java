package com.jsp.Ticket_Karo.Service;

import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jsp.Ticket_Karo.dto.LoginDto;
import com.jsp.Ticket_Karo.dto.UserDto;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

public interface UserService {

	String register(UserDto userDto, BindingResult result);

	String login(LoginDto dto, RedirectAttributes attributes, HttpSession session);

	String logout(HttpSession session, RedirectAttributes attributes);
}
