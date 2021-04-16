package ems;

public class InvalidDataException extends RuntimeException {
	public InvalidDataException(String info) {
		super(info);
	}
}
