package Context;
import Strategy.LempelZivWelch;

/**
 * Defines the class Text for this project.
 */
public class Text extends File {
	private int FontSize;

	public Text(int size, int fontSize) {
		super(size, new LempelZivWelch());
		FontSize = fontSize;
	}

	public int getFontSize() {
		return FontSize;
	}

	public void setFontSize(int fontSize) {
		FontSize = fontSize;
	}
}
