package PACKGE_BEE;
import java.util.Scanner;
/**
 * Defines the class Beecrowd1168Led for this project.
 */
public class Beecrowd1168Led {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try { 
			String sAmountLinesLeds = input.nextLine();
			int amountLinesLeds = Integer.valueOf(sAmountLinesLeds);
			for (int i = 0; i < amountLinesLeds; i++)
			{
				int sum = 0;
				String numLedsShow = input.nextLine();
				int lengthLedsShow = numLedsShow.length();
				char[] charNumLedsShow = numLedsShow.toCharArray();    
				for (int j = 0; j < lengthLedsShow; j++)
				{
					char ctr = charNumLedsShow[j];
					if (ctr == '1') sum += 2;
					if (ctr == '2' || ctr == '3' || ctr == '5') sum += 5;
					if (ctr == '4') sum += 4;
					if (ctr == '6' || ctr == '9' || ctr == '0') sum += 6;
					if (ctr == '7') sum += 3;
					if (ctr == '8') sum += 7;
				}
				System.out.println(sum + " Leds");	
			}
		}
		finally {
			input.close();
		}
	}
}
