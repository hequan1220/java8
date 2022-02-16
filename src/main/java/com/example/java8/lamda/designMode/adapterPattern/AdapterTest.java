package com.example.java8.lamda.designMode.adapterPattern;

public class AdapterTest {
    public static void main(String[] args) {
        RealMediaPlayer realMediaPlayer = new RealMediaPlayer();
        realMediaPlayer.play(MediaAdapter.mp3,MediaAdapter.china);
        realMediaPlayer.play(MediaAdapter.mp4,MediaAdapter.america);
    }
}
