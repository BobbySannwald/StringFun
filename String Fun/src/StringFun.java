import java.util.Scanner;

public class StringFun
	{

		public static void main(String[] args)
			{
				insideVoice();
				verticalLetters();
				countVowels();
			}
		
		public static void insideVoice()
		{
			Scanner userInput = new Scanner (System.in);
			System.out.println("Pleas enter a phrase.");
			String phrase = userInput.nextLine();
			System.out.print(phrase.substring(0,1));
			System.out.print(phrase.substring(1).toLowerCase());
		}

		public static void verticalLetters()
			{
				Scanner userInput = new Scanner (System.in);
				System.out.println("Please enter a phrase.");
				String phrase = userInput.nextLine();
				
				for(int i = 0; i < phrase.length(); i++)
					{
						System.out.println(phrase.substring(i, i+1));
					}
			}
		public static void countVowels()
		{
			Scanner userInput = new Scanner (System.in);
			System.out.println("Please type a sentance.");
			String sentence = userInput.nextLine();
				
			        int counter = 0;
					for(int i = 0; i < sentence.length(); i ++)
						{
						switch(sentence.substring(i,i+1))
						{ 
						case "a":
						case "e":
						case "i":
						case "o":
						case "u":
						case "y":
							{
							counter ++;	
							}
						}
				        }
				System.out.println("The number of vowels in your sentance is " + counter);
		}
	}
