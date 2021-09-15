class IfDemo {
	public static void main(String args[]) {
		int a,b,c;
		a = 2;
		b = 3;
		if (a<b) System.out.println("a less than b");
		if (a==b) System.out.println("a equals b");
		
		c = a-b;
		System.out.println("c has " + c);
		if (c>=0) System.out.println("c isn't negative value");
		if (c<0) System.out.println("c is negative value");
		}
		}