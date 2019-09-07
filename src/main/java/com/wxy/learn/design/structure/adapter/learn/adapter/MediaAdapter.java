package com.wxy.learn.design.structure.adapter.learn.adapter;

import com.wxy.learn.design.structure.adapter.learn.target.AdvancedMediaPlayer;
import com.wxy.learn.design.structure.adapter.learn.adapee.MediaPlayer;
import com.wxy.learn.design.structure.adapter.learn.target.Mp4Player;
import com.wxy.learn.design.structure.adapter.learn.target.VlcPlayer;

/**
 * 普通播放器适配类
 *
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
