import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class StreamApiTest {

	public static void main (String args[]){
		long [] a = {2,1,4,2,3};

		String str = "  every     witch wishes";

		System.out.println(getWords(str));

		System.out.println(Arrays.toString(deleteDuplicates(a)));
	}

	// get count of words
	public static int getWords(String s) {
		int a = s.split("[\\s]+").length;
		if (s.charAt(0)==' ') a--;
		return a;
	}

	// delete first duplicates
	public static long[] deleteDuplicates(long[] a) {
		long[] b = IntStream.range(0, a.length)
				.mapToLong(el -> a[a.length-el-1])
				.distinct()
				.toArray();
		return IntStream.range(0, b.length)
				.mapToLong(el -> b[b.length-el-1])
				.distinct()
				.toArray();
	}

}
		
