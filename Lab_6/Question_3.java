package Lab_6_.Lab_6;

import java.io.BufferedReader;
import java.io.FileReader;

public class Question_3 {
    public static void main(String[] args) {

        try{

        BufferedReader bufreader = new BufferedReader(new FileReader("/Users/robeilaregawi/Desktop/CS203Course/src/Lab_6_/Lab_6/File/doubleString"));
        double sum = 0.0;
        double average = 0.0;
        int counter = 0;

        while(true){
            String s = bufreader.readLine();

            if(s == null) {
                break;
            }
            sum += Double.parseDouble(s);
            counter++;
        }
        average = sum / counter;
        System.out.println(average);
    }catch(Exception e){
            e.printStackTrace();
        }
    }
}

