/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 9/2/2020
 *   Time: 3:32 PM
 *   File: VideoStore.java
 */

package Definitions;

import java.util.Arrays;

public class VideoStore {
    private Video[] store;
    //getter
    public Video[] getStore() {
        return store.clone();//return the copy of the array.
    }
    //cunstructor

    public VideoStore(Video[] videos) {
        this.store = videos;
    }


    //setter
    public void setStore(Video[] store) {
        this.store = store;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoStore that = (VideoStore) o;
        return Arrays.equals(store, that.store);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(store);
    }

    @Override
    public String toString() {
        return Arrays.toString(store);
    }

    /**
     * This method is to add the videoname to the store.
     * @param name is for the video to be adden.
     * */
    public void addVideo(String name) {
        System.out.println("\"" + name + "\" is now added");
    }

    /**
     * This method is for renting the video.
     *
     * @param name of the rental video.
     */
    public void doCheckout(String name) {
        System.out.println("Thank you for renting the video " + "\"" + name + "\"");
    }

    /**
     * This method is for returning the video that  the customer rented.
     *
     * @param name is for the video that customer is returning.
     */
    public void doReturn(String name) {
        System.out.println("Thank you for returning the video" + "\"" + name + "\"");
    }

    /**
     * This method is for setting the new value of the rating.
     *
     * @param name   which video rating is given.
     * @param rating rating of the video in int.
     */
    public void receiveRating(String name, int rating) {
        System.out.println("The name of the video  " + "\"" + name + "\"" + "  rating " + rating);
    }

    /**
     * This method will print all the elements in the invetory.
     */
    public void listInventory() {
        for (Video video : this.store) {
            System.out.println(video);
        }

    }

}