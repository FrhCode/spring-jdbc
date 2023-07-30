package com.farhan.jdbc.jdbc.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
	private String id;
	private String name;
	private String location;
	private LocalDateTime birth_date;
}
