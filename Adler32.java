/**
 *@Author Simon Schuler 
 *
 *This Class implements the Adler-32 Hash-Function in java.
 *This is FAR from optimal, I was just using it to generate
 *some hashes for some of my Students.
 */
public class Adler32 {
	private static final int MOD_ADLER = 65521;
	public static void main(String[] args) {
		String input = "";
		//append all the args together with spaces.
		for(int i = 0; i < args.length; i++) {
			if ( i < args.length - 1) {
				input += args[i] + " ";
			} else {
				input += args[i];
			}
		}
		//this is where the matic happens.
		int a=1, b=0;
		for(int i = 0; i < input.length(); i++) {
			a = (a + input.charAt(i)) % MOD_ADLER;
			b = (b + a) % MOD_ADLER;
		}

	System.out.println("0x" + Integer.toHexString((b << 16) | a).toUpperCase());
	}
}
