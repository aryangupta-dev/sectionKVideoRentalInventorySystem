/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 8/29/2020
 *   Time: 11:56 AM
 *   File: Video.java
 */

package Definitions;

import java.util.Objects;

public class Video {

    private String videoName;
    private int rating;
    private boolean checkout;

    public Video(String videoName) {
        this.videoName = videoName;
        this.rating = 4;
        this.checkout = true;
    }

    /*
     * This method is for renting the video to the customer.
     * */
    public void doCheckout() {
        System.out.println("Thank you for renting" + getVideoName() + ".");
    }

    /*
     *This method is to get the return video from customer.
     *  */
    public void doReturn() {
        System.out.println("Thank you for returning the video" + getVideoName() + ".");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return rating == video.rating &&
                checkout == video.checkout &&
                Objects.equals(videoName, video.videoName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoName, rating, checkout);
    }

    public String toString() {
        return "Videoname : " + getVideoName() + "  Rating : " + getRating() + "    Checkout : " + getCheckout() + " .";
    }
}