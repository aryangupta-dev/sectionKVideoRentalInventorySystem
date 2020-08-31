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