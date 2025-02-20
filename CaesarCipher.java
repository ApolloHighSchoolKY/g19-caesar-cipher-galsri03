/**
 * @(#)CaesarCipher.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */


public class CaesarCipher {

	private char[] alphabet;
	private char[] shifted;
	private int shift;

    public CaesarCipher() {
        //int size = 'z' - 'a' + 1;
        alphabet = new char[26];
        shifted = new char[26];
        
        for (int i=0; i< alphabet.length; i++) {
            //cast back to char
            alphabet[i] = (char) ('a' + i);
        }
    }

    public CaesarCipher(int num){

        alphabet = new char[26];
        shifted = new char[26];

        for (int i=0; i< alphabet.length; i++) {

            //cast back to char
            alphabet[i] = (char) ('a' + i);
        }
        shifter(num);
    }

    public String encrypt(String message){
        
        for (int i=0; i< message.length(); i++) {
           
        }
    }

    public String decrypt(String message){

    }

    public void shifter(int num){

    }


}
