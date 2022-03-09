import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class HelloWorld {
    public static void main (String[] args){

        // read files passed from the arguments
        for (int i = 0; i <= 1; i++){
            try{
                System.out.println("From java program, reading file: " + i);
                
                Scanner input = new Scanner(new File(args[i]));
                
                while (input.hasNextLine()) {
                    System.out.println(input.nextLine());
                }
            } catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }

        // read input from the directed data from the script
        Scanner reader = new Scanner(System.in);

        System.out.print("First line from input.txt: ");
        String firstLine = reader.nextLine();
        System.out.println(firstLine);

        System.out.print("Second line from input.txt: ");
        String secondLine = reader.nextLine();
        System.out.println(secondLine);

        System.out.print("Third line from input.txt: ");
        String thirdLine = reader.nextLine();
        System.out.println(thirdLine);

    }
}