
import java.util.*;

public class hangmanSolver {
	public static void main(String[] args) {
		// oyun giriþ ekraný
		System.out.println("*******************************");
		System.out.println("         H-A-N-G-M-A-N");
		System.out.println("");
		System.out.println("- Press 1 to start");
		System.out.println("- Press 2 for language settings");
		System.out.println("- Press 3 to exit");
		System.out.println("*******************************");

		// hangi iþlemin seçileceðini belirleme
		System.out.println("\nEnter your choice: ");
		Scanner keyboard = new Scanner(System.in);
		int choiceNumber = keyboard.nextInt();

		// oyuna giriþ çýkýþ dil ve score görmek için if else kullanýmý
		if (choiceNumber == 1) {
			// oyuna giriþ
			System.out.println("Enter the word to guess: ");
			String guessingWord = keyboard.next();
			String[] guessArray = new String[] { guessingWord };
			int countEnglish = guessingWord.length();

			char[] CharArr = guessingWord.toCharArray();
			char[] starArr = guessingWord.toCharArray();

			System.out.print("Mystery word: ");
			// '*' þeklinde yazdýrma
			for (int i = 0; i < starArr.length; i++) {
				starArr[i] = '*';
				System.out.print(starArr[i]);

			}
			System.out.println("");
			for (int i = 1; i <= 5; i++) {
				System.out.println("\nGuess a letter: ");
				char letterWord = keyboard.next().charAt(0);

				for (int j = 0; j < CharArr.length; j++) {
					if (letterWord == starArr[j]) {
						System.out.println("(ERROR) This word already exist");
						System.out.println("As per the rules, the man continues to be hanged for the repeated letter.");
					} else {
						if (letterWord == CharArr[j]) {
							starArr[j] = letterWord;
							i--;
							System.out.printf("CORRECT GUESS!\n");
						}
					}

				}
				
				System.out.print(starArr);
				switch (i) {
				case 1:
					System.out.println("");
					System.err.printf("\n*****\n");
					System.out.println("Remaining try: 4");
					break;
				case 2:
					System.out.println("");
					System.err.printf("\n*****\n  |\n");
					System.out.println("Remaining try: 3");
					break;
				case 3:
					System.out.println("");
					System.err.printf("\n*****\n  |\n ***\n*   *\n ***\n");
					System.out.println("Remaining try: 2");
					break;
				case 4:
					System.out.println("");
					System.err.printf("\n*****\n  |\n ***\n*   *\n ***\n  |\n *|*\n* | *\n");
					System.out.println("Remaining try: 1");
					break;
				case 5:
					System.out.println("");
					System.err.printf("\n*****\n  |\n ***\n*   *\n ***\n  |\n *|*\n* | *\n * *\n*   *\n");
					System.err.printf("You lose...\n");
					break;
				}
				System.out.printf("\n");
				if ((new String(guessingWord)).equals(new String(starArr))) {
					System.err.printf("You win this game\n");
					System.out.println("Would you like to see your score ?\nif you want; press 1");
					int c = keyboard.nextInt();
					if (1 == c) {
						countEnglish = (100 * countEnglish) - (i * 50);
						System.out.println("Every right guess has +100 point, every wrong guess has -50 point.");
						System.out.println("");
						System.out.println("*******************************");
						System.out.println("         H-A-N-G-M-A-N");
						System.out.println("");
						System.out.println("          Your Score");
						System.out.println("              " + countEnglish);
						System.out.println("*******************************");
					} else {
						System.out.println("Wrong attempt");
					}

					break;
				}

			}

		} else if (choiceNumber == 2) {
			System.out.println("*******************************");
			System.out.println("         H-A-N-G-M-A-N");
			System.out.println("");
			System.out.println("- Select Language");
			System.out.println("- Türkçe oynamak için 1'ye basýn");
			System.out.println("- Restart the game to play in English");
			System.out.println("*******************************");
			int languageNumber = keyboard.nextInt();
			// oyuna giriþ
			System.out.println("Tahmin edilecek kelimeyi girin: ");
			String guessingWord = keyboard.next();
			String[] guessArray = new String[] { guessingWord };
			int countTürkçe = guessingWord.length();

			char[] CharArr = guessingWord.toCharArray();
			char[] starArr = guessingWord.toCharArray();

			System.out.print("Gizemli kelime: ");
			// '*' þeklinde yazdýrma
			for (int i = 0; i < starArr.length; i++) {
				starArr[i] = '*';
				System.out.print(starArr[i]);

			}
			System.out.println("");
			for (int i = 1; i <= 5; i++) {
				System.out.println("\nHarf girin: ");
				char letterWord = keyboard.next().charAt(0);

				for (int j = 0; j < CharArr.length; j++) {
					if (letterWord == starArr[j]) {
						System.out.println("(HATA) Bu harf önceden girilmiþ");
						System.out.println("Kurallar gereði tekrar edilen harf için adam asýlmaya devam eder.");
					} else {
						if (letterWord == CharArr[j]) {
							starArr[j] = letterWord;
							i--;
							System.out.printf("Doðru cevap!\n");
						}
					}

				}
				// ***** 5 adet yap exeptionlarý
				System.out.print(starArr);
				switch (i) {
				case 1:
					System.out.println("");
					System.err.printf("\n*****\n");
					System.out.println("Kalan deneme hakký: 4");
					break;
				case 2:
					System.out.println("");
					System.err.printf("\n*****\n  |\n");
					System.out.println("Kalan deneme hakký: 3");
					break;
				case 3:
					System.out.println("");
					System.err.printf("\n*****\n  |\n ***\n*   *\n ***\n");
					System.out.println("Kalan deneme hakký: 2");
					break;
				case 4:
					System.out.println("");
					System.err.printf("\n*****\n  |\n ***\n*   *\n ***\n  |\n *|*\n* | *\n");
					System.out.println("Kalan deneme hakký: 1");
					break;
				case 5:
					System.out.println("");
					System.err.printf("\n*****\n  |\n ***\n*   *\n ***\n  |\n *|*\n* | *\n * *\n*   *\n");
					System.err.printf("Kaybettiniz...\n");
					break;
				}
				System.out.printf("\n");
				if ((new String(guessingWord)).equals(new String(starArr))) {
					System.err.printf("Oyunu kazandýnýz\n");
					System.out.println("Skorunuzu görmek ister misiniz ?\nGörüntülemek isterseniz 1'e basýn");
					int c = keyboard.nextInt();
					if (1 == c) {
						countTürkçe = (100 * countTürkçe) - (i * 50);
						System.out
								.println("Her doðru cevap için +100 puan, her yanlýþ cevap için -50 puan hesaplanýr.");
						System.out.println("");
						System.out.println("*******************************");
						System.out.println("         H-A-N-G-M-A-N");
						System.out.println("");
						System.out.println("           Skorunuz");
						System.out.println("              " + countTürkçe);
						System.out.println("*******************************");
					} else {
						System.out.println("Yanlýþ komut girdiniz, lütfen tekrar deneyiniz...");
					}

					break;
				}

			}

		} else if (choiceNumber == 3) {
			// oyundan çýkma
			System.out.println("Exiting the game");
			System.exit(0);
		} else {
			// yanlýþ seçenek giriliþi
			System.out.println("Wrong operation number, please try again...");
		}

	}
}