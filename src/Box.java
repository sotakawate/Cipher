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
		int colwidth = in.nextInt();
		//break the String into columns
		int totalrows=(message.length()+colwidth-1)/colwidth;
		int x=0;
		for(x=0;x<totalrows;x++) {
			int end =Math.min(n + colwidth, message.length());
			Lines.add(message.substring(n,end));
			n= n+colwidth;
			}
		//Rewrite the message by reading the columns vertically
		String shifted ="";
		for(int col=0; col<colwidth;col++) {
			for(int row=0; row<totalrows;row++) {
				String a = Lines.get(row);
				if(col<a.length()) {
				shifted = shifted+a.charAt(col);
				}
			}
		}
		//Print out the message
		System.out.println(shifted);
	}

}
