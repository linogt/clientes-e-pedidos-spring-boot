package io.github.linogt.vendas.rest.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import io.github.linogt.vendas.exception.RegraNegocioException;
import io.github.linogt.vendas.rest.ApiErrors;

@RestControllerAdvice
public class ApplicationControllerAdvice {
	
	
	@ExceptionHandler(RegraNegocioException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ApiErrors handleRegraNegocioException(RegraNegocioException ex) {
		String mensagemErro = ex.getMessage();
		return new ApiErrors(mensagemErro);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ApiErrors handlerMethodNotValidException(MethodArgumentNotValidException ex) {
		List<String> errors = ex.getBindingResult()
		.getAllErrors()
		.stream()
		.map(erro->erro.getDefaultMessage())
		.collect(Collectors.toList());
		return new ApiErrors(errors);
	}
}
