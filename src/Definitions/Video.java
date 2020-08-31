/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 8/29/2020
 *   Time: 11:56 AM
 *   File: Video.java
 */

package Definitions;
public class Video {
    // Creating Definition Class
    //Rules:
    //1.Always set the visibility modifier of fields to private unless otherwise specify it.
    //2.Always set the acess modifier of fields to non-static unless otherwise speicfy it.
    private String videoName;
    private int rating;
    private boolean checkout;

    public void setRating(int rating) {
        this.rating = rating;

    }

    public void isCheckout(boolean checkout) {
        this.checkout = checkout;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;

    }

    public int getRating() {
        return rating;
    }

    public boolean getCheckout() {
        return checkout;
    }
}