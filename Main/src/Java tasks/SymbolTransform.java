public class SymbolTransform {
	public static void main(String args[])
	throws java.io.IOException {
		
		char ch,ignore;
		int count;
		count = 0;
		do{
			System.out.print("Enter any symbol: ");
			ch = (char) System.in.read();
			
			do  {
				ignore = (char) System.in.read();
			} 
			while(ignore != '\n');
			
			if (ch >= 65 & ch <= 90){
				System.out.println("Transformed symbol is: " +(char) (ch+32));
			count++;}
			else if (ch >= 97 & ch <= 122){
				System.out.println("Transformed symbol is: " +(char) (ch-32));
				count++;}
			else 
				System.out.println("It's not a correct symbol");
		}
		while (ch != '.')	;	
		System.out.println("Symbols transformed: " + count);
		
	}		
}	