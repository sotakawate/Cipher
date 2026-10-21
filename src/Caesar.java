import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Read in message
		String mes = in.nextLine();
		//Read in shift
		String input = in.nextLine();
		char shf = input.charAt(0);
		String shifted = "";
		if (Character.isDigit(shf)) {
		   
		    char shift = (char) (shf - '0');
		} else if (Character.isUpperCase(shf)) {
		    
		    char shift = (char) (shf - 'A');
		}
		//Loop through message
		for(int x = 0; x<mes.length(); x++) {
			
			if(Character.isLowerCase(mes.charAt(x))) {
				char sfd = mes.charAt(x);
				char ch1 = (char)(((sfd-'a')+shf)%26+'a');
				shifted = shifted + ch1;
			
			}if(Character.isUpperCase(mes.charAt(x))){
				char sfd = mes.charAt(x);
				char ch1 = (char)(((sfd-'A')+shf)%26+'A');
				shifted = shifted + ch1;
			}else {
			shifted = shifted + mes.charAt(x);
			}
		}System.out.println(shifted);
	}
}
