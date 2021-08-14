import java.util.Scanner;

public class PracticeDiffMethod {
    public static int numberOfWord;
    public static String[] names = new String[numberOfWord];
    public static Scanner scanner = new Scanner(System.in);


    public static void userInput(){
        System.out.print("Enter the Number Of Words : ");
        numberOfWord = scanner.nextInt();
        System.out.println("-- Enter the Word --");
        for(int i=0 ; i<numberOfWord ; i++){
            System.out.print((i+1)+". ");
            names[i] = scanner.next();
        }
    }



    public static void main(String[] args) {
        userInput();
    }
    
}
}
