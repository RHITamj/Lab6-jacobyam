import static org.junit.Assert.*;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;


public class PrintBalanceTest {
	
	@Test
	public void testFrenchProperties(){
		ResourceBundle messages;
		Locale currentLocale;
		
		currentLocale = new Locale("fr","FR");
		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		
		//Check language statements
		assertEquals("Bonjour tout le monde",messages.getString("greeting"));
		assertEquals("S'il vous plaît entrer votre nom",messages.getString("namePrompt"));
		assertEquals("Je suis heureux de vous rencontrer",messages.getString("nameResponse"));
		assertEquals("En date du:",messages.getString("datePrompt"));
		assertEquals("Vous devez l'école",messages.getString("owe"));
		assertEquals("Au revoir!",messages.getString("farewell"));
		
		//Check currency statement
		assertEquals("9 876 543,21 €",NumberFormat.getCurrencyInstance(currentLocale).format(9876543.21));
		
	}
	
	@Test
	public void testGermanProperties(){
		ResourceBundle messages;
		Locale currentLocale;
		
		currentLocale = new Locale("de","DE");
		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		
		//Check language statements
		assertEquals("Hallo an alle",messages.getString("greeting"));
		assertEquals("Bitte geben Sie Ihren Namen",messages.getString("namePrompt"));
		assertEquals("Ich freue mich, Sie kennen zu lernen",messages.getString("nameResponse"));
		assertEquals("Ab:",messages.getString("datePrompt"));
		assertEquals("Sie müssen zur Schule",messages.getString("owe"));
		assertEquals("Auf Wiedersehen",messages.getString("farewell"));
		
		//Check currency statement
		assertEquals("9.876.543,21 €",NumberFormat.getCurrencyInstance(currentLocale).format(9876543.21));
	}
	
	@Test
	public void testAmericanEnglishProperties(){
		ResourceBundle messages;
		Locale currentLocale;
		
		currentLocale = new Locale("us","US");
		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		
		//Check language statements
		assertEquals("Hello World",messages.getString("greeting"));
		assertEquals("Please enter your name",messages.getString("namePrompt"));
		assertEquals("I am pleased to meet you",messages.getString("nameResponse"));
		assertEquals("As of:",messages.getString("datePrompt"));
		assertEquals("You owe the school",messages.getString("owe"));
		assertEquals("Good Bye!",messages.getString("farewell"));
		
		//Check currency statement
		assertEquals("USD 9,876,543.21",NumberFormat.getCurrencyInstance(currentLocale).format(9876543.21));
	}
	
}
