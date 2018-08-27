/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gwcunningham
 */
public class LAB2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            String [] records;
            records = new String [100];
            Scanner reader = new Scanner(new File(args[0]));
            int currentIndex = 0;
            while (reader.hasNext()) {
                String[] line = reader.nextLine().split(",");
                
                String firstName = line[0];
                String lastName = line[1];
                String age = line[2];
                String gender = line[3];
                String phoneNumber = line[4];
                String email = line[5];
                records[currentIndex] = String.format("%-20s%-20s%-20s%-20s%-20s%-10s", firstName, lastName, age, gender, phoneNumber, email);
                System.out.println(records[currentIndex]);
                currentIndex++;
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


