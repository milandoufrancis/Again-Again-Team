/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.againagain.view;

import again.again.AgainAgain;
import java.io.PrintWriter;

/**
 *
 * @author My Laptop
 */
public class ErrorView {
    private static PrintWriter console = AgainAgain.getOutFile();
    private static PrintWriter log = AgainAgain.getLogFile();
    
    public static void display(String className, String errorMessage) {
        console.println(
                "\n--- ERROR -----------------------------------"
                + "\n" + errorMessage
                + "\n-------------------------------------------");
        log.printf("%n%n%s", className + " - " + errorMessage);
    }
    
}
