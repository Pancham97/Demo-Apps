package com.example.android.quakereport;

/**
 * Created by panchamkhaitan on 22/07/17.
 */
public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mDateInMilliseconds;
    private String mURL;

    Earthquake(double magnitude, String location, long date, String URL) {
        mMagnitude = magnitude;
        mLocation = location;
        mDateInMilliseconds = date;
        mURL = URL;
    }

    public double getmMagnitude() { return mMagnitude; }

    public String getmLocation() { return mLocation; }

    public long getmDateInMilliseconds() { return  mDateInMilliseconds; }

    public String getmURL() { return mURL; }
}
