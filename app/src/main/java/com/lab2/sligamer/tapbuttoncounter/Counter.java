package com.lab2.sligamer.tapbuttoncounter;

/**
 * Created by Justin Freres on 1/27/2018.
 * Model for TapButtonCounter
 */

class Counter {
    private int mCount;

    public Counter(){
        mCount = 0;
    }

    public void addCount() {
        mCount++;
    }

    public Integer getCount(){
        return  mCount;
    }
}
