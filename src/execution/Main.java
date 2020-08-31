/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 8/29/2020
 *   Time: 11:48 AM
 *   File: Main.java
 */

package execution;
import Definitions.Video;

public class Main {
    public static void main(String[] args) {
        Video video = new Video();
        video.setVideoName("Sooryavansham");
        video.setRating(4);
        video.isCheckout(true);
        System.out.println(
                "Video Name :" + video.getVideoName() + " ," + "Rating :" + video.getRating() + " ," + "Avaliable :" + video.getCheckout() + "."
        );

    }
}