import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String word = getRandomWord();
        System.out.println(word);
        for(int index=0;  index<word.length();index++){

        }
    }
    public static String getRandomWord(){
        String[] words = {"comunicar","roto","maravilha","milagroso","olhar","cadeira","lugares","escada","janela","cabelo"};
        Random random = new Random();
        int randomNumber = random.nextInt(0,11);
        return words[randomNumber];
    }
}
