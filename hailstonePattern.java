
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nafea8846
 */
public class hailstonePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The Hailstone Pattern");
        System.out.print("Type a number: ");
        int startNum = input.nextInt();
        while (startNum != 1) {
            //sets startNumber to a calulated value depending on if its even or odd.
            if (startNum % 2 == 0) {
                startNum = startNum / 2;
            } else {
                startNum = 3 * startNum + 1;
            }
            System.out.println(startNum);
        }
    }

}
