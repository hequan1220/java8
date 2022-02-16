package com.example.java8.lamda.designMode.adapterPattern;

public class Mp3Palyer implements AdvancedMediaPlayer{
    @Override
    public void playChinaVideo() {
        System.out.println("mp3 播放国产神剧");
    }

    @Override
    public void playAmericaVideo() {
        System.out.println("mp3 播放美剧");
    }
}
