class Queue{
	char q[];
	int putloc, getloc;
	
	Queue(int size){
		q = new char[size+1];
		putloc = getloc = 0;
	}
	
	void put(char ch){
		if (putloc == (q.length-1) ){
			System.out.println(" Queue is fulled up");
			return;
		}
		putloc++;
		q[putloc] = ch;
	}
	
	char get(){
		if (getloc == putloc){
			System.out.println(" Queue is empty");
			return (char) 0;
		}
		getloc++;
		return q[getloc];		
	}	
}

class QDemo{
	public static void main(String args[]){
		
		Queue biqQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;
		
		System.out.println("Using of bigQ to save alphabet");
		
		for (i=0; i<26; i++)
		biqQ.put( (char) ('A' + i));
		
		System.out.print("biqQ elements: ");
		
		for (i=0; i<26; i++){
			ch = biqQ.get();
			if (ch != (char) 0)
			System.out.print(ch);
		}
		
		System.out.println("\n"); 
		
		System.out.println("Using of smallQ to create mistakes");
		
		for (i=0; i<5; i++){
			System.out.print("Attempt to save " + (char) ('Z' - i));
			smallQ.put( (char) ('Z' - i) );
			System.out.println();
		}
		System.out.println();
		
		System.out.print("smallQ content: ");
		for (i=0; i<5; i++){
			ch = smallQ.get();
			if (ch != (char) 0)
			System.out.print(ch);
			
		}
	}
}				