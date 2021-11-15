package Lab_6_.Lab_6;

import java.io.*;
import java.util.Scanner;

public class Question_4 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        try {
            BufferedReader advice = new BufferedReader(new FileReader("/Users/robeilaregawi/Desktop/CS203Course/src/Lab_6_/Lab_6/File/advice.txt"));

           /* while (true) {
                String newAdvice = advice.readLine();
                if (newAdvice == null) {
                    break;
                }
                System.out.println(newAdvice);
            }*/
            String savingAdvice = "";
            System.out.println(savingAdvice);
            System.out.println("Do you want to tell more advice to write down");

            while (true) {
                String userAdvice = userInput.nextLine();

                if (userAdvice.isEmpty() || userAdvice.isBlank()) {
                    break;
                }
                savingAdvice += userAdvice + "\n";

            }
            PrintWriter writingAdvice = new PrintWriter(new FileOutputStream("/Users/robeilaregawi/Desktop/CS203Course/File/Input&Otput.txt"));
            BufferedWriter buff = new BufferedWriter(new FileWriter("/Users/robeilaregawi/Desktop/CS203Course/src/Lab_6_/Lab_6/File/advice.txt"));

            buff.write(savingAdvice);

            buff.close();
            writingAdvice.close();
            advice.close();
            userInput.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
