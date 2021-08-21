package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
    String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

    Scanner input = new Scanner(System.in);
    System.out.print("Enter search term: ");
    String query = input.nextLine();
    if(alice.toLowerCase().contains(query.toLowerCase())){
        System.out.println("Sentence contains query!");
        //index of query within alice
        System.out.println("Index of query: "+alice.indexOf(query));
        //alice length
        System.out.println("Sentence length: "+alice.length());
        //query length
        System.out.println("Query length: "+query.length());
        System.out.println("REMOVING QUERY FROM SENTENCE....");
        //remove word
        String revisedSentence = alice.replaceAll(query,"");
        System.out.println(revisedSentence);

    }
    else{
        System.out.println("false");
    }
    }
}
