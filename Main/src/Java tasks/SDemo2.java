class Stack{
	private char q[];
	private int putloc, getloc;
	
	Stack(Stack ob){
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];
		
		for (int i=0; i<=putloc; i++)
		q[i] = ob.q[i];			
	}
	
	Stack(char a[]){
		putloc = 0;
		getloc = a.length+1;
		q = new char[a.length+1];
		
		for (int i=0; i<a.length; i++)
		put(a[i]);		
	}
	
	Stack(int size){
		q = new char[size+1];
		putloc = 0;
		getloc = size+1;
	}
	
	void put(char ch){
		if (putloc == (q.length-1) ){
			System.out.println(" Stack is fulled up");
			return;
		}
		putloc++;
		q[putloc] = ch;
	}
	
	char get(){
		if (getloc == 0){
			System.out.println(" Stack is empty");
			return (char) 0;
		}
		getloc--;
		return q[getloc];		
	}	
}

class SDemo2{
	public static void main(String args[]){
		
		Stack q1 = new Stack(10);
		
		char name[] = {'T', 'o', 'm'};		
		Stack q2 = new Stack(name);
		
		char ch;
		int i;
		
		for (i=0; i<10; i++)
		q1.put( (char) ('A' + i) );
		
		Stack q3 = new Stack(q1);
		
		System.out.print("Content q1: ");
		for (i=0; i<10; i++){
			ch = q1.get();
			System.out.print(ch);
		}
		
		System.out.print('\n');
		
		System.out.print("Content q2: ");
		for (i=0; i<3; i++){
			ch = q2.get();
			System.out.print(ch);
		}	
		
		System.out.print('\n');
		
		System.out.print("Content q3: ");
		for (i=0; i<10; i++){
			ch = q3.get();
			System.out.print(ch);
		}
		
		
	}
}
