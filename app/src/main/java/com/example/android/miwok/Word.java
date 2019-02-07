package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mPicture = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudio;

    public Word(String defaultTranslation, String miwokTranslation, int audio){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudio = audio;
    }

    public Word(String defaultTranslation, String miwokTranslation, int picture, int audio){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mPicture = picture;
        mAudio = audio;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getPicture() { return mPicture; }

    public boolean hasImage(){
        return mPicture != NO_IMAGE_PROVIDED;
    }

    public int getAudio() { return mAudio; }
}