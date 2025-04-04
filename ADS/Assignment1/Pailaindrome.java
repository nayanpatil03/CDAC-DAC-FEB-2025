//Palaindrome

class Pailaindrome {
	static String str;
	static boolean isPalaindrome(int i, int j, String str) {
		if(i >= j) {
			return true;
		} 
		if(str.charAt(i) != str.charAt(j)) {
		return false;
		}
		
		i = i + 1;
		j = j - 1;
		return isPalaindrome(i, j, str);
	}
	
	public static void main(String[] args) {
		boolean isPalaindrome = isPalaindrome(0,6,"racecar");
		System.out.println("Is 'racecar' a palindrome? "+isPalaindrome); //Is 'racecar' a palindrome? true
	}
}