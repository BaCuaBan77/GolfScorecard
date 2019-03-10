package com.example.longle.golfscorecard;

public class Hole {
    private String mLabel;
    private int mStrokeCount;

    public Hole(String label, int strokeCount){
        mLabel = label;
        mStrokeCount = strokeCount;
    }

    public String getmLabel() {
        return mLabel;
    }

    public void setmLabel(String mLabel) {
        this.mLabel = mLabel;
    }

    public int getmStrokeCount() {
        return mStrokeCount;
    }

    public void setmStrokeCount(int mStrokeCount) {
        this.mStrokeCount = mStrokeCount;
    }
}
