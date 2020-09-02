/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 8/29/2020
 *   Time: 11:48 AM
 *   File: Main.java
 */

package execution;

import java.util.Scanner;

public class VideoLauncher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int customerInput;
        do {
            System.out.println("MAIN MENU");
            System.out.println("=========");
            System.out.println("1.Add Videos");
            System.out.println("2.Check Out Videos");
            System.out.println("3.Return Video");
            System.out.println("4.Recieve Rating");
            System.out.println("5.List Inventory");
            System.out.println("6.Exit");
            System.out.println("Enter your choice (1...6):");
            customerInput = sc.nextInt();
        } while (false);
        sc.close();


    }
}