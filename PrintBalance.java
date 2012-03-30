import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


/**
 * TODO A simple class that needs to be localized
 *
 * @author mohan.
 *         Created Mar 27, 2011.
 */
public class PrintBalance{
	
	/**
	 * Simple Java Method that is crying out to be localized.
	 *
	 * @param args
	 */
	public static void main(String args[])
	{
		String Language;
		String Country;
		
		ResourceBundle messages;
		Locale currentLocale;
		currentLocale = new Locale("fr","FR");
		//currentLocale = new Locale("us","US");
		//currentLocale = new Locale("de","DE");
		
		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		
		Scanner scanInput = new Scanner(System.in);
		Date today = new Date();
		
		//Greeting
		System.out.println(messages.getString("greeting"));
		
		//Get User's Name
		System.out.println(messages.getString("namePrompt"));
		String name = scanInput.nextLine();
		System.out.println(messages.getString("nameResponse") + " " + name);
		//print today's date, balance and bid goodbye
		System.out.println(messages.getString("datePrompt")+ " "+ DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT,currentLocale).format(today));
		System.out.println(messages.getString("owe") + " " + NumberFormat.getCurrencyInstance(currentLocale).format(9876543.21));
		System.out.println(messages.getString("farewell"));
	}

}
