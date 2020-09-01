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
        Video video = new Video("Sooryavansham", 4, true);

        System.out.println(

                video.toString()
        );
    }
}