class RecursiveStringBack {
	
	
	static void StringBack(String text){
		if (text.length() == 0)
			return;
		else{
			System.out.print(text.charAt(text.length()-1));
			text = text.subSequence(0,text.length()-1).toString();
			StringBack(text);	
		}	
	}
	
	public static void main(String args[]){
		String text = "We are Legion.";
		System.out.println(text);
		StringBack(text);
		
	}
}

