package com.wxy.learn.design.structure.adapter.learn.adapee;

import com.wxy.learn.design.structure.adapter.learn.target.AdvancedMediaPlayer;

/**
 * vlc播放类
 * 源(Adapee)角色
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
