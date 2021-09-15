class Help2 {
	public static void main(String args[])
	throws java.io.IOException {
		char choice, ignore;
			
		do  {
			System.out.println("1. If");
			System.out.println("2. Switch");			
			System.out.println("4. While");
			System.out.println("5. Do-While");

			choice = (char) System.in.read();
			do  {
				ignore = (char) System.in.read();
				} 
			while(ignore != '\n');
			}	
		while (choice < '1' | choice > '5');
			
		switch (choice){
			case '1':
				System.out.println("Operator If:");
				System.out.println("if (condition) operator;");
				System.out.print("else operator");
				break;
			case '2':		
				System.out.println("Operator Switch:");
				System.out.println("switch (expression)");
				System.out.print("{");
				System.out.println("case const:");
				System.out.println("operator sequance ");
				System.out.println("break;");
				System.out.println("//...");		
				System.out.println("}");				
				break;
			case '3':
				System.out.println("Operator for:");
				System.out.println("for(init; condition; iteration)");
				System.out.println("operator;");
				break;
			case '4':
				System.out.println("Operator while:\n");
				System.out.println("while(condition) operator;");
				break;
			case '5':
				System.out.println("Operator do-while:\n");
				System.out.println("do {");
				System.out.println(" operator;");
				System.out.println("} while (condition);");
				break;
			}	
			}
			}