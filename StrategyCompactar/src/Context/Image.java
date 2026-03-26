package Context;

import Strategy.Huffman;

/**
 * Defines the class Image for this project.
 */
public class Image extends File {
	private int  Width;
	public Image(int size, int width, int height) {
		super(size, new Huffman());
		Width = width;
		Height = height;
	}
	private int Height;
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}
	public int getHeight() {
		return Height;
	}
	public void setHeight(int height) {
		Height = height;
	}
}
