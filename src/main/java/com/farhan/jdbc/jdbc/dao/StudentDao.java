package com.farhan.jdbc.jdbc.dao;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDao {
	private String name;
	private String location;
	private LocalDateTime birth_date;

}
