package com.example.pratik.masterrecyclerview;

public class Items {
    int mImage;
    String mTopic,mInfo;

    public Items(int image, String topic, String info){
        mImage = image;
        mTopic = topic;
        mInfo = info;
    }

    public int getmImage() {
        return mImage;
    }

    public String getmTopic() {
        return mTopic;
    }

    public String getmInfo() {
        return mInfo;
    }
}
