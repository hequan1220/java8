package com.example.java8.lamda.designMode.adapterPattern;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playChinaVideo() {
        System.out.println("mp4 播放国产神剧");
    }

    @Override
    public void playAmericaVideo() {
        System.out.println("mp4 播放美剧");
    }
}
