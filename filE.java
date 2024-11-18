
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class filE {

    public static void main(String[] args) {
        File Dafile = new File("desma.txt");
        try {
            Scanner input = new Scanner(Dafile);
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found ");
            System.exit(1);
        }


        

        if(Dafile.exists()){
            System.out.println("File name = "+Dafile.getName());
            System.out.println("file location = "+Dafile.getAbsolutePath());
            System.out.println("file read = "+Dafile.canRead());
            System.out.println("File can be write " +Dafile.canRead());
            System.out.println("File can be execued = "+Dafile.canExecute());
        }
        
    }
}
