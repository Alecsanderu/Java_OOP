package com.codecool.crudpractice.employees.exception;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {

	private static final long serialVessionUID = 1L;

	String message;
}
