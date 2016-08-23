package problems;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("great"));

	}
	/**
	 * this is in place reversal
	 * @param str
	 * @return
	 */
	public static String reverse(String str){
		char ch[] = str.toCharArray();
		for(int i=0,j=ch.length-1;i<j;i++,j--){
			char temp = ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		return new String(ch);
	}

}
