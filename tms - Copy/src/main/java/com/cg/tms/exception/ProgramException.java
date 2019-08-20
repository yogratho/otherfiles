package com.cg.tms.exception;

public class ProgramException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public ProgramException()
	{}
	public ProgramException(String errorMassage) {
		super(errorMassage);
	}

}
