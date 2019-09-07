package com.wxy.learn.design.structure.adapter.learn.target;


/**
 * vlc播放类
 * 目标角色实现类
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
