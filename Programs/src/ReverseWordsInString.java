/**
 * Reverse words in a string
 */
public class ReverseWordsInString {
	public static void main(String[] args){
		String s = reverseString("I am charitha");
		String[] words = s.split(" ");
		StringBuffer buffer = new StringBuffer();
		for (int i =0; i<words.length; i++){
			buffer.append(reverseString(words[i]));
            buffer.append(" ");
		}
		System.out.println(buffer.toString().trim());
	}

	private static String reverseString(String s){
		char[] array = s.toCharArray();
		for(int i = 0, j = s.length() -1; i<s.length()/2; i++, j--){
			char val = array[i];
			array[i] = array[j];
			array[j] = val;
		}
		return new String(array);
	}

}
