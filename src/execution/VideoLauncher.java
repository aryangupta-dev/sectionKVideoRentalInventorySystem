/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 8/29/2020
 *   Time: 11:48 AM
 *   File: Main.java
 */

package execution;

import Definitions.Video;
import Definitions.VideoStore;

import java.util.Scanner;

public class VideoLauncher {
    private static final int ADD_VIDEO = 1;
    private static final int CHECK_OUT_VIDEOS = 2;
    private static final int RETURN_VIDEO = 3;
    private static final int RECIEVE_RATING = 4;
    private static final int LIST_INVENTORY = 5;
    private static final int EXIT = 6;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int customerInput;
        String name;
        int rating;
        System.out.println("Enter the no of movies:");
        Video[] videos = new Video[sc.nextInt()];
        sc.nextLine();
        System.out.println("Enter the movies name:");
        for (int i = 0; i < videos.length; i++) {

            videos[i] = new Video(sc.nextLine());
        }
        VideoStore myVideoStore = new VideoStore(videos);
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
            switch (customerInput) {
                case ADD_VIDEO:
                    System.out.println("Enter the video to be added");
                    sc.nextLine();
                    name = sc.nextLine();
                    myVideoStore.addVideo(name);
                    break;
                case CHECK_OUT_VIDEOS:
                    System.out.println("Enter the video to be checkout:");
                    sc.nextLine();
                    name = sc.nextLine();
                    myVideoStore.doCheckout(name);
                    break;
                case RETURN_VIDEO:
                    System.out.println("Enter the video to be return:");
                    sc.nextLine();
                    name = sc.nextLine();
                    myVideoStore.doReturn(name);
                    break;
                case RECIEVE_RATING:
                    System.out.println("Enter the video to be rated:");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("enter the rating of the video");
                    rating = sc.nextInt();
                    myVideoStore.receiveRating(name, rating);
                    break;
                case LIST_INVENTORY:
                    myVideoStore.listInventory();
                    break;
                default:
                    break;
            }
        } while (customerInput != EXIT);
        sc.close();


    }
}