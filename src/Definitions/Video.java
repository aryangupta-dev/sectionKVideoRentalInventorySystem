/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 8/29/2020
 *   Time: 11:56 AM
 *   File: Video.java
 */

package Definitions;
public class Video {

    private String videoName;
    private int rating;
    private boolean checkout;

    public Video(String videoName, int rating, boolean checkout) {
        this.videoName = videoName;
        this.rating = rating;
        this.checkout = checkout;
    }

    public String getVideoName() {
        return videoName;
    }

    public int getRating() {
        return rating;
    }

    public boolean getCheckout() {
        return checkout;
    }

    public String toString() {
        return "Videoname : " + getVideoName() + "  Rating : " + getRating() + "  Checkout : " + getCheckout() + " .";
    }
}