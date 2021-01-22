import java.util.Scanner;
public class Exercise6{
public static boolean med(String p){
	int lower = 0;
	int upper = 0;
	int number = 0;
	for(int i=0;i<p.length(); i++){
		char car = p.charAt(i);
	if ((car>='A') && (car<='Z'))
		upper = upper+1;
	else if ((car>='a') && (car<='z'))
		lower = lower+1;
	else if ((car>='0') && (car<='9'))
		number = number+1;
		}
	if ((lower+upper) == p.length())
		return true;
	else if (number == p.length())
		return true;
	else
		return false;
	}
public static boolean strong(String p){
	int low = 0;
	int up = 0;
	int num = 0;
	for(int i=0;i<p.length(); i++){
	char c = p.charAt(i);
	if (c>='A' && c<='Z')
	up = up+1;
	else if (c>='a' && c<='z')
	low = low+1;
	else if (c>='0' && c<='9')
	num = num+1;
	}
	if (((num+up+low) == p.length()) && num>=1 && up>=1 && low>=1)
	return true;
	else
	return false;
	}
public static boolean ok(String p){
	int low = 0;
	int up = 0;
	int num = 0;
	for(int i=0;i<p.length(); i++){
		char c = p.charAt(i);
	if (c>='A' && c<='Z')
		up = up+1;
	else if (c>='a' && c<='z')
		low = low+1;
	else if (c>='0' && c<='9')
		num = num+1;
		}
	if (((num+up) == p.length()) && num>=1 && up>=1)
		return true;
	else if (((num+low) == p.length()) && num>=1 && low>=1)
		return true;
	else
		return false;
	}
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter password: ");
	String passw = input.next();
	if ((passw.length())<8)
		System.out.println("Weak Password");
	else if (med(passw) == true)
		System.out.println("Medium Password");
	else if (ok(passw) == true)
		System.out.println("OK Password");
	else if ((strong(passw) == true) && passw.length()>12)
		System.out.println("Awesome Password");
	else if (strong(passw) == true)
		System.out.println("Strong Password");
	else
		System.out.println("Invalid Password");

	}
	}
