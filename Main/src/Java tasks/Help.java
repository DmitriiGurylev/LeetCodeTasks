class Help {
	public static void main(String args[])
		throws java.io.IOException {
			
			System.out.println("About: \n1. If \n2. Switch \nChoose");
			char choise;
			choise = (char) System.in.read();
			switch (choise){
				case '1':
					System.out.println("Operator If: \n\nif (condition) operator; \nelse operator");
					break;
				case '2':		
					System.out.println("Operator Switch: \n\nswitch (expression) { \n case const: \noperator sequance \n break; \n//... \n}");
					break;
				default:
					System.out.println("Request isn't found");
			}	
			}
			}