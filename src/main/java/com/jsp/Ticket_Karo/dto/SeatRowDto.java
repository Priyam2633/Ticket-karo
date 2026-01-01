package com.jsp.Ticket_Karo.dto;

import lombok.Data;

@Data
public class SeatRowDto {
	private String rowName;
	private Integer totalSeats;
	private String category;
}
