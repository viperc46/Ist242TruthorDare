/*
*SOURCES
https://truthdarequestions.com/truth-or-dare-questions-for-everyone/9/#Truth-or-Dare-Questions-for-College-Students
https://truthdarequestions.com/truth-or-dare-questions-for-everyone/11/#Truth-or-Dare-Questions-for-Friendzoned-People
https://truthdarequestions.com/truth-or-dare-questions-for-everyone/7/#Truth-or-Dare-Questions-for-Teenagers
https://truthdarequestions.com/120-clean-truth-or-dare-questions-for-adults-couples-and-kids/
*/

import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter; 
import java.util.Random;

class Truthordare 
{

	
	
	
	 //the truth database
	 truthArray[0] = "Have you ever try to steal your college computer system parts?";
	 truthArray[1] = "How many times have you cried in the swimming pool?";
	 truthArray[2] = "Do you like to party with your professor or teacher?";
	 truthArray[3] = "What’s your opinion on love at first sight?";
	 truthArray[4] = "Have you ever had a crush on anyone?";
	 truthArray[5] = "Have you ever propose in campus/ library?";
	 truthArray[6] = "How many times do you watch a r-rated movie without your parents knowing?";
	 truthArray[7] = "Have you ever hurt someone without their making a mistake first?";
	 truthArray[8] = "Have you ever watched a boring movie with your best friend?";
	 truthArray[9] = "Which celebrity would you like to take a selfie with?";
	 truthArray[10] = "Have you ever worn same socks for more than 5 days without washing them?";
	 truthArray[11] = "Have you ever tried to eat plenty of chips in a single day?";
	 truthArray[12] = "Who is your favorite celebrity? Why do you like him/her most?";
	 truthArray[13] = "Do you ever try to solve the problems between your best friend and his/her crush?";
	 truthArray[14] = "Do you ever apply makeup without using the mirror?";			 
	 truthArray[15] = "Have you ever admired your best friend if he/she get good marks in the examination?";							
	 truthArray[16] = "Have you ever try to sing tongue twister in a musical way?";							
	 truthArray[17] = "Tell me your weirdest habit?";								
	 truthArray[18] = "Do you like parties?";								
	 truthArray[19] = "Do you have crush on any of your school teacher?";
	 truthArray[20] = "Who is the most annoying person among your friends?";							
	 truthArray[21] = "Do you go directly to your home after completion of your college in evening?";								
	 truthArray[22] = "How many boyfriends/girlfriends do you have?";								
	 truthArray[23] = "Suppose you were a billionaire, how will you spend your time?";
	 truthArray[24] = "If your parents forced you to leave home, where would you go?";
	 truthArray[25] = "If you want to start your own business, what it would be?";
	 truthArray[26] = "If money didn’t matter, what would be your dream job?";
     truthArray[27] = "At which situation makes you cry immediately after laugh?";
     truthArray[28] = "How many concerts you’ve attended till now?";
     truthArray[29] = "Do you have any favorite memory in this past summer?";
     truthArray[30] = "What is the last awkward situation you found yourself?";
     truthArray[31] = "Jewelry that you’re wearing now is yours?";
     truthArray[32] = "How many pending friend requests do you have?";
     truthArray[33] = "How many Christmas gifts you’ve taken up to now?";
     truthArray[34] = "What are the first ten songs to play on your playlist?";
     truthArray[35] = "What is your most funny experience?";
	 truthArray[36] = "What is the cutest thing someone has done for you?";
	 truthArray[37] = "Do you feel I’m the hardest person you’ve ever met?";
	 truthArray[38] = "Do you really know the lyrics of your favorite song?";
	 truthArray[39] = "Have you ever tried to get the first rank in your class?";
	 truthArray[40] = "How many times you self-motivated yourself?";
	 truthArray[41] = "What is the most beautiful picture you’ve ever taken?";
	 truthArray[42] = "How many times did you lie to your friends which hurts them?";
	 truthArray[43] = "Which type of opposite gender dresses would you like to wear?";
	 truthArray[44] = "Have you ever try to steal any costly thing from your friend’s bag?";
	 truthArray[45] = "How many times do you take your bath in a day?";
	 truthArray[46] = "Have you ever tried to blame others even though that mistake is yours?";
	 truthArray[47] = "What is that one thing, your friends always think about you which is totally wrong?";
	 truthArray[48] = "How many times did you cheat your friends?";
     truthArray[49] = "What was the most embarrassing thing that happened to you at your best friend’s wedding?";
     truthArray[50] = "How often do you pray to god for your needs?";
     truthArray[51] = "Have you ever feel disappointed for your marks in final examinations?";
     truthArray[52] = "What is that one thing you’ll never share with your friends?";
     truthArray[53] = "What is the most horror video you saw on YouTube?";
     truthArray[54] = "Do you really trust your parent’s decision?";
     truthArray[55] = "How often you say I Love You to your crush?";
     truthArray[56] = "If someone made a film about your life, which title would you like to give that movie?";
     truthArray[57] = "Have you ever tried to kiss your crush in public place?";
     truthArray[58] = "What was the funniest thing that happened to you at a shopping mall?";
     truthArray[59] = "Have you ever tried to cook something new dish and failed?";
     truthArray[60] = "Which one of your best friend’s crush has the perfect body shapes?";
     truthArray[61] = "What is the funniest movie you’ve ever watched?";
     truthArray[62] = "Do you want to continue your studies along with your job?";
     truthArray[63] = "What are the five things you wish to have with you in your future?";
     truthArray[64] = "Which type of songs did you hear most?";
     truthArray[65] = "What is that one thing you want to do now with your crush?";
     truthArray[66] = "Have you ever felt bad about your height and weight?";
     truthArray[67] = "What is the funniest habit you have?";
     truthArray[68] = "If you have one option to choose either making out or $1 million, which one would you pick?";
     truthArray[69] = "What are your career plans for your future?";
     truthArray[70] = "What kinds of thoughts are running through your mind about your crush?";							
	 truthArray[71] = "How often do you play music with your lunch box and spoon?";
	 truthArray[72] = "What are the five things that you like most about you?";
	 truthArray[73] = "Have you ever slipped in the bathroom?";
	 truthArray[74] = "What is that person’s name who have you loved, but they did not love you back?";
	 truthArray[75] = "What is that person’s name who have you loved, but they did not love you back?";
	 truthArray[76] = "How many times you tried to kiss your crush but failed?";
	 truthArray[77] = "Have you ever demanded money from your grandparents?";
	 truthArray[78] = "What is the ugliest place you’ve ever peed?";
	 truthArray[79] = "Who is that person you want to know all their secrets?";
	 truthArray[80] = "What is the most embarrassing post you posted on your Facebook or Whatsapp?";
	 truthArray[81] = "Have you ever refused to wear inner when you’re in childhood?";
     truthArray[82] = "What is the most embarrassing thing you did in front of your parents?";
	 truthArray[83] = "Which secret of yours would you like to share with your friends immediately?";
     truthArray[84] = "What is the most embarrassing time you farted?";
	 truthArray[85] = "Why did you break up with your last crush?";
	 truthArray[86] = "What are the most embarrassing things you always keep with you?";
	 truthArray[87] = "Have you ever did naughty things with your crush in your dreams?";
	 truthArray[88] = "What is that one terrible thing you did to cover your lie?";
	 truthArray[89] = "At what age you stopped peeing in your bed?";
	 truthArray[90] = "What is the biggest lie you told to your parents but get caught?";
	 truthArray[91] = "Have you ever try to do horrible things?";
	 truthArray[92] = "Who is the sexiest person you always wanted to meet?";								
	 truthArray[93] = "What is the costliest thing you had with you now?";							
	 truthArray[94] = "What is the weirdest joke you’ve ever played on your friend?";								
	 truthArray[95] = "Have you ever did wrong to your friends but he/she didn’t notice it till now?";								
	 truthArray[96] = "Who is the last person saw you while you’re without cloths?";								
	 truthArray[97] = "What is the delicious item you’ve ever eaten in your entire life?";								
	 truthArray[98] = "What is the embarrassing nickname you’ve ever given to your best friend?";								
	 truthArray[99] = "Have you ever wanted to see someone over 60 without clothes?";	
	 
