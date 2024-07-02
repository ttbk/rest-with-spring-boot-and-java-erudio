package br.com.erudio.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.math.SimpleMath;
import br.com.erudio.util.NumberConverter;

@RestController
public class MathController {

	private final AtomicLong counter = new AtomicLong();
	
	private SimpleMath math = new SimpleMath();

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double Sum(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric Value!");
		}

		return math.Sum(NumberConverter.toDouble(numberOne) , NumberConverter.toDouble(numberTwo));
				
	}
	
	@RequestMapping(value = "/minus/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double Minus(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric Value!");
		}
		
		return math.Minus(NumberConverter.toDouble(numberOne), NumberConverter.toDouble(numberTwo));
	}
	
	@RequestMapping(value = "/multiply/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double Multiply(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric Value!");
		}

		return math.Multiply(NumberConverter.toDouble(numberOne), NumberConverter.toDouble(numberTwo));
	}
	
	@RequestMapping(value = "/divide/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double Divide(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric Value!");
		}
		
		if (Double.parseDouble(numberTwo) == 0D)
			throw new UnsupportedMathOperationException("Division by zero!");
		
		return math.Divide(NumberConverter.toDouble(numberOne), NumberConverter.toDouble(numberTwo));
	}
	
	@RequestMapping(value = "/avg/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double Avg(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric Value!");
		}

		return math.Avg(NumberConverter.toDouble(numberOne), NumberConverter.toDouble(numberTwo));
	}
	
	@RequestMapping(value = "/sqrt/{numberOne}", method = RequestMethod.GET)
	public Double Sqrt(
			@PathVariable(value = "numberOne") String numberOne) throws Exception {

		if (!NumberConverter.isNumeric(numberOne)) {
			throw new UnsupportedMathOperationException("Please set a numeric Value!");
		}

		return math.Sqrt(NumberConverter.toDouble(numberOne));
	}
}