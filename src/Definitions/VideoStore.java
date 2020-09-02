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

    //cunstructor
    public VideoStore() {
        this.store = new Video[5];
    }

    public Video[] getStore() {
        return store.clone();//return the copy of the array.
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

    /*
     * This method is to add the videoname to the store.
     * @param name is for the video to be adden.
     * */
    public void addVideo(String name) {
        System.out.println("\"" + name + "\" is now added");
    }

}