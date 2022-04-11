package in.aitacs.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PwdService {
	
	public static String encoder(String txt) {
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(txt.getBytes());
		
		
		return new String(encode);
	}
	
	public static String decode(String encoder) {
		Decoder decoder = Base64.getDecoder();
		System.out.println("Iam second version");
		byte[] encode = decoder.decode(encoder);
		return new String(encode);
	}


//added in dev branch
//againg added dev bramcj
//3rd time added 
//5th time added 
int i=1;

int j=12;




	public void m1(){
		// Bug-id=111;
		//Implementation
	}

	

		

	
	/*Bye
	 * public static void main(String[] args) {
	 * 
	 * String encoder = encoder("Narendra"); System.out.println(encoder); String
	 * decode = decode(encoder); System.out.println(decode); }
	 */

}
