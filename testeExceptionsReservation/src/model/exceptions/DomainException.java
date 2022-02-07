package model.exceptions;
public class DomainException extends RuntimeException{
	//Exception
	private static final long serialVersionUID = 1L;
	public DomainException(String msg) {
		super(msg);
	}
}
