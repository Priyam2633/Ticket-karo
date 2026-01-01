package com.jsp.Ticket_Karo.util;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class EmailHelper {
	private final JavaMailSender mailSender;
	private final TemplateEngine templateEngine;
	@Async
	public void sendOtp(int otp, String name, String email) {
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
		try {
		helper.setFrom("Ticket-Karo.com", "Ticket-Karo");
		helper.setTo(email);
		helper.setSubject("Otp for Creating Account with Ticket-Karo");
		Context context = new Context();
		context.setVariable("name", name);
		context.setVariable("otp", otp);
		String text = templateEngine.process("email-template.html", context);
		helper.setText(text, true);
		mailSender.send(mimeMessage);
		}catch (Exception e) {
			System.err.println("Failed to Send OTP : "+otp);	
		}
	}

}
