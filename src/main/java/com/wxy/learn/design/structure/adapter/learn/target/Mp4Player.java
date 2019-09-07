package com.wxy.learn.design.structure.adapter.learn.target;

/**
 * Mp4播放类
 * 目标角色实现类
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}