package com.example.java8.lamda.designMode.adapterPattern;

public class RealMediaPlayer implements MediaPlayer{
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String type, String fileName) {
        mediaAdapter = new MediaAdapter();
        mediaAdapter.setAdvancedMediaPlayer(type);
        mediaAdapter.play(type, fileName);
    }
}
