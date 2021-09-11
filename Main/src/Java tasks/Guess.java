class Guess {
	public static void main(String args[])
		throws java.io.IOException {
			
			char ch,answer;
			answer = 'A';
			System.out.println("Try to guess letter A-Z.");
			ch = (char) System.in.read();
			
			if (ch == answer) System.out.println("That's true!!!");
			else {
				System.out.print("That's not true!!!");
				if (ch < answer) System.out.println(" Right solution is on the right.");
				else System.out.println(" Right solution is on the left.");
			
			}
			}	
			}	
			