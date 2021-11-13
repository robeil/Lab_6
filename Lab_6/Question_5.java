package Lab_6_.Lab_6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Question_5 {


    public static boolean reverseString(String temp) {
        String tempStr = "";
        for (int i = temp.length() -1; i >= 0; i--) {
            tempStr += temp.charAt(i);
        }

        if (temp.equals(tempStr)) {
            return true;
        } else {
            return false;
        }
    }

    public static int reverseArray(String[] palArray) {

        String paliWord = "";
        int counter = 0;
        boolean isPalindrome = false;
        //iterating the array
        for (int i = 0; i < palArray.length; i++) {
            //storing and replace every word from the array
            String temp = palArray[i];

            if (reverseString(temp) == true) {
                isPalindrome = true;
                counter++;
            } else {
                isPalindrome = false;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        try {

            BufferedReader palReader = new BufferedReader(new FileReader("/Users/robeilaregawi/Desktop/CS203Course/src/Lab_6_/Lab_6/File/WordBuff"));
            String patString = palReader.readLine();

            String[] palArray = patString.split(", ");

            System.out.println(reverseArray(palArray));
            palReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
