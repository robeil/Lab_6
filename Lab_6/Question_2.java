package Lab_6_.Lab_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Question_2 {

    public static void main(String[] args) {

        int counter = 0;
        try {
            BufferedReader bufreader = new BufferedReader(new FileReader("/Users/robeilaregawi/Desktop/CS203Course/src/Lab_6_/Lab_6/File/doubleString"));
            String s = bufreader.readLine();
            String[] arr = s.split(" ");

            for (int i = 0; i < arr.length; i++) {

                if ((Integer.parseInt(arr[i]) == 10)) {
                    counter++;
                }
            }
            System.out.println(counter);
            System.out.println(s + "");
            bufreader.close();
        } catch (FileNotFoundException e) {
            System.out.println("file was not found");
            System.out.println("or  could not be opened");
        } catch (IOException e) {
            System.out.println("error reading from number.txt");
        }
    }
}