	 //the dare database
	 dareArray[0] = "Purpose to someone in front of your teachers. ";
	 dareArray[1] = "Sing and dedicate a song to your crush in front of your friends. ";
	 dareArray[2] = "Say “I Love You” in 10 different languages. ";
	 dareArray[3] = "Dance in front of your teacher for 2 minutes. ";
	 dareArray[4] = "Do and explain any 5 yoga postures. ";
	 dareArray[5] = "Dip all your fingers in sauce and clean them without tissue and water. ";
	 dareArray[6] = "Call to any teacher in your college. ";
	 dareArray[7] = "Sit on your friend’s lap for one hour in your classroom. ";
	 dareArray[8] = "Stare at the next person who enters into the classroom for 2 minutes. ";
	 dareArray[9] = "Do any 5 gymnastic poses in your college classroom. ";
	 dareArray[10] = "Sing a sad song in a funny way.";
	 dareArray[11] = "Eat any two of your best friends lunch boxes. ";
	 dareArray[12] = "Do a funny dance in front of your friends and make them laugh. ";
	 dareArray[13] = "Praise a boy/girl in your class without mentioning his/her name. ";
	 dareArray[14] = "Break one egg on your head. ";
	 dareArray[15] = "Call someone and say nothing. ";
	 dareArray[16] = "Purpose to someone of your same gender. ";
	 dareArray[17] = "Write my name in your WhatsApp status for one day ";
	 dareArray[18] = "Send me a picture from your childhood. ";
	 dareArray[19] = "Put some powder on your hand and smack the person sitting beside you. ";
	 dareArray[20] = "Hug any tree near you. ";
	 dareArray[21] = "Write any Facebook status using your elbows and post it. ";
	 dareArray[22] = "Send a text message to your crush. ";
	 dareArray[23] = "Select any one thing in front of us and explain that item past, present and future. ";
	 dareArray[24] = "Fill tank by bike or car. ";
	 dareArray[25] = "Play football with me for 2 hours. ";
	 dareArray[26] = "Run for 2 minutes and sing a rap song. ";
	 dareArray[27] = "Do something that you haven’t done it yet? ";
	 dareArray[28] = "Explain what does your last received text message say? ";
	 dareArray[29] = "Do anything until your nearby people laugh loudly? ";
	 dareArray[30] = "Act like a dog. ";
	 dareArray[31] = "Book movie tickets and sell it to anyone near theater. ";
	 dareArray[32] = "Do conversation with a stranger? ";
	 dareArray[33] = "Act like your favorite animal and makes us laugh. ";
	 dareArray[34] = "Explain your favorite memory? ";
	 dareArray[35] = "Go to the toilet without closing doors? ";
	 dareArray[36] = "Explain the biggest regret you have in your life? ";
	 dareArray[37] = "Send a gif to describe how you feel right now. ";
	 dareArray[38] = "Write a quote about your life and send it to all your friends. ";
	 dareArray[39] = "Ask toilet paper to a stranger? ";
	 dareArray[40] = "Do any craziest thing that you haven’t done it yet? ";
	 dareArray[41] = "Act like your mother when she was pregnant. ";
	 dareArray[42] = "Stand on your toes for 5 seconds. ";
	 dareArray[43] = "Wear your pants and shirt blindfolded. ";
	 dareArray[44] = "Roar like a cat and dog. ";
	 dareArray[45] = "Make a prank call to your grandmother and ask money for your needs. ";
	 dareArray[46] = "Act like you slipped on a banana peel." ;
	 dareArray[47] = "Go to your house terras and say “Happy Married Life” as loud as you can. ";
	 dareArray[48] = "Lick three ice cubes until they melt. ";
	 dareArray[49] = "Sniff any one of your friend’s mouth. ";
	 dareArray[50] = "Keep your favorite dress under your foot for ten minutes and wear it. ";
	 dareArray[51] = "Open your mouth as wide as you can. ";
	 dareArray[52] = "Eat three boiled eggs at a time. ";
	 dareArray[53] = "Eat five hot chilly peppers at a time without drinking water. ";
	 dareArray[54] = "Wear your socks to your hands for 10 minutes and smell your hands. ";
	 dareArray[55] = "Spin around 30 times blindfolded and do back walk. "; 
	 dareArray[56] = "Wash your hair using dish wash soap. ";
	 dareArray[57] = "Place three glasses on your head for three minutes without touching them. ";
	 dareArray[58] = "Rub your friend’s toes using yours for two minutes. ";
	 dareArray[59] = "Allow someone to close your nose for one minute. ";
	 dareArray[60] = "Imagine broomstick as your crush and do a romantic conversation with it. ";
	 dareArray[61] = "For the next 10 minutes, sing your favorite songs. ";
	 dareArray[62] = "Start your sentence with the word “What the Hell” for next 5 minutes. ";
	 dareArray[63] = "Try to eat some food without touching it. ";
	 dareArray[64] = "Use your comb as a microphone and sing any romantic song. ";
	 dareArray[65] = "Walk like a robot for two minutes. ";
	 dareArray[66] = "Dip your entire clothes in water and wear them for entire day. ";
	 dareArray[67] = "Try not to blink your eyes for 40 seconds. ";
	 dareArray[68] = "While talking for next 5 minutes, start every sentence with “I’ll kick you if you don’t hear my words”. ";
	 dareArray[69] = "Remove any one of your friend’s socks and wear it on your head. ";
	 dareArray[70] = "Laugh as loud as you can. ";
	 dareArray[71] = "Do 10 jumping jacks. ";
	 dareArray[72] = "Remove your socks and shirt with no hands. ";
	 dareArray[73] = "Make sounds like a lizard for next 10 minutes. ";
	 dareArray[74] = "Do your favorite animal impression for 2 minutes. ";
	 dareArray[75] = "Give high five to everyone for 2 minutes. ";
	 dareArray[76] = "Using your armpits make fart sounds. ";
	 dareArray[77] = "Dance to your favorite dance for 5 minutes. ";
	 dareArray[78] = "Do 5 cartwheels in a row. ";
	 dareArray[79] = "Give your piggyback to someone for one entire day. ";
	 dareArray[80] = "Lift someone using your legs." ;
	 dareArray[81] = "Act how you react in front of the dead body. ";
	 dareArray[82] = "Pour sauce on your friend’s left hand and lick it. ";
	 dareArray[83] = "Let someone shave on any part of your body. ";
	 dareArray[84] = "Lick one drop of hair oil. ";
	 dareArray[85] = "Ask someone to open your pants zip when you’re in public toilet. ";
	 dareArray[86] = "Bite your toenails using your teeth. ";
	 dareArray[87] = "Place your lips on three ice cubes until they melt out. ";
	 dareArray[88] = "Act like an earthworm. ";
	 dareArray[89] = "Act like someone’s pet and eat whatever they feed you. ";
	 dareArray[90] = "Snake dance for 2 minutes. ";
	 dareArray[91] = "Ask someone to make fun of you. ";
	 dareArray[92] = "Show your expressions, if you’re in the burial ground at midnight. ";
	 dareArray[93] = "Perform any magic trick you know. ";
	 dareArray[94] = "Remove any one of your friend’s shoe laces with your teeth. ";
	 dareArray[95] = "Imitate your favorite comedian until your friends laugh loudly. ";
	 dareArray[96] = "Slap yourself as loud as you can. ";
	 dareArray[97] = "Go and stand in front of your mirror and split yourself. ";
	 dareArray[98] = "Keep five ice cubes in your pant pockets and run until they melt. ";
	 dareArray[99] = "Watch all your liked videos on YouTube two times continuously.";
	 
	
     public static void main(String[] args)
	 {
		final int RANGE = 100;
		String[] truthArray = new String[RANGE];
		String[] dareArray = new String[RANGE]; 
		Scanner readInput = new Scanner(System.in);
		String userInput = readInput.next();
		String Continue = readInput.nextLine();
		Random rand = new Random();
		int randomDigit;
		randomDigit = rand.nextInt(100);
	 
	 
	 
		do
		{
		  System.out.println("Hello, This is a game of truth or dare. Press T for truth or D for dare and hit enter. Haven fun!\n");  
		  if(userInput == "T" || userInput == "t")
		  {
			 System.out.println( truthArray[randomDigit] );
		  }
		  if(userInput == "D" || userInput == "d")
		  {
			 System.out.println( dareArray[randomDigit] );
		  }
		  else if(userInput != "T" || userInput != "t" || userInput != "D" || userInput != "d" )
		  {
			  System.out.println("Incorrect Input!");
		  }
		  System.out.println("Do you want to do another truth or dare?\n Y or N");
		}
	    while(Continue != "N" || Continue !=  "n");
	
	
	
	 }
	 
}	 
	 
 

	

			
	
