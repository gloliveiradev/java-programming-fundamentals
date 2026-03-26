package Context;

import Strategy.ICompressionType;

/**
 * Defines the class File for this project.
 */
public class File {
	private int Size;
	public int getSize() {
		return Size;
	}

	public void setSize(int size) {
		Size = size;
	}

	public ICompressionType getTC() {
		return TC;
	}

	public void setTC(ICompressionType tC) {
		TC = tC;
	}

	private ICompressionType TC;
	
	public File(int size, ICompressionType tC) {
		super();
		Size = size;
		TC = tC;
	}
	
	public void compress() {
		TC.compress();
	}
}
