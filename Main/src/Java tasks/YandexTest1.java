import java.util.HashMap;

class YandexTest1 {
	int a;
	YandexTest1(int i) { a = i; }

	
	public static void main (String args[]){
		String str = "rejmwe;nvernvreqbgv;fdlmvaernv/c.,v   jerqveqrbv s.cmv a;dnv cbvrej;k";
		System.out.println(letterCount(str));
		}

		public static String letterCount(String s){
			HashMap <Character,Integer> map = new HashMap<>();
			for (Character ch : s.toCharArray()){
				if ((!map.containsKey(ch))) {
					map.put(ch, 1);
				} else {
					map.put(ch, map.get(ch) + 1);
				}
			}
			int maxCount = 0;
			char c = ' ';
			for (Character ch : map.keySet()){
				if (map.get(ch)>maxCount && ch != ' ') {
					maxCount = map.get(ch);
					c = ch;
				}
			}
		return c+" "+maxCount;


		}

}
		
