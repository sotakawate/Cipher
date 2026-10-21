import java.util.ArrayList;
import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<String> Lines = new ArrayList<String>();
		int n=0;
		//Read in String
		String message = in.nextLine();
		//Read in how many columns
		int col = in.nextInt();
		//break the String into columns
		int col2=(message.length()+col-1)/col;
		int x=0;
		for(x=0;x<col2;x++) {
			int end =Math.min(n + col, message.length());
			Lines.add(message.substring(n,end));
			n= n+col;
			}
		//Rewrite the message by reading the columns vertically
		String shifted ="";
		for(int z=0; z<col;z++) {
			for(int y=0; y<col2;y++) {
				String a = Lines.get(y);
				if(z<a.length()) {
				shifted = shifted+a.charAt(z);
				}
			}
		}
		//Print out the message
		System.out.println(shifted);
	}

}
