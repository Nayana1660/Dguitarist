import java.util.*; import java.math.BigInteger; public class DiffieHellman { final static BigInteger one = new BigInteger("1"); public static void main(String args[]) { 
Scanner stdin = new Scanner(System.in); 
BigInteger n; 
System.out.println("Enter the first prime no:");  String ans = stdin.next(); n = getNextPrime(ans);  
System.out.println("First prime is: " + n + "."); 
System.out.println("Enter the second prime no(between 2 and n-1):");  
BigInteger g = new BigInteger(stdin.next()); 
System.out.println("Person A: enter your secret number now.i.e any random no(x)");  
BigInteger a = new BigInteger(stdin.next()); 
BigInteger resulta = g.modPow(a, n); 
System.out.println("Person A sends" + resulta + "to person B."); 
System.out.println("Person B: enter your secret number now.i.e any random no(y)"); 
BigInteger b = new BigInteger(stdin.next()); 
BigInteger resultb = g.modPow(b, n); 
System.out.println("Person B sends" + resultb + "to person A."); 
BigInteger KeyACalculates = resultb.modPow(a, n); 
BigInteger KeyBCalculates = resulta.modPow(b, n); 
System.out.println("A takes" + resultb + "raises it to the power" + a + "mod" + n);  
System.out.println("The Key A calculates is" + KeyACalculates + "."); 
System.out.println("B takes" + resulta + "raises it to the power" + b + "mod" + n);  
System.out.println("The Key B calculates is" + KeyBCalculates + "."); } 
 
public static BigInteger getNextPrime(String ans) { BigInteger test = new BigInteger(ans); while (!test.isProbablePrime(99)) test = test.add(one); return test; 
} 
} 