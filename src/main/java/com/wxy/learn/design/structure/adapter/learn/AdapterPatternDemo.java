package com.wxy.learn.design.structure.adapter.learn;

import com.wxy.learn.design.structure.adapter.learn.adapee.AudioPlayer;

/**
 * 使用audioPlayer播放不同的音屏
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
