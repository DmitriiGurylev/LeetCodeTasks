public class LoopWithStepMinus2 {
	public static void main(String args[])
	throws java.io.IOException {
		char ch, ignore;
		int spaceSum;
		spaceSum = 0;
		System.out.println("Enter any text: ");
		
		do  {
		
			ch = (char) System.in.read();
			if (ch == ' ') spaceSum+=1;
			
			do  {				
				ignore = (char) System.in.read();
			}
			while(ignore != '\n');		
			
		}
		while (ch != '.');
		System.out.println("Value of Spaces: " + spaceSum);
	}	
}