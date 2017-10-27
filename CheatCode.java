/**
 * @(#)Solutions.java
 *
 * Solutions application
 *
 * @author Henrhod Y. Pis-o
 * @version 1.00 2017/10/26
 */

import java.util.*;

public class CheatCode {

	//1. Anton and Danik - April
	public static void antonAndDanik (int n, String s) {
		int a=0,d=0;
        for( char x : s.toCharArray()){
            if(x=='D'){
                d++;
            }
            else {
                a++;
        	}
        }
        if (a>d) {
            System.out.println("Anton");
        } else if (d>a) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
	}

	//2. Bear and Big Brother - Yves
	public static void bearAndBigBrother (int a, int b) {
		int counter = 0;
        while(a <= b){
            a *= 3;
            b *= 2;
            counter++;
        }
        System.out.println(counter);
	}

	//3. Compote - Meh
	public static void compote (int a, int b, int c) {
		int numA = a;
		int numB = b/2;
		int numC = c/4;
		int min = Integer.min(numA, Integer.min(numC, numB));
		System.out.println(7*min);
	}

	//4. Hluk - Ervs
	public static void hulk (int n) {
		for(int i=1; i<=n; i++){
			if(i%2==0){
				System.out.print("I love");
			} else{
				System.out.print("I hate");
			}
			if (n == i){
				System.out.println(" it ");
				break;
			} else{
				System.out.print(" that ");
			}
		}
	}

	//5. Numbers Joke - Yvonne
	public static void numbersJoke (int a) {
		int []b={4,22,27,58,85,94,121,166,202,265,274,319,346,355,378,382,391,438,454,483,517,526,535,562,576,588,627,634,636,645,648,654};
		System.out.println(b[a-1]);
	}

	//6. Shell Game - Jemz
	public static void shellGame (double operatorMoves, double finalPosition) {
		double temp = 0;
        int a = (int)finalPosition + 1;
        if(operatorMoves % 2 != 0){

            switch(a){
                case 1 : temp = (operatorMoves * 2 - 1) % 3;break;
                case 2 : temp = (operatorMoves * 2 + 1) % 3;break;
                case 3 : temp = (operatorMoves * 2 ) % 3;break;
            }

        }else if(operatorMoves % 2 == 0){
            switch(a){
                case 1 : temp = (operatorMoves * 2) % 3;break;
                case 2 : temp = (operatorMoves * 2 + 1) % 3;break;
                case 3 : temp = (operatorMoves * 2 - 1) % 3;break;
            }
        }
        System.out.println((int)temp);

	}

	//7. The New Year: Meeting New Friends - Luke
	public static void newYear (int a, int b, int c) {
		int [] array = {a,b,c};
        Arrays.sort(array);
        System.out.println(array[2] - array[0]);
	}

    //8. Vitya In The Countryside - Drev
    public static void vitya (int n, int[] a) {

		if (a[n - 1] == 15)
			System.out.println("DOWN");

		else if (a[n - 1] == 0)
			System.out.println("UP");

		else if (n == 1)
			System.out.println(-1);

		else if (a[n - 1] < a[n - 2])
			System.out.println("DOWN");

		else
			System.out.println("UP");
    }

    public static void main(String[] args) {
    	Scanner kbd = new Scanner(System.in);
    	boolean flag=true;
    	while(flag){
		System.out.println("LET'S PLAY! Choose the corresponding number of the game you want to play.");
		System.out.print("Enter the number of your choice: ");
		int choice = kbd.nextInt();
		switch (choice) {
			case 1: //Anton and Danik
				System.out.print("Enter number of games: ");
				int numberOfGames = kbd.nextInt();
				System.out.print("Enter string: ");
				kbd.nextLine();
				String stringCap = kbd.nextLine();
				antonAndDanik(numberOfGames,stringCap);
				break;
			case 2: //Bear and Big Brother
				System.out.print("Enter weight of A: ");
				int weightA = kbd.nextInt();
				System.out.print("Enter weight of B: ");
				int weightB = kbd.nextInt();
				bearAndBigBrother(weightA, weightB);
				break;
			case 3: //Compote
				System.out.print("Enter lemon: ");
				int lemon = kbd.nextInt();
				System.out.print("Enter apple: ");
				int apple = kbd.nextInt();
				System.out.print("Enter pear: ");
				int pear = kbd.nextInt();
				compote(lemon, apple, pear);
				break;
			case 4: //Hulk
				System.out.print("Enter input: ");
				int input = kbd.nextInt();
				hulk(input);
				break;
			case 5:	 //Numbers Joke
				System.out.print("Enter a number: ");
				int number=kbd.nextInt();
				numbersJoke(number);
				break;
			case 6: //Shell Game
				System.out.print("Enter operator moves: ");
				double operatorMoves = kbd.nextDouble();
				System.out.print("Enter the final position: ");
        		double finalPosition = kbd.nextDouble();
        		shellGame(operatorMoves, finalPosition);
        		break;
			case 7: //The New Year: Meeting New Friends
				System.out.print("Enter first number: ");
				int a = kbd.nextInt();
				System.out.print("Enter second number: ");
				int b = kbd.nextInt();
				System.out.print("Enter third number: ");
				int c = kbd.nextInt();
				int [] array = {a,b,c};
				newYear(a,b,c);
				break;
			case 8:
				System.out.print("Enter a number: ");
				int vityaN = kbd.nextInt();
				System.out.println("Enter numbers: ");
				int[] vityaA = new int[93];
				for(int i=0; i<vityaN;i++){
					System.out.print(i+1 +". ");
    				vityaA[i] = kbd.nextInt();
    			}
				vitya(vityaN,vityaA);
				break;
			default:
				System.out.println("Invalid input.");
				break;
		}
			//IF STATEMENT
			System.out.print("Do you still want to continue? Y/N: ");
			kbd.nextLine();
			String continueGame = kbd.nextLine();
			if(continueGame.equalsIgnoreCase("Y")){
				//loop again
			} else {
				flag=false;
			}
		}
    }
}
