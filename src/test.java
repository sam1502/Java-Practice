import java.util.Scanner;

import java.util.Random;

public class test

{

public static void main(String [] args)

{

Scanner in = new Scanner(System.in);

Random random = new Random();

int choice;

int passLength;

int num1 = 0;

char character;

String password = "";

System.out.println(" Password Generation Menu ");

System.out.println("*****************************************************************************");

System.out.println("* [1] Lowercase Letters *");

System.out.println("* [2] Lowercase Letters & Uppercase Letters *");

System.out.println("* [3] Lowercase Letters, Uppercase Letters, and Numbers *");

System.out.println("* [4] All keyboard symbols *");

System.out.println("* [5] Quit *");

System.out.println("*****************************************************************************");

System.out.print("\n\nEnter choice (1-5): ");

choice = in.nextInt();

System.out.print("Password Length (1-14): ");

passLength = in.nextInt();

while(password.length() < passLength)

{

if(choice == 1){

num1 = random.nextInt(122-97) + 97;

character = (char)num1;

String charString = Character.toString(character);

password += charString;

}

else if(choice == 2){

num1 = random.nextInt(122-65) + 65;

if((num1 > 97 && num1 < 122) || (num1 > 65 && num1 < 90))

{

character = (char)num1;

String charString = Character.toString(character);

password += charString;

}

}

else if(choice == 3)

{

num1 = random.nextInt(122-48) + 48;

if((num1 < 57) || (num1 > 65 && num1 < 90) || (num1 > 97 && num1 < 122))

{

character = (char)num1;

String charString = Character.toString(character);

password += charString;

}

else if(choice == 4)

{

num1 = random.nextInt(126-33) + 33;

if(num1 > 33 || num1 < 126)

{

character = (char)num1;

String charString = Character.toString(character);

password += charString;

}

else

{

System.out.println("Good bye! Thank you for visiting!");

}

System.out.print("\nPassword: " + password);

}

}

}

}

}