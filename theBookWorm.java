import java.util.Scanner;
public class theBookWorm{

    public static boolean palindrome(String Word){
        String rev = "";
        for(int i=0 ; i<Word.length() ; i++){
            rev = rev + Word.charAt(Word.length()-1-i);
        }if(rev.equals(Word)){
            return true;
        }return false;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String ShortestWord = "";
        String temp;
        System.out.print("Enter the Number Of Words : ");
        int numberOfWord = scanner.nextInt();
        String[] names = new String[numberOfWord];
        System.out.println("-- Enter the Word --");
        for(int i=0 ; i<numberOfWord ; i++){
            System.out.print((i+1)+". ");
            names[i] = scanner.next();
        }
        for(String Word : names){
            if(ShortestWord==""){
                ShortestWord = Word;
            }if(ShortestWord.length()>Word.length()){
                ShortestWord = Word;
            }
        }System.out.println("The Shortest Word is : "+ShortestWord);
        System.out.print("Enter a Word to search : ");
        String word = scanner.next();
        boolean found = false;
        for(String Words : names){
            if(Words.equalsIgnoreCase(word)){
                found = true;
            }
        }if(found){
            System.out.println("Word Found in List "+word);
        }else{
            System.out.println("Word Not Found !!");
        }
        for(int i=0 ; i<numberOfWord ; i++){
            for(int j=i+1 ; j<numberOfWord ; j++){
                if(names[i].compareTo(names[j]) > 0){
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }System.out.println("The Sorted Array is\n---------------------");
        for(int i=0 ; i<numberOfWord ; i++){
            System.out.println((i+1)+".\t"+names[i]);
        }
        System.out.println("-- The Plindrome Check in List --");
        int count=0;
        for(String palin : names){
            if(palindrome(palin)){
                System.out.println(palin+" Is Palindrome .");
                count++;
            }
        }System.out.println(count+" palindrome is Found.");
    }
}