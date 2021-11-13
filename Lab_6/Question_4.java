package Lab_6_.Lab_6;

import java.io.*;
import java.util.Scanner;

public class Question_4 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        try {

            BufferedReader advice = new BufferedReader(new FileReader("/Users/robeilaregawi/Desktop/CS203Course/src/Lab_6_/Lab_6/File/advice"));

            while (true) {

                String newAdvice = advice.readLine();
                if (newAdvice == null) {
                    break;
                }
                System.out.println(newAdvice);

            }
            System.out.println("Do you want to tell more advice to write down");
            String savingAdvice = "";
            while (true) {
                String userAdvice = userInput.nextLine();

                if (userAdvice.isEmpty()) {
                    break;
                }
                savingAdvice += userAdvice + "\n";

            }
            PrintWriter writingAdvice = new PrintWriter(new FileOutputStream("/Users/robeilaregawi/Desktop/CS203Course/File/Input&Otput.txt"));
            writingAdvice.println(savingAdvice);
            advice.close();
            writingAdvice.close();
            userInput.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
