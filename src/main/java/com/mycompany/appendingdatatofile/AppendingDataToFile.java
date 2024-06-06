/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appendingdatatofile;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author MKAY
 */
public class AppendingDataToFile {

    public static void main(String[] args)throws IOException {
        int numberOfCars;
        String nameOfFile = "";
        String namesOfCars;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the number of cars: ");
        numberOfCars = keyboard.nextInt();
               
        keyboard.nextLine();
                
        System.out.println("Enter the name of file: ");
        nameOfFile = keyboard.nextLine();
        
        FileWriter outputfile = new FileWriter(nameOfFile, true);
        PrintWriter printoutputfile = new PrintWriter(outputfile);
        
        
        for(int i = 1; i <= numberOfCars; i++)
        {
            System.out.println("Enter the name of car " + i + " : ");
            namesOfCars = keyboard.nextLine();
            
            printoutputfile.println(namesOfCars);
        }
        
        outputfile.close();
        
    }
}
