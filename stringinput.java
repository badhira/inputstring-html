import java.util.*;

class Program {
    public static void main(String[] args) {

        // scanner class
        Scanner inputString = new Scanner(System.in);

        // to output and input the datas from the user
        System.out.println("Enter a Sentence(any English sentence)");
        String sentence = inputString.nextLine();
        System.out.println("Enter a Letter(any letter from A to Z)");
        String letter = inputString.nextLine();
        // finding the index position of the letter in the sentence
        int index = sentence.indexOf(letter);
        // checking the letter present in the sentence or not.
        // if letter doesnt present if block get execute.otherwise else condition which
        // print the substring of the given sentence
        if (index == -1) {
            System.out.println("The letter does not exist in the sentence");
        } else {
            System.out.println(sentence.substring(index + 1));
        }
        inputString.close();

    }
}