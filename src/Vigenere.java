import java.util.Scanner;

public class Vigenere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String shifted = "";
		char c1 = 0;
		char c2 = 0;
		char c3 = 0;
		int c21 = 0;
		int y = 0;
		//Read in message
		String message = in.nextLine();
		//Read in shift word
		String shift = in.nextLine();
		//Loop through message
		for(int x=0; x< message.length();x++) {	
			//if letter is alphabetic
			c1 = message.charAt(x);
			if(Character.isLetter(c1)) {
				//apply shift from the current letter
				c2 = shift.charAt(y);
				if(Character.isLowerCase(c2)) {
					c21 = (c2 - 'a');
				}
				if(Character.isUpperCase(c2)) {
					c21 = (c2 - 'A');
				}

				c3 =(char) (c1 + c21);
				y++;
			
				//move to the next shift letter, loop back to the beginning if necessary
				if(y>=shift.length()) {
					y=0;
				}
				//if letter is past 'Z'
				if(c3>'Z') {
					//subtract 26
					c3 = (char)(c3-26);
				}
				shifted = shifted + c3;
				}else {
					shifted = shifted + c1;
				}
			//add letter to output
			
		}
		//print output
		System.out.println(shifted);
	}

}
