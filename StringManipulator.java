import java.util.Scanner;

/**
 * 
 * @author Ewan Brooks
 *
 */
public class StringManipulator 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String name;
		name = keyboard.nextLine();
		System.out.println("Hello " + name + " and welcome to the String Manipulator.");
		System.out.println("Please click enter to continue...");
		keyboard.nextLine();
		System.out.println("Please enter any string: "); 
		
		String str = keyboard.nextLine();
		int strLength = str.length();
		System.out.print(strLength);
		
		
		

	}

}
