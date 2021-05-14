package demo3;

public interface PrototypeEntertainment extends Cloneable{
	public String getName();
	public void setName(String name);

	public PrototypeEntertainment clone() throws CloneNotSupportedException;
}
