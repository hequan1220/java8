package com.example.java8.lamda.designMode.adapterPattern;

import org.apache.commons.lang3.StringUtils;

public class MediaAdapter implements MediaPlayer{
    protected static final String china = "china";
    protected static final String america = "america";
    protected static final String mp3 = "mp3";
    protected static final String mp4 = "mp4";
    private AdvancedMediaPlayer advancedMediaPlayer;

    public void setAdvancedMediaPlayer(String type){
        if (StringUtils.equals(type, mp3)) {
            advancedMediaPlayer = new Mp3Palyer();
        } else if (StringUtils.equals(type, mp4)) {
            advancedMediaPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String type,String fileName) {
        if (StringUtils.equals(fileName, china)) {
            advancedMediaPlayer.playChinaVideo();
        } else if (StringUtils.equals(fileName, america)) {
            advancedMediaPlayer.playAmericaVideo();
        }
    }
}
