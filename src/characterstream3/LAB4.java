package characterstream3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB4 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data.txt");
            Scanner input = new Scanner(file);
            System.out.println();
            int age = input.nextInt();
            System.out.println(age);
            System.out.println(input.nextDouble());
            System.out.println(input.nextDouble());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
