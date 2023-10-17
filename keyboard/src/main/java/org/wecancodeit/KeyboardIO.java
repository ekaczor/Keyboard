package org.wecancodeit;

import java.util.Scanner;

import javax.swing.tree.ExpandVetoException;

public class KeyboardIO {
    private Scanner input;

    public KeyboardIO() {
        input = new Scanner(System.in);
    }

    public KeyboardIO(Scanner input) {
        this.input = input;
    }

    public Integer getInteger() {
        Integer returnValue = 0;
        while (true) {
            String keys = "";
            try {
                System.out.print("Enter a value: ");
                keys = input.nextLine();
                returnValue = Integer.parseInt(keys);
                break;
            } catch (NumberFormatException ne) {
                System.out.println("Invalid number");
            } catch (Exception ex) {
                throw ex;
            }
        }
        return returnValue;
    }

}
