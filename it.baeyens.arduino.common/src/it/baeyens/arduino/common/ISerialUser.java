package it.baeyens.arduino.common;

public interface ISerialUser {
	public boolean pausePort(String PortName);

	public void resumePort(String PortName);
}
