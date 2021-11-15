package Lab_6_.Lab_6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Question_1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner userInput = new Scanner(System.in);

        ArrayList<String> boysName = new ArrayList<>();
        ArrayList<String> girlsName = new ArrayList<>();


        //reading the boys names form the files
        try {
            BufferedReader boysfile = new BufferedReader(new FileReader("/Users/robeilaregawi/Desktop/CS203Course/src/Lab_6_/Lab_6/File/boynames.txt"));
            String boys;
            while ((boys = boysfile.readLine()) != null) {
                boysName.add(boys);
            }

            //closing boys reader
            boysfile.close();

        } catch(FileNotFoundException f){
            f.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //reading girls names from files
        try {
            BufferedReader girlsfile = new BufferedReader(new FileReader("/Users/robeilaregawi/Desktop/CS203Course/src/Lab_6_/Lab_6/File/girlnames.txt"));
            String girls;

            while((girls = girlsfile.readLine()) != null){
                girlsName.add(girls);
            }
            //closing girl reader
            girlsfile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Please enter name");
        String userGivenname = userInput.nextLine();
        //searching the given name from the arrays
        boolean foundGirlName = false;
        Iterator<String> Girliterate = girlsName.iterator();
        String currentGirlName = "";
        String girlRank = "";
        int girlPosition = 0;

        //iterating to find girl names
        while(Girliterate.hasNext() == true){
            girlPosition  += 1;
            currentGirlName = (String) Girliterate.next();
            girlRank = currentGirlName.substring(currentGirlName.indexOf(" ") +1);
            currentGirlName = currentGirlName.substring(0, currentGirlName.indexOf(" "));

            if(currentGirlName.equalsIgnoreCase(userGivenname)){
                foundGirlName = true;
                break;
            }
        }

        //getting the name postion
        if(foundGirlName == false){
            girlPosition  = 0;
        }
        if(girlPosition  != 0){
            System.out.println(userGivenname+ " is ranked "+ girlPosition  + " in 2003 " + Integer.parseInt(girlRank)+ " names were used.");
        }
        //searching names in boys files
        boolean findBoyName = false;
        Iterator<String> boyIterate = boysName.iterator();
        String currentBoysName = "";
        String boysRank = "";
        int boysPosition = 0;

        //iterating to find girl names
        while(boyIterate.hasNext() == true){

            boysPosition = boysPosition + 1;
            currentBoysName = (String) boyIterate.next();
            boysRank = currentBoysName.substring(0,currentBoysName.indexOf(" "));

            if(currentBoysName.equalsIgnoreCase(userGivenname)){
                findBoyName = true;
                break;
            }
        }
        //getting the position
        if(findBoyName == false){
            boysPosition = 0;
        }
        if(boysPosition != 0){
            System.out.println(userGivenname + " is ranked " + boysPosition +"in 2003 "+Integer.parseInt(boysRank) +  "names were used");
        } else{
            System.out.println(userGivenname +  " is not ranked among the top names.");
        }

    }
}
